package com.lagm.springboot.app.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lagm.springboot.app.usuarios.models.entity.Usuario;

@RepositoryRestResource(path = "usuarios")
/* Expone un api rest para realizar el crud. Con path indicamos el enpoint donde se va a exportar todos los métodos del Crud. Listar, listar por id, crear, modificar, eliminar, y
 * los métodos personalizados que tengamos */
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
