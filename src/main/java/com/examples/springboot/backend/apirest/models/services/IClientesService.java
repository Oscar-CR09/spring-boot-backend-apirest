package com.examples.springboot.backend.apirest.models.services;

import java.util.List;

import com.examples.springboot.backend.apirest.models.entity.Cliente;

public interface IClientesService {

	public List<Cliente> findAll();
}
