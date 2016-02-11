package it.sinergis.utils;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceStub;
import org.wso2.carbon.user.mgt.UserAdminStub;

public class Wso2Connection {
	public static RemoteUserStoreManagerServiceStub getRemoteUserConnection() throws AxisFault {
		HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
		auth.setUsername(Constant.WSO2USER);
		auth.setPassword(Constant.WSO2PSWD);
		
		RemoteUserStoreManagerServiceStub us = new RemoteUserStoreManagerServiceStub(Constant.REMOTEUSER);
		Options options = us._getServiceClient().getOptions();
		auth.setPreemptiveAuthentication(true);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		return us;
	}
	
	public static UserAdminStub getUserAdminConnection() throws AxisFault {
		HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
		auth.setUsername(Constant.WSO2USER);
		auth.setPassword(Constant.WSO2PSWD);
		UserAdminStub us = new UserAdminStub(Constant.USERADMIN);
		Options options = us._getServiceClient().getOptions();
		auth.setPreemptiveAuthentication(true);
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		return us;
	}
}
