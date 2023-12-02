package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pets;
import com.example.demo.repository.PetsRepositorio;

@Service
public class PetsServiceImpl  implements PetsService{

	@Autowired
	private PetsRepositorio userRepository;

 
	@Override
	public Pets addUser(Pets user) {
		return userRepository.save(user);
	}

	@Override
	public List<Pets> getUser() {
	return (List<Pets>)userRepository.findAll();
	}

	@Override
	public Pets getUserByid(int id) {
   return userRepository.findById(id).get();
		 
	}

	@Override
	public Pets updateUser(int id, Pets user) {
		Pets user1 = userRepository.findById(id).get();
        user1.setTipo(user.getTipo());
        user1.setRaza(user.getRaza());
        user1.setName(user.getName());
        user1.setUbicacion(user.getUbicacion());
        user1.setDescripcion(user.getDescripcion());
        user1.setImagenPath(user.getImagenPath());
        user1.setFechaDesaparicion(user.getFechaDesaparicion());
        user1.setEstado(user.getEstado());
        user1.setContactos(user.getContactos());        
        return userRepository.save(user1);
	}

	@Override
	public void deleteUser(int id) {
	     userRepository.deleteById(id);
		
	}

	@Override
	public List<Pets> buscarMascotasPorPalabraClave(String peats) {
		return 	userRepository.buscarPorPalabraClave("%" + peats + "%");
	}
	 
	}


