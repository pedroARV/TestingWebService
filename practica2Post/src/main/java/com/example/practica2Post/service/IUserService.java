package com.example.practica2Post.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuarios;

@Component
public interface IUserService {

	public ResponseEntity<Response> respuesta(String fileName, Usuarios usuarios) throws Exception;
	
	
	
}
