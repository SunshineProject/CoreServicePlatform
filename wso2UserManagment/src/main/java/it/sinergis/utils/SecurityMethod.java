package it.sinergis.utils;

import it.sienrgis.exceptions.UserAlreadyExist;
import it.sienrgis.exceptions.UserNotFoundException;
import it.sinergis.classiMapping.NewUser;
import it.sinergis.classiMapping.User;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.security.SecureRandom;

import org.wso2.carbon.um.ws.service.AddUser;
import org.wso2.carbon.um.ws.service.Authenticate;
import org.wso2.carbon.um.ws.service.AuthenticateResponse;
import org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaims;
import org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse;
import org.wso2.carbon.um.ws.service.IsExistingUser;
import org.wso2.carbon.um.ws.service.IsExistingUserResponse;
import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceStub;
import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;
import org.wso2.carbon.um.ws.service.SetUserClaimValue;
import org.wso2.carbon.um.ws.service.UpdateCredential;
import org.wso2.carbon.user.mgt.UserAdminStub;
import org.wso2.carbon.user.mgt.UserAdminUserAdminException;
import org.wso2.carbon.user.mgt.common.xsd.ClaimValue;

import axis2.apache.org.xsd.ChangePassword;

public class SecurityMethod {
	public static User getAttribute(String userName) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException, UserNotFoundException {
		RemoteUserStoreManagerServiceStub rusm = Wso2Connection.getRemoteUserConnection();
		GetUserClaimValuesForClaims gucv = new GetUserClaimValuesForClaims();
		gucv.setUserName(userName);
		
		String claims[] = { Constant.CLAIMS_CATEGORIA, Constant.CLAIMS_CLASSE, Constant.CLAIMS_EMAIL,
				Constant.CLAIMS_PARTNER, Constant.CLAIMS_PILOT, Constant.CLAIMS_USER, Constant.CLAIMS_USERTYPE };
		
		gucv.setClaims(claims);
		GetUserClaimValuesForClaimsResponse gucvResponse = rusm.getUserClaimValuesForClaims(gucv);
		ClaimValue[] claimValues = gucvResponse.get_return();
		
		if (claimValues == null) {
			throw new UserNotFoundException();
		}
		User user = new User();
		for (ClaimValue cv : claimValues) {
			switch (cv.getClaimURI()) {
				case Constant.CLAIMS_CATEGORIA:
					user.setCategory(cv.getValue());
					break;
				case Constant.CLAIMS_CLASSE:
					user.setClasse(cv.getValue());
					break;
				case Constant.CLAIMS_EMAIL:
					user.setEmail(cv.getValue());
					break;
				case Constant.CLAIMS_PARTNER:
					user.setPartner(cv.getValue());
					break;
				case Constant.CLAIMS_PILOT:
					user.setPilot(cv.getValue());
					break;
				case Constant.CLAIMS_USER:
					user.setUsername(cv.getValue());
					break;
				case Constant.CLAIMS_USERTYPE:
					user.setUserType(cv.getValue());
					
				default:
					break;
			}
			
			System.out.println(cv.getValue());
		}
		
		System.out.println("End" + claims[0]);
		
		return user;
	}
	
	public static User createNewUser(NewUser newUser) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException, UserAlreadyExist, UserNotFoundException {
		RemoteUserStoreManagerServiceStub rusm = Wso2Connection.getRemoteUserConnection();
		/*
		 * Controllo che l'utente non esista già
		 */
		
		IsExistingUser iEU = new IsExistingUser();
		iEU.setUserName(newUser.getUserName());
		IsExistingUserResponse iEUResponse = rusm.isExistingUser(iEU);
		if (iEUResponse.get_return()) {
			throw new UserAlreadyExist();
			
		}
		/*
		 * creo i nuovi parametri
		 */
		
		AddUser aUV = new AddUser();
		aUV.setUserName(newUser.getUserName());
		aUV.setCredential(newUser.getPassword());
		aUV.setProfileName(newUser.getUserName());
		//set mail
		ClaimValue cv1 = new ClaimValue();
		cv1.setClaimURI(Constant.CLAIMS_EMAIL);
		cv1.setValue(newUser.getEmail());
		
		ClaimValue cv2 = new ClaimValue();
		cv1.setClaimURI(Constant.CLAIMS_USERTYPE);
		cv1.setValue("reader");
		//
		
		//set
		//ClaimValue cv2 = new ClaimValue();
		//cv1.setClaimURI(Constant.CLAIMS_EMAIL);cv1.setValue(newUser.getEmail());
		
		ClaimValue[] claimValues = { cv1 };
		aUV.setClaims(claimValues);
		aUV.setRequirePasswordChange(false);
		
		rusm.addUser(aUV);
		
		System.out.println("fine");
		
		return getAttribute(newUser.getUserName());
		
	}
	
	public static User authenticateUser(String userName, String password) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException, UserNotFoundException {
		userName = userName.trim();
		RemoteUserStoreManagerServiceStub rusm = Wso2Connection.getRemoteUserConnection();
		Authenticate aut = new Authenticate();
		aut.setUserName(userName);
		aut.setCredential(password);
		
		AuthenticateResponse autResponse = rusm.authenticate(aut);
		if (!autResponse.get_return()) {
			throw new UserNotFoundException();
		}
		return getAttribute(userName);
		
	}
	
	public static void changePassword(String userName, String newPassword, String oldPassword) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException {
		userName = userName.trim();
		
		RemoteUserStoreManagerServiceStub rusm = Wso2Connection.getRemoteUserConnection();
		
		UpdateCredential cp1 = new UpdateCredential();
		cp1.setUserName(userName);
		cp1.setNewCredential(newPassword);
		cp1.setOldCredential(oldPassword);
		rusm.updateCredential(cp1);
	}
	
	public static void changeEmail(String userName, String email) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException {
		
		userName = userName.trim();
		email = email.trim();
		RemoteUserStoreManagerServiceStub rusm = Wso2Connection.getRemoteUserConnection();
		
		SetUserClaimValue cp1 = new SetUserClaimValue();
		cp1.setUserName(userName);
		cp1.setClaimURI(Constant.CLAIMS_EMAIL);
		cp1.setClaimValue(email);
		rusm.setUserClaimValue(cp1);
	}
	
	public static void newPassword(String userName) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException, UserNotFoundException,
			UserAdminUserAdminException {
		userName = userName.trim();
		RemoteUserStoreManagerServiceStub rusm = Wso2Connection.getRemoteUserConnection();
		UserAdminStub us = Wso2Connection.getUserAdminConnection();
		
		IsExistingUser iEU = new IsExistingUser();
		iEU.setUserName(userName);
		IsExistingUserResponse iEUResponse = rusm.isExistingUser(iEU);
		if (!iEUResponse.get_return()) {
			throw new UserNotFoundException();
			
		}
		//genera password
		SecureRandom random = new SecureRandom();
		String psw = new BigInteger(130, random).toString(32);
		psw = psw.substring(8);
		
		//get
		ChangePassword cp1 = new ChangePassword();
		cp1.setUserName(userName);
		cp1.setNewPassword(psw);
		us.changePassword(cp1);
		
		//getattriute 
		User u = getAttribute(userName);
		System.out.println(u.getEmail());
		String msg = ("hi\t, this is yours new password: " + psw);
		
		SendMail.sendmail(msg, u.getEmail());
		
	}
	
	public static void main(String args[]) throws RemoteException,
			RemoteUserStoreManagerServiceUserStoreExceptionException, UserNotFoundException, UserAlreadyExist,
			UserAdminUserAdminException {
		//getAttribute("nandoiovine");
		//newPassword("enricodeguidi");
		
		NewUser newUser = new NewUser();
		newUser.setUserName("prova12");
		newUser.setEmail("prova11@12.it");
		newUser.setPassword("prova12");
		try {
			createNewUser(newUser);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
