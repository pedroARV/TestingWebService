package com.example.ValidacionPersistenciaUsuarios.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import com.example.ValidacionPersistenciaUsuarios.repository.IEmpleadoRespository;

@Service
public class SaveDB {

	@Autowired
	IEmpleadoRespository empleadoRespository;

	public void guardarDB(Empleado empleadoJson) {

	}
}
