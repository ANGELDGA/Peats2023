package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pets;
import com.example.demo.service.PetsService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/v1/pets")
public class ClientController {
	
	@Autowired
    private PetsService userService;                                                                     //http://localhost:8080/api/v1/pets/buscarMascotasPorPalabraClave?peats=Encontrado
	 //http://localhost:8080/buscarMascotasPorPalabraClave?peats=1                                                                                                   //http://localhost:8080/api/v1/pets/buscarMascotasPorPalabraClave?peats=Desaparecido
	 @GetMapping("/buscarMascotasPorPalabraClave")                                                       //http://localhost:8080/api/v1/pets/buscarMascotasPorPalabraClave?peats=1
	    public List<Pets> buscarMascotasPorPalabraClave(@RequestParam(name = "peats") String peats) {
	        return userService.buscarMascotasPorPalabraClave(peats);
	    }

	//http://localhost:8080/ 
	@GetMapping("/hello")//http://localhost:8080/api/v1/pets/
	public String helloworld() {
		return "hello World";
	}
	//http://localhost:8080/add
    @PostMapping("/add")//http://localhost:8080/api/v1/pets/add
    public String adduser(@RequestBody Pets user){
        userService.addUser(user);
        return "User Added Successfully...";
    }
  //http://localhost:8080/users
    @GetMapping("/users")//http://localhost:8080/api/v1/pets/users
    public List<Pets> getUsers(){
        System.out.println("Users..");
        return userService.getUser();
    }
  //http://localhost:8080/user/1
    @GetMapping("/user/{id}")//http://localhost:8080/api/v1/pets/user/1
    public Pets getUserById(@PathVariable("id") int id){
        return userService.getUserByid(id);
    }
  //http://localhost:8080/update/1
    @PutMapping("/update/{id}")//http://localhost:8080/api/v1/pets/update/1
    public String updateUser(@PathVariable("id") int id, @RequestBody Pets user){
        userService.updateUser(id, user);
        return "User Updated Successfully...";
    }
  //http://localhost:8080/delete/1
    @DeleteMapping("/delete/{id}")//http://localhost:8080/api/v1/pets/delete/1
    public String deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return "User Deleted Successfully...";
    }

}
