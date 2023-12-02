package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Pets;

@Service
public interface PetsService {

	
	public Pets addUser(Pets user);
	
	  public List<Pets> getUser();

	    public Pets getUserByid(int id);

	    public Pets updateUser(int id , Pets user);

	    public void deleteUser(int id);
	    public List<Pets> buscarMascotasPorPalabraClave(String peats);

 
}
