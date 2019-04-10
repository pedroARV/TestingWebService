package com.example.ValidacionPersistenciaUsuarios.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.ValidacionPersistenciaUsuarios.entity.TDetalle;
import com.example.ValidacionPersistenciaUsuarios.entity.TEmpleado;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import com.example.ValidacionPersistenciaUsuarios.repository.IDetalleRepository;
import com.example.ValidacionPersistenciaUsuarios.repository.IEmpleadoRespository;

@Transactional
@Service
public class SaveDB {

	@Autowired
	IEmpleadoRespository empleadoRespository;
	@Autowired
	IDetalleRepository detalleRepository;

	public void guardarDB(Empleado empleado) {

		TEmpleado tEmpleado = new TEmpleado();
		tEmpleado.setNombre(empleado.getNombre());
		tEmpleado.setApellidos(empleado.getApellidos());
		tEmpleado.setCorreo(empleado.getCorreo());
		tEmpleado.setEdad(empleado.getEdad());
		tEmpleado.setFechaContratacion(empleado.getFechaContratacion());
		tEmpleado = empleadoRespository.save(tEmpleado);

		for (int i = 0; i < empleado.getMarcadores().size(); i++) {
			TDetalle tDetalle = new TDetalle();
			tDetalle.setLatitude(empleado.getMarcadores().get(i).getLatitude());
			tDetalle.setLongitude(empleado.getMarcadores().get(i).getLongitude());
			tDetalle.setCity(empleado.getMarcadores().get(i).getCity());
			tDetalle.setDescription(empleado.getMarcadores().get(i).getDescription());
			tDetalle.setTEmpleado(tEmpleado);
			detalleRepository.save(tDetalle);
		}

	}
}