package com.example.ValidacionPersistenciaUsuarios.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.ValidacionPersistenciaUsuarios.entity.TEmpleado;

public interface IEmpleadoRespository extends CrudRepository<TEmpleado, String> {

}
