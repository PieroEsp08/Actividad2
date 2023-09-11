package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Categoria;
import com.empresa.entity.Deporte;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer > {
	

}
