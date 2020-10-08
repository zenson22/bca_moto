package com.etc.bca_moto.authentication;

import java.util.List;

import com.xdev.dal.DAOs;
import com.xdev.security.authentication.AuthenticationFailedException;
import com.xdev.security.authentication.Authenticator;
import com.xdev.security.authentication.CredentialsUsernamePassword;
import com.xdev.security.authentication.jpa.HashStrategy;

/**
 * @author XDEV Software
 */
public class CustomerJPAAthenticator
		implements Authenticator<CredentialsUsernamePassword, CredentialsUsernamePassword> {

	private final Class<? extends CredentialsUsernamePassword> authenticationEntityType;
	private HashStrategy hashStrategy = new HashStrategy.MD5();

	/**
	 *
	 */
	public CustomerJPAAthenticator(final Class<? extends CredentialsUsernamePassword> authenticationEntityType) {
		this.authenticationEntityType = authenticationEntityType;
	}

	public final CredentialsUsernamePassword authenticate(final String username, final String password)
			throws AuthenticationFailedException {
		return this.authenticate(CredentialsUsernamePassword.New(username, password));
	}

	@Override
	public CredentialsUsernamePassword authenticate(final CredentialsUsernamePassword credentials)
			throws AuthenticationFailedException {
		return checkCredentials(credentials);
	}

	protected CredentialsUsernamePassword checkCredentials(final CredentialsUsernamePassword credentials)
			throws AuthenticationFailedException {
		final byte[] hashedPassword = this.hashStrategy.hashPassword(credentials.password());
		final String passwordHex = bytesToHex(hashedPassword);
		final List<? extends CredentialsUsernamePassword> entities = DAOs.getByEntityType(this.authenticationEntityType)
				.findAll();
		for (final Object object : entities) {
			final CredentialsUsernamePassword entity = (CredentialsUsernamePassword) object;
			if (entity.username().equals(credentials.username()) && passwordHex.equalsIgnoreCase(new String(entity.password()))) {
				return entity;
			}
		}

		throw new AuthenticationFailedException();
	}

	public HashStrategy getHashStrategy() {
		return this.hashStrategy;
	}
	
	public void setHashStrategy(final HashStrategy hashStrategy) {
		this.hashStrategy = hashStrategy;
	}
	
	private static final char[] HEX = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
										'a', 'b', 'c', 'd', 'e', 'f' };
	public static String bytesToHex(final byte[] bytes) {
	    final char[] hexChars = new char[bytes.length * 2];
	    int j = 0;
	    for (final byte aByte : bytes) {
	        hexChars[j++] = HEX[(aByte & 0xFF) >>> 4];
	        hexChars[j++] = HEX[(aByte & 0xFF) & 0x0F];
	    }
	    return new String(hexChars);
	}
}
