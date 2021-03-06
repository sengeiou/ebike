/*
 * Copyright 2020 聂钊 nz@qdigo.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qdigo.ebike.third.service.insurance.picc.print;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-02-26T17:11:16.974+08:00
 * Generated source version: 3.2.2
 *
 */
@WebServiceClient(name = "PrintWebServiceService",
                  wsdlLocation = "http://partnertest.mypicc.com.cn/ecooperation/webservice/print?wsdl",
                  targetNamespace = "http://webservice.ecooperation.epicc.com.cn/")
public class PrintWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.ecooperation.epicc.com.cn/", "PrintWebServiceService");
    public final static QName PrintWebServicePort = new QName("http://webservice.ecooperation.epicc.com.cn/", "PrintWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://partnertest.mypicc.com.cn/ecooperation/webservice/print?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PrintWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://partnertest.mypicc.com.cn/ecooperation/webservice/print?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PrintWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PrintWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PrintWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PrintWebServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PrintWebServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PrintWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PrintWebService
     */
    @WebEndpoint(name = "PrintWebServicePort")
    public PrintWebService getPrintWebServicePort() {
        return super.getPort(PrintWebServicePort, PrintWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PrintWebService
     */
    @WebEndpoint(name = "PrintWebServicePort")
    public PrintWebService getPrintWebServicePort(WebServiceFeature... features) {
        return super.getPort(PrintWebServicePort, PrintWebService.class, features);
    }

}
