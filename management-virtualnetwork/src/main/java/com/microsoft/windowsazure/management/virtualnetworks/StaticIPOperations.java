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

package com.microsoft.windowsazure.management.virtualnetworks;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.virtualnetworks.models.NetworkStaticIPAvailabilityResponse;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public interface StaticIPOperations {
    /**
    * The Check Static IP operation retrieves the details for the availability
    * of static IP addresses for the given virtual network.
    *
    * @param virtualNetworkName The name of the virtual network.
    * @param ipAddress The address of the static IP.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return A response that indicates the availability of a static IP
    * address, and if not, provide a list of suggestions.
    */
    NetworkStaticIPAvailabilityResponse check(String virtualNetworkName, InetAddress ipAddress) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The Check Static IP operation retrieves the details for the availability
    * of static IP addresses for the given virtual network.
    *
    * @param virtualNetworkName The name of the virtual network.
    * @param ipAddress The address of the static IP.
    * @return A response that indicates the availability of a static IP
    * address, and if not, provide a list of suggestions.
    */
    Future<NetworkStaticIPAvailabilityResponse> checkAsync(String virtualNetworkName, InetAddress ipAddress);
}
