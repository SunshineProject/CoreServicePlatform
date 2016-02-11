package it.sinergis.rest;

import it.sienrgis.exceptions.UserNotFoundException;
import it.sinergis.classiMapping.UpdateEmail;
import it.sinergis.classiMapping.UpdatePassword;
import it.sinergis.classiMapping.User;
import it.sinergis.utils.SecurityMethod;

import java.rmi.RemoteException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

import com.sun.jersey.api.core.HttpContext;
import com.wordnik.swagger.annotations.Api;

@Path("logged")
@Api(value = "logged", description = "Operations for user that already make login ")
public class LoggedUser {
	private static Logger logger = Logger.getLogger(LoggedUser.class.getName());
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/changePasword1")
	public Response sayPlainTextHello(@Context HttpContext hsr) {
		
		System.out.println("utente");
		System.out.println(hsr.getRequest().getAbsolutePath());
		//return "service To ManageUser";
		return Response.ok().build();
	}
	
	/*
	 * @GET
	 * @Produces(MediaType.TEXT_PLAIN)
	 * @Path("/changePasword1/{utente}") public Response Response(@PathParam(value = "utente") String utente, @Context
	 * HttpServletRequest req,
	 * @Context SecurityContext sc) { req.getAuthType();; System.out.println("user" + utente);
	 * System.out.println("utente " + utente); //System.out.println("password" + password); return return
	 * Response.ok().build(); }
	 */
	@POST
	@Path("/changePasword/{user}")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json" })
	public Response changePasswordUtente(UpdatePassword password, @PathParam(value = "user") String utente,
			@Context HttpContext hsr) {
		System.out.println(utente);
		System.out.println(hsr.getRequest().getAbsolutePath());
		try {
			SecurityMethod.changePassword(utente, password.getNewPassword(), password.getOldPassword());
			return Response.ok().build();
		}
		catch (RemoteUserStoreManagerServiceUserStoreExceptionException e) {
			e.printStackTrace();
			logger.error("RemoteUserException:" + e);
			return Response.status(500).build();
		}
		catch (org.apache.axis2.AxisFault e) {
			e.printStackTrace();
			logger.error("RemoteUserException:" + e);
			//System.out.println(e.getFaultType());
			//System.out.println(e.getFaultAction());
			//System.out.println(e.getLocalizedMessage());
			//System.out.println(e.getMessage());
			return Response.status(400).entity(e.getMessage()).build();
		}
		catch (RemoteException e) {
			e.printStackTrace();
			logger.error("RemoteException:" + e);
			return Response.status(500).build();
		}
		
		catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception:" + e);
			return Response.status(500).build();
		}
	}
	
	@POST
	@Path("/changeEmail/{user}")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json" })
	public Response changeEmail(UpdateEmail email, @PathParam(value = "user") String utente) {
		try {
			SecurityMethod.changeEmail(utente, email.getEmail());
			return Response.ok().build();
		}
		catch (org.apache.axis2.AxisFault e) {
			e.printStackTrace();
			logger.error("RemoteUserException:" + e);
			//System.out.println(e.getFaultType());
			//System.out.println(e.getFaultAction());
			//System.out.println(e.getLocalizedMessage());
			//System.out.println(e.getMessage());
			return Response.status(400).entity(e.getMessage()).build();
		}
		catch (RemoteException e) {
			e.printStackTrace();
			logger.error("RemoteException:" + e);
			return Response.status(500).build();
		}
		catch (RemoteUserStoreManagerServiceUserStoreExceptionException e) {
			e.printStackTrace();
			logger.error("RemoteUserException:" + e);
			return Response.status(500).build();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception:" + e);
			return Response.status(500).build();
		}
	}
	
	@GET
	@Path("/getAttribute/{user}")
	@Produces({ "application/xml", "application/json" })
	@Consumes({ "application/xml", "application/json" })
	public Response getAttribute(@PathParam(value = "user") String user) {
		System.out.println("getAttriìeertr" + user);
		User myuser;
		try {
			myuser = SecurityMethod.getAttribute(user);
		}
		catch (org.apache.axis2.AxisFault e) {
			e.printStackTrace();
			logger.error("RemoteUserException:" + e);
			//System.out.println(e.getFaultType());
			//System.out.println(e.getFaultAction());
			//System.out.println(e.getLocalizedMessage());
			//System.out.println(e.getMessage());
			return Response.status(400).entity(e.getMessage()).build();
		}
		catch (RemoteException e) {
			e.printStackTrace();
			logger.error("RemoteException:" + e);
			return Response.status(500).build();
		}
		catch (RemoteUserStoreManagerServiceUserStoreExceptionException e) {
			e.printStackTrace();
			logger.error("RemoteUserException:" + e);
			
			return Response.status(500).build();
		}
		catch (UserNotFoundException e) {
			e.printStackTrace();
			logger.error("UserNotFoundException:" + e);
			return Response.status(400).build();
		}
		catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception:" + e);
			
			return Response.status(500).build();
		}
		return Response.ok(myuser).build();
	}
}
