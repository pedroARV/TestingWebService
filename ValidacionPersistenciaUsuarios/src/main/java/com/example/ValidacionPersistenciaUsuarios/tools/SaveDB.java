package com.example.ValidacionPersistenciaUsuarios.tools;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ValidacionPersistenciaUsuarios.entity.TEmpleado;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import com.example.ValidacionPersistenciaUsuarios.repository.IEmpleadoRespository;

@Service
public class SaveDB {

	@Autowired
	IEmpleadoRespository empleadoRespository;

	public void guardarDB(TEmpleado empleadoEntity, Empleado empleadoJson) {

		List arrayValores = new ArrayList();
		arrayValores.set(0, empleadoJson.getNombre());
		arrayValores.set(1, empleadoJson.getApellidos());
		arrayValores.set(2, empleadoJson.getCorreo());
		arrayValores.set(3, empleadoJson.getEdad());
		arrayValores.set(4, empleadoJson.getFechaContratacion());

		for (int i = 5; i < empleadoJson.getMarcadores().size() + 5; i++) {
			arrayValores.set(i, empleadoJson.getMarcadores().get(i).getLatitude());
			arrayValores.set(i, empleadoJson.getMarcadores().get(i).getLongitude());
			arrayValores.set(i, empleadoJson.getMarcadores().get(i).getCity());
			arrayValores.set(i, empleadoJson.getMarcadores().get(i).getDescription());
		}
				
		empleadoRespository.save(empleadoEntity);

	}

}
