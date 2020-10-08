
package com.etc.bca_moto.business;

import com.etc.bca_moto.authentication.CustomerJPAAthenticator;
import com.etc.bca_moto.entities.AuthUser;
import com.xdev.security.authentication.Authenticator;
import com.xdev.security.authentication.AuthenticatorProvider;
import com.xdev.security.authentication.CredentialsUsernamePassword;
import com.xdev.security.authentication.jpa.HashStrategy;

public class MyAuthenticationProvider
		implements AuthenticatorProvider<CredentialsUsernamePassword, CredentialsUsernamePassword> {
	private static MyAuthenticationProvider INSTANCE;

	public static MyAuthenticationProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MyAuthenticationProvider();
		}

		return INSTANCE;
	}

	private final HashStrategy hashStrategy = new HashStrategy.MD5();
	private CustomerJPAAthenticator authenticator;

	private MyAuthenticationProvider() {
	}

	@Override
	public Authenticator<CredentialsUsernamePassword, CredentialsUsernamePassword> provideAuthenticator() {
		if (this.authenticator == null) {
			this.authenticator = new CustomerJPAAthenticator(AuthUser.class);
			this.authenticator.setHashStrategy(this.hashStrategy);
		}

		return this.authenticator;
	}

	public HashStrategy getHashStrategy() {
		return this.hashStrategy;
	}
}
