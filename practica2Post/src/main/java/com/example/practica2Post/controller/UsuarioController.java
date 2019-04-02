package com.example.practica2Post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica2Post.model.Registro;
import com.example.practica2Post.model.Response;

@RestController
public class UsuarioController{
	
	@PostMapping("/users")
	public ResponseEntity<Response> respuesta(@RequestHeader (value="fileName",required=false )String fileName,@RequestBody Registro registro){
		System.out.printf("hello");
		
		Response response = new Response();
		//test
		response.setCode(0);
		response.setMessage("The test");
		return new ResponseEntity<Response> (response, HttpStatus.OK);
	}
	

}
