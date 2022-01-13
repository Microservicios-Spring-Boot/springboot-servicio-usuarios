package com.lagm.springboot.app.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.lagm.springboot.app.usuarios.models.entity.Usuario;

public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
	// PagingAndSortingRepository hereda de CrudRepository
	// Trea funcionalidades extra para Ordenar y Paginar
	
	public Usuario findByUsername(String username); // Mediante convención de nombre (revisar Query Method)
	// public Usuario findByUsernameAndEmail(String username, String email);
	
	@Query("select u from Usuario u where u.username = ?1")
	public Usuario obtenerPorUsername(String username); // Mediante notación @Query
	
	/*@Query("select u from Usuario u where u.username = ?1 and u.email = ?2")
	public Usuario obtenerPorUsername(String username, String email);*/
}
