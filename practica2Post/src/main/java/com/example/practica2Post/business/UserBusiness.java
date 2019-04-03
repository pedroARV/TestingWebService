package com.example.practica2Post.business;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuarios;
import com.example.practica2Post.service.IUserService;

@Service
public class UserBusiness implements IUserService {
	
	@Override
	public ResponseEntity<Response> respuesta(String fileName, Usuarios usuarios) throws Exception {
				
		if(fileName.length() < 1) {
			ResponseEntity<Response> response = new ResponseEntity<Response>(HttpStatus.CONFLICT);
			response.getBody().setCode(409);
			response.getBody().setMessage("Nombre de archivo no valido");
			return (response);
		}
		
		ResponseEntity<Response> response = new ResponseEntity<Response>(HttpStatus.OK);
		response.getBody().setCode(200);
		response.getBody().setMessage("ok");		
		return response;
	}

}
