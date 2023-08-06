package com.examples.springboot.backend.apirest.models.services;

import java.util.List;

import com.examples.springboot.backend.apirest.models.entity.Cliente;

public interface IClientesService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	
}
