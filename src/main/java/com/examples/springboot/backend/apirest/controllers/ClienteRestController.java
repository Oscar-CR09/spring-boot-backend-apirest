package com.examples.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.springboot.backend.apirest.models.entity.Cliente;
import com.examples.springboot.backend.apirest.models.services.IClientesService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClientesService clienteService;
	
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
	
		return clienteService.findAll();
	}
	
}