package it.sinergis.sunshinesecurity;

import it.sinergis.utils.Constant;

import java.rmi.RemoteException;

import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.wso2.carbon.um.ws.service.Authenticate;
import org.wso2.carbon.um.ws.service.AuthenticateResponse;
import org.wso2.carbon.um.ws.service.IsExistingUser;
import org.wso2.carbon.um.ws.service.IsExistingUserResponse;
import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceStub;
import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;
import org.wso2.carbon.user.mgt.UserAdminUserAdminException;

public class TestRemoteUserStore {
	public static void main(String args[]) throws RemoteException, UserAdminUserAdminException,
			RemoteUserStoreManagerServiceUserStoreExceptionException {
		
		HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
		auth.setUsername("admin");
		auth.setPassword(Constant.WSO2PSWD);
		
		RemoteUserStoreManagerServiceStub us = new RemoteUserStoreManagerServiceStub(
				"https://sunshine-security.nco.inet:9444/services/RemoteUserStoreManagerService");//(""); //	
		Options options = us._getServiceClient().getOptions();
		auth.setPreemptiveAuthentication(true);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		IsExistingUser ieu = new IsExistingUser();
		ieu.setUserName("enricodeguidi");
		IsExistingUserResponse ieur = us.isExistingUser(ieu);
		System.out.println(ieur.is_returnSpecified());
		
		Authenticate a = new Authenticate();
		a.setUserName("enricodeguidi3");
		a.setCredential("enricodeguidi");
		AuthenticateResponse r = us.authenticate(a);
		System.out.println(r.get_return());
		
	}
}
