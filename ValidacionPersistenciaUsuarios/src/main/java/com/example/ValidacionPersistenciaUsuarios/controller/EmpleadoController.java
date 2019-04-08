package com.example.ValidacionPersistenciaUsuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import com.example.ValidacionPersistenciaUsuarios.service.IEmpleadoService;

@RestController
public class EmpleadoController {

	@Autowired
	IEmpleadoService userService;

	@PostMapping("/")
	public ResponseEntity<?> respuesta(
			@RequestHeader(value = "pdf", required = true) String pdf,
			@RequestHeader(value = "csv", required = true) String csv,
			@RequestHeader(value = "xls", required = true) String xls,
			@RequestHeader(value = "db", required = true) String db, 
			@RequestBody Empleado usuario) {
		return userService.procesarUsuarios(pdf, csv, xls, db, usuario);
	}

}