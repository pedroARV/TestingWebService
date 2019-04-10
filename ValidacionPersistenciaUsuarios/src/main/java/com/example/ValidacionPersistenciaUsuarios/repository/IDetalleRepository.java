package com.example.ValidacionPersistenciaUsuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ValidacionPersistenciaUsuarios.entity.TDetalle;

@Repository
public interface IDetalleRepository extends CrudRepository<TDetalle, Integer> {

}
