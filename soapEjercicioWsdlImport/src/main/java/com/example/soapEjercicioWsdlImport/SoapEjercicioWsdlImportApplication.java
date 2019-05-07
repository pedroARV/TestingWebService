package com.example.soapEjercicioWsdlImport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement.GetProductsRequestType;
import com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement.GetProductsResponseType;
import com.example.soapEjercicioWsdlImport.mx.izzi.service.pkm_querymanagement.PKMQueryManagementPortType;

@SpringBootApplication
public class SoapEjercicioWsdlImportApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapEjercicioWsdlImportApplication.class, args);

		ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);

		PKMQueryManagementPortType port = factory.getBean(PKMQueryManagementPortType.class);
		GetProductsRequestType request = new GetProductsRequestType();
		request.setAccountNumber("19891516");
		GetProductsResponseType response = port.getProducts(request);
		System.out.println();
	}

}
