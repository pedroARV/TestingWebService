package com.example.ValidacionPersistenciaUsuarios.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.ValidacionPersistenciaUsuarios.modelo.ResponseSaveFiles;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;

@Component
public interface IEmpleadoService {

	public ResponseEntity<?> procesarUsuarios(String pdf, String csv, String xls, String db, Empleado usuario);

}
