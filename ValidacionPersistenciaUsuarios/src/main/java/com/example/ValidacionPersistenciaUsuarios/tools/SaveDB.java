package com.example.ValidacionPersistenciaUsuarios.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.ValidacionPersistenciaUsuarios.entity.TDetalle;
import com.example.ValidacionPersistenciaUsuarios.entity.TEmpleado;
import com.example.ValidacionPersistenciaUsuarios.modelo.Empleado;
import com.example.ValidacionPersistenciaUsuarios.repository.IDetalleRepository;
import com.example.ValidacionPersistenciaUsuarios.repository.IEmpleadoRespository;
import com.example.ValidacionPersistenciaUsuarios.service.ITEmpleadoService;

@Transactional
@Service
public class SaveDB implements ITEmpleadoService {

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

/*
 * List<TDetalle> tDetalle = new ArrayList(); for (int i = 0; i <
 * empleado.getMarcadores().size(); i++) {
 * tDetalle.get(i).setLatitude(empleado.getMarcadores().get(i).getLatitude());
 * tDetalle.get(i).setLongitude(empleado.getMarcadores().get(i).getLongitude());
 * tDetalle.get(i).setCity(empleado.getMarcadores().get(i).getCity());
 * tDetalle.get(i).setDescription(empleado.getMarcadores().get(i).getDescription
 * ()); tEmpleado.setTDetalle(tDetalle); } tEmpleado.setTDetalle(tDetalle);
 * empleadoRespository.save(tEmpleado);
 * 
 * TDetalle tDetalle = new TDetalle; for (int i = 0; i <
 * empleado.getMarcadores().size(); i++) {
 * tDetalle.setLatitude(empleado.getMarcadores().get(i).getLatitude());
 * tDetalle.setLongitude(empleado.getMarcadores().get(i).getLongitude());
 * tDetalle.setCity(empleado.getMarcadores().get(i).getCity());
 * tDetalle.setDescription(empleado.getMarcadores().get(i).getDescription()); }
 * empleadoRespository.save(tEmpleado);
 * 
 * 
 * 
 * 
 */
