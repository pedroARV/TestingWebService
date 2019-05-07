package com.example.soapEjercicioWsdlImport.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement.GetProductsResponseType;

@Component
public interface IProductService {

	public ResponseEntity<GetProductsResponseType> productos(String accountNumber);

}
