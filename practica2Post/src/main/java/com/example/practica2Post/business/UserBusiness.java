package com.example.practica2Post.business;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuario;
import com.example.practica2Post.service.IUserService;

@Service
public class UserBusiness implements IUserService {
	
	@Override
	public ResponseEntity<Response> nombreArchivo(String fileName, Usuario usuario) throws Exception {
		
		
		if(fileName.length() < 1) {
			Response respuesta = new Response();
			ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.CONFLICT);
			entity.getBody().setMessage("nombre de archivo incorrecto");
			entity.getBody().setCode(409);
			return entity;
		}
		
		Response respuesta = new Response();
		ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.OK);
		entity.getBody().setMessage("ok");
		entity.getBody().setCode(200);
		return entity;
		
		
	}

}
