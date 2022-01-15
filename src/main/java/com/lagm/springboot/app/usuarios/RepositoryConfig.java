package com.lagm.springboot.app.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.lagm.springboot.app.commons.usuarios.models.entity.Role;
import com.lagm.springboot.app.commons.usuarios.models.entity.Usuario;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	// Implementamos RepositoryRestConfigurer para configuraciones relacionadas al repositorio Rest
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Usuario.class, Role.class); // Mostrar IDs en el JSON
	}
}
