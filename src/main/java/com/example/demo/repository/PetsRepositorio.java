package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pets;
@Repository
public interface PetsRepositorio extends CrudRepository<Pets, Integer>{
	@Query("SELECT p FROM Pets p WHERE " +
		       "CONCAT(p.id, p.descripcion, p.estado, p.imagenPath, p.name, p.raza, p.tipo, p.ubicacion , p.contactos) " +
		       "LIKE %:peats%")
		List<Pets> buscarPorPalabraClave(@Param("peats") String palabraClave);


}
