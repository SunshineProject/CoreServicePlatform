package it.sinergis.sunshinesecurity;

import it.sinergis.utils.Wso2Connection;

import java.rmi.RemoteException;

import org.wso2.carbon.user.mgt.UserAdminStub;
import org.wso2.carbon.user.mgt.UserAdminUserAdminException;

import axis2.apache.org.xsd.ChangePassword;

public class TestQualcosa {
	public static void main(String args[]) throws RemoteException, UserAdminUserAdminException {
		/*
		 * HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
		 * auth.setUsername("admin"); auth.setPassword(Constant.WSO2PSWD); // set if realm or domain is know
		 * options.setProperty(org.apache.axis2.transport.http.HTTPConstants.BASIC_AUTHENTICATE,auth); UserAdminStub us
		 * = new UserAdminStub("https://sunshine-security.nco.inet:9444/services/UserAdmin");//(""); // Options options
		 * = us._getServiceClient().getOptions(); auth.setPreemptiveAuthentication(true);
		 * options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		 */
		
		UserAdminStub us = Wso2Connection.getUserAdminConnection();
		
		//new UserAdminStub(new ConfigurationContext(null), "");
		ChangePassword cp1 = new ChangePassword();
		cp1.setUserName("enricodeguidi");
		cp1.setNewPassword("enricodeguidi");
		us.changePassword(cp1);
		
		/*
		 * ListUsers lu = new ListUsers(); lu.setFilter("*"); lu.setLimit(10000); ListUsersResponse laur =
		 * us.listUsers(lu); System.out.println(laur.get_return()[2]);
		 */
	}
}
