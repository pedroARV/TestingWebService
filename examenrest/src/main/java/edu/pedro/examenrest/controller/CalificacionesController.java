package edu.pedro.examenrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import edu.pedro.examenrest.model.Alumno;
import edu.pedro.examenrest.model.ResponseCode;
import edu.pedro.examenrest.service.ICalificacionesService;

@RestController
public class CalificacionesController {

	@Autowired
	ICalificacionesService calificacionesService;

	@PostMapping("/alumnos/calificaciones/alta")
	public ResponseEntity<ResponseCode> AlumnoCalificacionesAlta(
			@RequestHeader(value = "matricula", required = true) String matricula, @RequestBody Alumno alumno) {
		return calificacionesService.altaCalificaciones(matricula, alumno);
	}

}
