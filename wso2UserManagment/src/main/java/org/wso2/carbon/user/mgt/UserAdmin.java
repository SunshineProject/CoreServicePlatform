

/**
 * UserAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.wso2.carbon.user.mgt;

    /*
     *  UserAdmin java interface
     */

    public interface UserAdmin {
          

        /**
          * Auto generated method signature
          * 
                    * @param listUsers
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.ListUsersResponse listUsers(

                        axis2.apache.org.xsd.ListUsers listUsers)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  setRoleUIPermission(
         axis2.apache.org.xsd.SetRoleUIPermission setRoleUIPermission

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isSharedRolesEnabled
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.IsSharedRolesEnabledResponse isSharedRolesEnabled(

                        axis2.apache.org.xsd.IsSharedRolesEnabled isSharedRolesEnabled)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  addRemoveUsersOfRole(
         axis2.apache.org.xsd.AddRemoveUsersOfRole addRemoveUsersOfRole

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param changePasswordByUser
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public void changePasswordByUser(

                        axis2.apache.org.xsd.ChangePasswordByUser changePasswordByUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param addUser
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public void addUser(

                        axis2.apache.org.xsd.AddUser addUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param hasMultipleUserStores
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.HasMultipleUserStoresResponse hasMultipleUserStores(

                        axis2.apache.org.xsd.HasMultipleUserStores hasMultipleUserStores)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserRealmInfo
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetUserRealmInfoResponse getUserRealmInfo(

                        axis2.apache.org.xsd.GetUserRealmInfo getUserRealmInfo)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  updateRoleName(
         axis2.apache.org.xsd.UpdateRoleName updateRoleName

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRolesOfUser
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetRolesOfUserResponse getRolesOfUser(

                        axis2.apache.org.xsd.GetRolesOfUser getRolesOfUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param listAllUsers
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.ListAllUsersResponse listAllUsers(

                        axis2.apache.org.xsd.ListAllUsers listAllUsers)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRolePermissions
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetRolePermissionsResponse getRolePermissions(

                        axis2.apache.org.xsd.GetRolePermissions getRolePermissions)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  deleteRole(
         axis2.apache.org.xsd.DeleteRole deleteRole

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param deleteUser
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public void deleteUser(

                        axis2.apache.org.xsd.DeleteUser deleteUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  updateRolesOfUser(
         axis2.apache.org.xsd.UpdateRolesOfUser updateRolesOfUser

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param updateUsersOfRole
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public void updateUsersOfRole(

                        axis2.apache.org.xsd.UpdateUsersOfRole updateUsersOfRole)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param changePassword
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public void changePassword(

                        axis2.apache.org.xsd.ChangePassword changePassword)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  addInternalRole(
         axis2.apache.org.xsd.AddInternalRole addInternalRole

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  addRole(
         axis2.apache.org.xsd.AddRole addRole

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getRolesOfCurrentUser
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetRolesOfCurrentUserResponse getRolesOfCurrentUser(

                        axis2.apache.org.xsd.GetRolesOfCurrentUser getRolesOfCurrentUser)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param listUserByClaim
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.ListUserByClaimResponse listUserByClaim(

                        axis2.apache.org.xsd.ListUserByClaim listUserByClaim)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  addRemoveRolesOfUser(
         axis2.apache.org.xsd.AddRemoveRolesOfUser addRemoveRolesOfUser

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUsersOfRole
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetUsersOfRoleResponse getUsersOfRole(

                        axis2.apache.org.xsd.GetUsersOfRole getUsersOfRole)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAllUIPermissions
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetAllUIPermissionsResponse getAllUIPermissions(

                        axis2.apache.org.xsd.GetAllUIPermissions getAllUIPermissions)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAllSharedRoleNames
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetAllSharedRoleNamesResponse getAllSharedRoleNames(

                        axis2.apache.org.xsd.GetAllSharedRoleNames getAllSharedRoleNames)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAllRolesNames
                
             * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */

         
                     public axis2.apache.org.xsd.GetAllRolesNamesResponse getAllRolesNames(

                        axis2.apache.org.xsd.GetAllRolesNames getAllRolesNames)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.user.mgt.UserAdminUserAdminException : 
         */
        public void  bulkImportUsers(
         axis2.apache.org.xsd.BulkImportUsers bulkImportUsers

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.user.mgt.UserAdminUserAdminException;

        

        
       //
       }
    