package com.fco271292

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

import org.grails.cxf.utils.EndpointType
import org.grails.cxf.utils.GrailsCxfEndpoint

import com.fco271292.Car

import grails.gorm.transactions.Transactional

@Transactional
@GrailsCxfEndpoint(expose = EndpointType.JAX_WS)
class CarroService {

	@WebMethod
	@WebResult(name = "index", targetNamespace = "http:com.fco271292.index")
	String index() {
		String mensaje = "Hola ${new Date().format("dd-MM-yyyy")}"
	}
	
	@WebMethod
	@WebResult(name = "Person", targetNamespace = "http:com.fco271292.person")
	Car createCar(@WebParam(name = 'name') String name) {
		Car person = new Car(id:1,name:name)
	}
	
}
