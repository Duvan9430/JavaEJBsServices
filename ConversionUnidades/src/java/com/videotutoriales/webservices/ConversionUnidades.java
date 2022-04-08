/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.videotutoriales.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Leo-PC
 */
@WebService(serviceName = "ConversionUnidades")
public class ConversionUnidades {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pulgadasACentimetros")
    public double pulgadasACentimetros(@WebParam(name = "pulgadas") double pulgadas) {
        //TODO write your implementation code here:
        return pulgadas * 2.54;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "centimetrosAPulgadas")
    public double centimetrosAPulgadas(@WebParam(name = "centimetros") double centimetros) {
        //TODO write your implementation code here:
        return centimetros / 2.54;
    }
}
