package com.etc.bca_moto.authentication;

import static com.xdev.security.Utils.notNull;

import com.xdev.security.authentication.CredentialsUsernamePassword;


/**
 * Trivial username / password string value tuple.
 *
 * @author XDEV Software (TM)
 */
public interface CustomCredential {
	/**
	 * @return the username.
	 */
	public String username();

	/**
	 * @return the password.
	 */
	public String password();

	/**
	 * Wraps the passed username and password strings as a new
	 * {@link CredentialsUsernamePassword} instance.
	 *
	 * @param username
	 *            the username to be wrapped.
	 * @param password
	 *            the password to be wrapped.
	 * @return a new {@link CredentialsUsernamePassword} instance containing the
	 *         passed credential values.
	 */
	public static CustomCredential.ImplementationString New(final String username, final String password) {
		return new CustomCredential.ImplementationString(notNull(username), notNull(password));
	}

	public final class ImplementationString implements CustomCredential {
		///////////////////////////////////////////////////////////////////////////
		// instance fields //
		////////////////////

		final String username;
		final String password;

		///////////////////////////////////////////////////////////////////////////
		// constructors //
		/////////////////

		ImplementationString(final String username, final String password) {
			super();
			this.username = username;
			this.password = password;
		}

		///////////////////////////////////////////////////////////////////////////
		// override methods //
		/////////////////////

		@Override
		public String username() {
			return this.username;
		}

		@Override
		public String password() {
			return this.password;
		}

		@Override
		public String toString() {
			// intentionally don't give away the actual password.
			return this.username + " // (PWD length " + this.password.length() + ")";
		}

	}

}
