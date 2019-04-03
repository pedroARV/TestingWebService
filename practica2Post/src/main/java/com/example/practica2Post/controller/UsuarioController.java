package com.example.practica2Post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica2Post.model.Usuario;
import com.example.practica2Post.service.IUserService;
import com.example.practica2Post.model.Response;

@RestController
public class UsuarioController{
	
	@Autowired IUserService userService;
		
	@PostMapping("/users")
	public ResponseEntity<Response> respuesta(@RequestHeader (value="fileName",required=true )String fileName,@RequestBody Usuario usuario) throws Throwable{	
		return userService.nombreArchivoExcel(fileName, usuario);
		}
	

}
