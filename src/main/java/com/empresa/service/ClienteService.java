package com.empresa.service;

import java.util.List;

import com.empresa.entity.Alumno;
import com.empresa.entity.Cliente;
import com.empresa.entity.Modalidad;

public interface ClienteService {


	
	public abstract Cliente insertaCliente(Cliente obj);
	
	public abstract List<Cliente> listaPorNombre(String nombre);
	public abstract List<Cliente> listaPorDni(String dni);

}
