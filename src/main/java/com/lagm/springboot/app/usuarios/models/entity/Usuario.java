package com.lagm.springboot.app.usuarios.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
	private static final long serialVersionUID = -5912409350897560755L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity: Mysql, SQL Server, H2
	private Long id;

	@Column(unique = true, length = 20)
	private String username;

	@Column(length = 20)
	private String password;
	private Boolean enabled; // habilitar o deshabilitar al usuario
	private String nombre;
	private String apellido;

	@Column(unique = true)
	private String email;
}
