package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Categoria;
import com.empresa.entity.Deporte;
import com.empresa.repository.CategoriaRepository;
import com.empresa.repository.DeporteRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public List<Categoria> listarTodos() {
		return repository.findAll();
	}

	
}
