package com.example.practica2Post.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuario;

@Component
public interface IUserService {

	public ResponseEntity<Response> nombreArchivoExcel(String fileName, String typeFile, Usuario usuario) throws Exception;
	
}
