package com.lagm.springboot.app.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.lagm.springboot.app.commons.usuarios.models.entity.Usuario;

@RepositoryRestResource(path = "usuarios")
/* Expone un api rest para realizar el crud. Con path indicamos el enpoint donde se va a exportar todos los métodos del Crud. Listar, listar por id, crear, modificar, eliminar, y
 * los métodos personalizados que tengamos */
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
	// PagingAndSortingRepository hereda de CrudRepository
	// Trea funcionalidades extra para Ordenar y Paginar
	
	@RestResource(path="buscar-username") // Para personalizar la ruta URL
	// Sin la anotación @RestResource, el acceso a este método es con el endpoint: http://localhost:8090/api/usuarios/usuarios/search/findByUsername?username=andres
	// Con la anotación @RestResource, el acceso a este método es con el endpoint: http://localhost:8090/api/usuarios/usuarios/search/buscar-username?username=andres 
	public Usuario findByUsername(@Param("username") String username); // Mediante convención de nombre (revisar Query Method)
	// public Usuario findByUsernameAndEmail(String username, String email);
	
	@Query("select u from Usuario u where u.username = ?1")
	public Usuario obtenerPorUsername(String username); // Mediante notación @Query
	
	/*@Query("select u from Usuario u where u.username = ?1 and u.email = ?2")
	public Usuario obtenerPorUsername(String username, String email);*/
}
