package com.example.practica2Post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica2Post.model.Usuarios;
import com.example.practica2Post.service.IUserService;
import com.example.practica2Post.business.UserBusiness;
import com.example.practica2Post.model.Response;

@RestController
public class UsuarioController{
	
	@Autowired IUserService userService;
	
	@Autowired UserBusiness userBusiness;
	
	@PostMapping("/users")
	public ResponseEntity<Response> respuesta(@RequestHeader (value="fileName",required=true )String fileName,@RequestBody Usuarios usuarios) throws Throwable{	
		
		ResponseEntity<Response> response = new ResponseEntity<Response>(HttpStatus.OK);
		
		response = userService.respuesta(fileName, usuarios);

		return response;
	}
	

}
