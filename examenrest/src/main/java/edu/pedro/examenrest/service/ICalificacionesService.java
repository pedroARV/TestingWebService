package edu.pedro.examenrest.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import edu.pedro.examenrest.model.Alumno;
import edu.pedro.examenrest.model.ResponseCode;

@Component
public interface ICalificacionesService {

	public ResponseEntity<ResponseCode> altaCalificaciones(String matricula, Alumno alumno);

}
