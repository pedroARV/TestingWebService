package com.example.ValidacionPersistenciaUsuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ValidacionPersistenciaUsuarios.entity.TEmpleado;

@Repository
public interface IEmpleadoRespository extends CrudRepository<TEmpleado, Integer> {

}
