package com.example.soapEjercicioWsdlImport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement.GetProductsResponseType;
import com.example.soapEjercicioWsdlImport.service.IProductService;

@RestController
public class MainController {
	
	@Autowired
	IProductService mainService;
	
	@PostMapping("/productos")
	public ResponseEntity<GetProductsResponseType> productos(
			@RequestHeader(value = "accountNumber", required = true) String accountNumber) {
		return mainService.productos(accountNumber);
	}
}
