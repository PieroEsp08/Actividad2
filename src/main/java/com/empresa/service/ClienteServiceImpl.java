package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Cliente;
import com.empresa.entity.Modalidad;
import com.empresa.repository.ClienteRepository;
import com.empresa.repository.ModalidadRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public Cliente insertaCliente(Cliente obj) {
		return repository.save(obj);
	}

	@Override
	public List<Cliente> listaPorNombre(String nombre) {		
		return repository.findByNombre(nombre);
	}

	@Override
	public List<Cliente> listaPorDni(String dni) {		
		return repository.findByDni(dni);
	}
	
	
	
}
