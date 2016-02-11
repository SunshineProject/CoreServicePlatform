package it.sinergis.rest;

import it.sienrgis.exceptions.UserAlreadyExist;
import it.sienrgis.exceptions.UserNotFoundException;
import it.sinergis.classiMapping.Login;
import it.sinergis.classiMapping.NewUser;
import it.sinergis.classiMapping.User;
import it.sinergis.utils.SecurityMethod;

import java.rmi.RemoteException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;
import org.wso2.carbon.user.mgt.UserAdminUserAdminException;

import com.wordnik.swagger.annotations.Api;

@Path("unLogged")
@Api(value = "unLogged", description = "Operations for user that does't make login ")
public class UnLoggedUser {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response sayPlainTextHello() {
		System.out.println("utente");
		//return "service To ManageUser";
		return Response.ok("unLogged").build();
	}
	
	@POST
	@Path("/createUser")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json" })
	public Response createUser(NewUser newUser) {
		System.out.println("utente");
		
		try {
			User user = SecurityMethod.createNewUser(newUser);
			return Response.ok(user).build();
		}
		catch (UserAlreadyExist e) {
			return Response.status(400).build();
		}
		catch (RemoteException | RemoteUserStoreManagerServiceUserStoreExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.status(500).build();
		}
		catch (Exception e2) {
			return Response.status(500).build();
		}
		
	}
	
	@POST
	@Path("/recoverPassword")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json" })
	public Response recoverEmail(Login user) {
		try {
			if (user.getUserName().trim().equalsIgnoreCase("admin")) {
				
				return Response.status(400).build();
			}
			SecurityMethod.newPassword(user.getUserName());
			return Response.ok().build();
		}
		catch (RemoteException e) {
			e.printStackTrace();
			
			return Response.status(500).build();
		}
		catch (RemoteUserStoreManagerServiceUserStoreExceptionException e) {
			e.printStackTrace();
			return Response.status(500).build();
		}
		catch (UserNotFoundException e) {
			e.printStackTrace();
			
			return Response.status(404).build();
		}
		catch (UserAdminUserAdminException e) {
			e.printStackTrace();
			
			return Response.status(500).build();
		}
	}
	
	@POST
	@Path("/validateUser")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json" })
	public Response validateCredential(Login login) {
		try {
			User user = SecurityMethod.authenticateUser(login.getUserName(), login.getPassword());
			return Response.ok(user).build();
		}
		
		catch (RemoteException | RemoteUserStoreManagerServiceUserStoreExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.status(500).build();
		}
		catch (UserNotFoundException e) {
			e.printStackTrace();
			return Response.status(400).build();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
			return Response.status(500).build();
		}
		
	}
	
}
