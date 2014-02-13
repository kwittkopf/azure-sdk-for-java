/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* The detailed Get Hosted Service operation response.
*/
public class HostedServiceGetDetailedResponse extends HostedServiceGetResponse {
    private ArrayList<HostedServiceGetDetailedResponse.Deployment> deployments;
    
    /**
    * The deployments that exist in the cloud service.
    * @return The Deployments value.
    */
    public ArrayList<HostedServiceGetDetailedResponse.Deployment> getDeployments() {
        return this.deployments;
    }
    
    /**
    * The deployments that exist in the cloud service.
    * @param deploymentsValue The Deployments value.
    */
    public void setDeployments(final ArrayList<HostedServiceGetDetailedResponse.Deployment> deploymentsValue) {
        this.deployments = deploymentsValue;
    }
    
    /**
    * Initializes a new instance of the HostedServiceGetDetailedResponse class.
    *
    */
    public HostedServiceGetDetailedResponse() {
        super();
        this.deployments = new ArrayList<HostedServiceGetDetailedResponse.Deployment>();
    }
    
    /**
    * A deployment that exists in the cloud service.
    */
    public static class Deployment {
        private String configuration;
        
        /**
        * The configuration file of the deployment.
        * @return The Configuration value.
        */
        public String getConfiguration() {
            return this.configuration;
        }
        
        /**
        * The configuration file of the deployment.
        * @param configurationValue The Configuration value.
        */
        public void setConfiguration(final String configurationValue) {
            this.configuration = configurationValue;
        }
        
        private Calendar createdTime;
        
        /**
        * The time that the deployment was created.
        * @return The CreatedTime value.
        */
        public Calendar getCreatedTime() {
            return this.createdTime;
        }
        
        /**
        * The time that the deployment was created.
        * @param createdTimeValue The CreatedTime value.
        */
        public void setCreatedTime(final Calendar createdTimeValue) {
            this.createdTime = createdTimeValue;
        }
        
        private DeploymentSlot deploymentSlot;
        
        /**
        * The deployment environment in which this deployment is running.
        * @return The DeploymentSlot value.
        */
        public DeploymentSlot getDeploymentSlot() {
            return this.deploymentSlot;
        }
        
        /**
        * The deployment environment in which this deployment is running.
        * @param deploymentSlotValue The DeploymentSlot value.
        */
        public void setDeploymentSlot(final DeploymentSlot deploymentSlotValue) {
            this.deploymentSlot = deploymentSlotValue;
        }
        
        private DnsSettings dnsSettings;
        
        /**
        * The custom DNS settings that are specified for deployment.
        * @return The DnsSettings value.
        */
        public DnsSettings getDnsSettings() {
            return this.dnsSettings;
        }
        
        /**
        * The custom DNS settings that are specified for deployment.
        * @param dnsSettingsValue The DnsSettings value.
        */
        public void setDnsSettings(final DnsSettings dnsSettingsValue) {
            this.dnsSettings = dnsSettingsValue;
        }
        
        private HashMap<String, String> extendedProperties;
        
        /**
        * Optional. Represents the name of an extended cloud service property.
        * Each extended property must have both a defined name and value. You
        * can have a maximum of 50 extended property name and value pairs.
        * The maximum length of the Name element is 64 characters, only
        * alphanumeric characters and underscores are valid in the name, and
        * it must start with a letter. Attempting to use other characters,
        * starting with a non-letter character, or entering a name that is
        * identical to that of another extended property owned by the same
        * service, will result in a status code 400 (Bad Request) error.  Each
        * extended property value has a maximum length of 255 characters.
        * @return The ExtendedProperties value.
        */
        public HashMap<String, String> getExtendedProperties() {
            return this.extendedProperties;
        }
        
        /**
        * Optional. Represents the name of an extended cloud service property.
        * Each extended property must have both a defined name and value. You
        * can have a maximum of 50 extended property name and value pairs.
        * The maximum length of the Name element is 64 characters, only
        * alphanumeric characters and underscores are valid in the name, and
        * it must start with a letter. Attempting to use other characters,
        * starting with a non-letter character, or entering a name that is
        * identical to that of another extended property owned by the same
        * service, will result in a status code 400 (Bad Request) error.  Each
        * extended property value has a maximum length of 255 characters.
        * @param extendedPropertiesValue The ExtendedProperties value.
        */
        public void setExtendedProperties(final HashMap<String, String> extendedPropertiesValue) {
            this.extendedProperties = extendedPropertiesValue;
        }
        
        private String label;
        
        /**
        * The user-supplied name of the deployment. This name can be used
        * identify the deployment for your tracking purposes.
        * @return The Label value.
        */
        public String getLabel() {
            return this.label;
        }
        
        /**
        * The user-supplied name of the deployment. This name can be used
        * identify the deployment for your tracking purposes.
        * @param labelValue The Label value.
        */
        public void setLabel(final String labelValue) {
            this.label = labelValue;
        }
        
        private String lastModifiedTime;
        
        /**
        * The last time that the deployment was modified.
        * @return The LastModifiedTime value.
        */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }
        
        /**
        * The last time that the deployment was modified.
        * @param lastModifiedTimeValue The LastModifiedTime value.
        */
        public void setLastModifiedTime(final String lastModifiedTimeValue) {
            this.lastModifiedTime = lastModifiedTimeValue;
        }
        
        private boolean locked;
        
        /**
        * Indicates whether the deployment is locked for new write operations.
        * True if the deployment is locked because an existing operation is
        * updating the deployment; otherwise false.
        * @return The Locked value.
        */
        public boolean isLocked() {
            return this.locked;
        }
        
        /**
        * Indicates whether the deployment is locked for new write operations.
        * True if the deployment is locked because an existing operation is
        * updating the deployment; otherwise false.
        * @param lockedValue The Locked value.
        */
        public void setLocked(final boolean lockedValue) {
            this.locked = lockedValue;
        }
        
        private String name;
        
        /**
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private PersistentVMDowntime persistentVMDowntime;
        
        /**
        * Specifies information about when the virtual machine has been started
        * and stopped.
        * @return The PersistentVMDowntime value.
        */
        public PersistentVMDowntime getPersistentVMDowntime() {
            return this.persistentVMDowntime;
        }
        
        /**
        * Specifies information about when the virtual machine has been started
        * and stopped.
        * @param persistentVMDowntimeValue The PersistentVMDowntime value.
        */
        public void setPersistentVMDowntime(final PersistentVMDowntime persistentVMDowntimeValue) {
            this.persistentVMDowntime = persistentVMDowntimeValue;
        }
        
        private String privateId;
        
        /**
        * The unique identifier for this deployment.
        * @return The PrivateId value.
        */
        public String getPrivateId() {
            return this.privateId;
        }
        
        /**
        * The unique identifier for this deployment.
        * @param privateIdValue The PrivateId value.
        */
        public void setPrivateId(final String privateIdValue) {
            this.privateId = privateIdValue;
        }
        
        private ArrayList<RoleInstance> roleInstances;
        
        /**
        * The list of role instances in the deployment.
        * @return The RoleInstances value.
        */
        public ArrayList<RoleInstance> getRoleInstances() {
            return this.roleInstances;
        }
        
        /**
        * The list of role instances in the deployment.
        * @param roleInstancesValue The RoleInstances value.
        */
        public void setRoleInstances(final ArrayList<RoleInstance> roleInstancesValue) {
            this.roleInstances = roleInstancesValue;
        }
        
        private ArrayList<Role> roles;
        
        /**
        * The list of roles in the deployment.
        * @return The Roles value.
        */
        public ArrayList<Role> getRoles() {
            return this.roles;
        }
        
        /**
        * The list of roles in the deployment.
        * @param rolesValue The Roles value.
        */
        public void setRoles(final ArrayList<Role> rolesValue) {
            this.roles = rolesValue;
        }
        
        private boolean rollbackAllowed;
        
        /**
        * Indicates whether the Rollback Update Or Upgrade operation is allowed
        * at this time. True if the operation is allowed; otherwise false.
        * @return The RollbackAllowed value.
        */
        public boolean isRollbackAllowed() {
            return this.rollbackAllowed;
        }
        
        /**
        * Indicates whether the Rollback Update Or Upgrade operation is allowed
        * at this time. True if the operation is allowed; otherwise false.
        * @param rollbackAllowedValue The RollbackAllowed value.
        */
        public void setRollbackAllowed(final boolean rollbackAllowedValue) {
            this.rollbackAllowed = rollbackAllowedValue;
        }
        
        private String sdkVersion;
        
        /**
        * The version of the Windows Azure SDK that was used to generate the
        * .cspkg that created this deployment.  The first two numerical
        * components of the returned version represent the version of the SDK
        * used to create the package.
        * @return The SdkVersion value.
        */
        public String getSdkVersion() {
            return this.sdkVersion;
        }
        
        /**
        * The version of the Windows Azure SDK that was used to generate the
        * .cspkg that created this deployment.  The first two numerical
        * components of the returned version represent the version of the SDK
        * used to create the package.
        * @param sdkVersionValue The SdkVersion value.
        */
        public void setSdkVersion(final String sdkVersionValue) {
            this.sdkVersion = sdkVersionValue;
        }
        
        private DeploymentStatus status;
        
        /**
        * The status of the deployment.
        * @return The Status value.
        */
        public DeploymentStatus getStatus() {
            return this.status;
        }
        
        /**
        * The status of the deployment.
        * @param statusValue The Status value.
        */
        public void setStatus(final DeploymentStatus statusValue) {
            this.status = statusValue;
        }
        
        private int upgradeDomainCount;
        
        /**
        * The number of upgrade domains available to this cloud service.
        * @return The UpgradeDomainCount value.
        */
        public int getUpgradeDomainCount() {
            return this.upgradeDomainCount;
        }
        
        /**
        * The number of upgrade domains available to this cloud service.
        * @param upgradeDomainCountValue The UpgradeDomainCount value.
        */
        public void setUpgradeDomainCount(final int upgradeDomainCountValue) {
            this.upgradeDomainCount = upgradeDomainCountValue;
        }
        
        private UpgradeStatus upgradeStatus;
        
        /**
        * Specifies information about an update occurring on the deployment.
        * @return The UpgradeStatus value.
        */
        public UpgradeStatus getUpgradeStatus() {
            return this.upgradeStatus;
        }
        
        /**
        * Specifies information about an update occurring on the deployment.
        * @param upgradeStatusValue The UpgradeStatus value.
        */
        public void setUpgradeStatus(final UpgradeStatus upgradeStatusValue) {
            this.upgradeStatus = upgradeStatusValue;
        }
        
        private URI uri;
        
        /**
        * The URL used to access the hosted service.  For example, if the
        * service name is MyService you could access the access the service by
        * calling: http://MyService.cloudapp.net
        * @return The Uri value.
        */
        public URI getUri() {
            return this.uri;
        }
        
        /**
        * The URL used to access the hosted service.  For example, if the
        * service name is MyService you could access the access the service by
        * calling: http://MyService.cloudapp.net
        * @param uriValue The Uri value.
        */
        public void setUri(final URI uriValue) {
            this.uri = uriValue;
        }
        
        private ArrayList<VirtualIPAddress> virtualIPAddresses;
        
        /**
        * The virtual IP addresses that are specified for thedeployment.
        * @return The VirtualIPAddresses value.
        */
        public ArrayList<VirtualIPAddress> getVirtualIPAddresses() {
            return this.virtualIPAddresses;
        }
        
        /**
        * The virtual IP addresses that are specified for thedeployment.
        * @param virtualIPAddressesValue The VirtualIPAddresses value.
        */
        public void setVirtualIPAddresses(final ArrayList<VirtualIPAddress> virtualIPAddressesValue) {
            this.virtualIPAddresses = virtualIPAddressesValue;
        }
        
        private String virtualNetworkName;
        
        /**
        * The name of the Virtual Network that the virtual machine connects to.
        * @return The VirtualNetworkName value.
        */
        public String getVirtualNetworkName() {
            return this.virtualNetworkName;
        }
        
        /**
        * The name of the Virtual Network that the virtual machine connects to.
        * @param virtualNetworkNameValue The VirtualNetworkName value.
        */
        public void setVirtualNetworkName(final String virtualNetworkNameValue) {
            this.virtualNetworkName = virtualNetworkNameValue;
        }
        
        /**
        * Initializes a new instance of the Deployment class.
        *
        */
        public Deployment() {
            this.extendedProperties = new HashMap<String, String>();
            this.roleInstances = new ArrayList<RoleInstance>();
            this.roles = new ArrayList<Role>();
            this.virtualIPAddresses = new ArrayList<VirtualIPAddress>();
        }
    }
}
