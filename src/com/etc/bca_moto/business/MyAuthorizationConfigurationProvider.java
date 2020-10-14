
package com.etc.bca_moto.business;

import com.xdev.security.authorization.AuthorizationConfiguration;
import com.xdev.security.authorization.AuthorizationConfigurationProvider;
import com.xdev.security.authorization.sql.SQLAuthorizationConfigurationProvider;

public class MyAuthorizationConfigurationProvider implements AuthorizationConfigurationProvider {
	private static MyAuthorizationConfigurationProvider INSTANCE;

	public static MyAuthorizationConfigurationProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MyAuthorizationConfigurationProvider();
		}

		return INSTANCE;
	}

	private SQLAuthorizationConfigurationProvider provider;

	private MyAuthorizationConfigurationProvider() {
	}

	@Override
	public AuthorizationConfiguration provideConfiguration() {
		if (this.provider == null) {
			this.provider = new SQLAuthorizationConfigurationProvider(
					//"SELECT U.ID AS  USERS, AG.ID AS GROUPS FROM AUTH_USER  U JOIN AUTH_USER_GROUP_NM  UG ON U.ID = UG.USER_ID JOIN AUTH_GROUP  AG ON UG.GROUP_ID = AG.ID",
					//"SELECT RL.ID AS ROLE, RE.ID AS RESOURCE FROM AUTH_ROLE   RL JOIN AUTH_ROLE_RESOURCE_NM  RR ON RR.ROLE_ID = RL.ID JOIN AUTH_RESOURCE  RE ON RE.ID = RR.RESOURCE_ID");
					"SELECT   user_id,  group_id FROM  auth_user_group_nm",
					"SELECT  role_id, resource_id FROM auth_role_resource_nm");
		
		}

		return this.provider.provideConfiguration();
	}
}
