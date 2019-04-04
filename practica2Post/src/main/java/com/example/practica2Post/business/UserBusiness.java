package com.example.practica2Post.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.practica2Post.model.Response;
import com.example.practica2Post.model.Usuario;
import com.example.practica2Post.service.IUserService;
import com.example.practica2Post.tools.FileCSV;
import com.example.practica2Post.tools.FileExcel;

@Service
public class UserBusiness implements IUserService {

	@Autowired
	FileExcel fileExcel;
	@Autowired
	FileCSV fileCSV;

	@Override
	public ResponseEntity<Response> nombreArchivoExcel(String fileName, String typeFile, Usuario usuario) {
		Response respuesta = new Response();
		int intTypeFile = Integer.parseInt(typeFile);

		if (fileName.length() < 1) {
			ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.CONFLICT);
			entity.getBody().setMessage("nombre de archivo invalido");
			entity.getBody().setCode(409);
			return entity;
		}
		ResponseEntity<Response> entity = new ResponseEntity<Response>(respuesta, HttpStatus.OK);
		entity.getBody().setMessage("ok");
		entity.getBody().setCode(200);

		switch (intTypeFile) {
		case 1:
			fileExcel.crearExcel(fileName, usuario);
			return entity;
		case 2:
			fileCSV.crearCSV(fileName, usuario);
			return entity;
		default:
			ResponseEntity<Response> entityTypeFileError = new ResponseEntity<Response>(respuesta, HttpStatus.CONFLICT);
			entityTypeFileError.getBody().setMessage("tipo de archivo invalido");
			entityTypeFileError.getBody().setCode(409);
			return entityTypeFileError;

		}

	}
}
