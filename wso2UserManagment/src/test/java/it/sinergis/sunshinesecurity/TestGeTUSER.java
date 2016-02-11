package it.sinergis.sunshinesecurity;

import it.sienrgis.exceptions.UserNotFoundException;
import it.sinergis.classiMapping.User;
import it.sinergis.utils.SecurityMethod;

import java.rmi.RemoteException;

import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

public class TestGeTUSER {
	public static void main(String[] args) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException, UserNotFoundException {
		User u = SecurityMethod.getAttribute("umbertodistaso");
		System.out.println(u.getPilot());
		System.out.println(u.getPilotCode());
	}
}
