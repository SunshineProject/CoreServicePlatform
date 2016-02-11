

/**
 * RemoteUserStoreManagerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.wso2.carbon.um.ws.service;

    /*
     *  RemoteUserStoreManagerService java interface
     */

    public interface RemoteUserStoreManagerService {
          

        /**
          * Auto generated method signature
          * 
                    * @param isExistingRole
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.IsExistingRoleResponse isExistingRole(

                        org.wso2.carbon.um.ws.service.IsExistingRole isExistingRole)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  setUserClaimValues(
         org.wso2.carbon.um.ws.service.SetUserClaimValues setUserClaimValues

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserClaimValuesForClaims
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse getUserClaimValuesForClaims(

                        org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaims getUserClaimValuesForClaims)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  deleteUser(
         org.wso2.carbon.um.ws.service.DeleteUser deleteUser

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  updateRoleListOfUser(
         org.wso2.carbon.um.ws.service.UpdateRoleListOfUser updateRoleListOfUser

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  addRole(
         org.wso2.carbon.um.ws.service.AddRole addRole

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isExistingUser
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.IsExistingUserResponse isExistingUser(

                        org.wso2.carbon.um.ws.service.IsExistingUser isExistingUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  addUser(
         org.wso2.carbon.um.ws.service.AddUser addUser

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAllProfileNames
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse getAllProfileNames(

                        org.wso2.carbon.um.ws.service.GetAllProfileNames getAllProfileNames)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRoleNames
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetRoleNamesResponse getRoleNames(

                        org.wso2.carbon.um.ws.service.GetRoleNames getRoleNames)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserList
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetUserListResponse getUserList(

                        org.wso2.carbon.um.ws.service.GetUserList getUserList)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  deleteUserClaimValue(
         org.wso2.carbon.um.ws.service.DeleteUserClaimValue deleteUserClaimValue

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getProfileNames
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetProfileNamesResponse getProfileNames(

                        org.wso2.carbon.um.ws.service.GetProfileNames getProfileNames)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  updateRoleName(
         org.wso2.carbon.um.ws.service.UpdateRoleName updateRoleName

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  updateUserListOfRole(
         org.wso2.carbon.um.ws.service.UpdateUserListOfRole updateUserListOfRole

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  addUserClaimValue(
         org.wso2.carbon.um.ws.service.AddUserClaimValue addUserClaimValue

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getHybridRoles
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetHybridRolesResponse getHybridRoles(

                        org.wso2.carbon.um.ws.service.GetHybridRoles getHybridRoles)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  deleteUserClaimValues(
         org.wso2.carbon.um.ws.service.DeleteUserClaimValues deleteUserClaimValues

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param authenticate
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.AuthenticateResponse authenticate(

                        org.wso2.carbon.um.ws.service.Authenticate authenticate)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserClaimValues
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse getUserClaimValues(

                        org.wso2.carbon.um.ws.service.GetUserClaimValues getUserClaimValues)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserId
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetUserIdResponse getUserId(

                        org.wso2.carbon.um.ws.service.GetUserId getUserId)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  deleteRole(
         org.wso2.carbon.um.ws.service.DeleteRole deleteRole

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserListOfRole
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse getUserListOfRole(

                        org.wso2.carbon.um.ws.service.GetUserListOfRole getUserListOfRole)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRoleListOfUser
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse getRoleListOfUser(

                        org.wso2.carbon.um.ws.service.GetRoleListOfUser getRoleListOfUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  addUserClaimValues(
         org.wso2.carbon.um.ws.service.AddUserClaimValues addUserClaimValues

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  updateCredential(
         org.wso2.carbon.um.ws.service.UpdateCredential updateCredential

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  setUserClaimValue(
         org.wso2.carbon.um.ws.service.SetUserClaimValue setUserClaimValue

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getProperties
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetPropertiesResponse getProperties(

                        org.wso2.carbon.um.ws.service.GetProperties getProperties)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isReadOnly
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.IsReadOnlyResponse isReadOnly(

                        org.wso2.carbon.um.ws.service.IsReadOnly isReadOnly)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserClaimValue
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetUserClaimValueResponse getUserClaimValue(

                        org.wso2.carbon.um.ws.service.GetUserClaimValue getUserClaimValue)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getTenantIdofUser
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse getTenantIdofUser(

                        org.wso2.carbon.um.ws.service.GetTenantIdofUser getTenantIdofUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param listUsers
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.ListUsersResponse listUsers(

                        org.wso2.carbon.um.ws.service.ListUsers listUsers)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getPasswordExpirationTime
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse getPasswordExpirationTime(

                        org.wso2.carbon.um.ws.service.GetPasswordExpirationTime getPasswordExpirationTime)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */
        public void  updateCredentialByAdmin(
         org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin updateCredentialByAdmin

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getTenantId
                
             * @throws org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException : 
         */

         
                     public org.wso2.carbon.um.ws.service.GetTenantIdResponse getTenantId(

                        org.wso2.carbon.um.ws.service.GetTenantId getTenantId)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreExceptionException;

        

        
       //
       }
    