package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.modelos.User;
import com.sv.repositorio.InterfaceUsuario;

@RestController
@RequestMapping("/fac")
public class UserControlador {
	
	@Autowired
	private InterfaceUsuario InterfaceUser ;
	
	@GetMapping
	public List<User> usuarios()
	{
		return (List<User>) InterfaceUser.findAll();
	}
	
	@PostMapping
	public void insertar (@RequestBody User us) {
		InterfaceUser.save(us);
		
	}

}
