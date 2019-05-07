package com.example.soapEjercicioWsdlImport.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.soapEjercicioWsdlImport.config.Config;
import com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement.GetProductsRequestType;
import com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement.GetProductsResponseType;
import com.example.soapEjercicioWsdlImport.mx.izzi.service.pkm_querymanagement.PKMQueryManagementPortType;
import com.example.soapEjercicioWsdlImport.service.IProductService;

@Service
public class ProductBusiness implements IProductService {

	@Override
	public ResponseEntity<GetProductsResponseType> productos(String accountNumber) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);

		PKMQueryManagementPortType port = factory.getBean(PKMQueryManagementPortType.class);
		GetProductsRequestType request = new GetProductsRequestType();
		request.setAccountNumber(accountNumber);
		GetProductsResponseType response = port.getProducts(request);
		System.out.println();
		ResponseEntity<GetProductsResponseType> responseEntity = new ResponseEntity<GetProductsResponseType>(response, HttpStatus.OK);
		return responseEntity;
	}

}
