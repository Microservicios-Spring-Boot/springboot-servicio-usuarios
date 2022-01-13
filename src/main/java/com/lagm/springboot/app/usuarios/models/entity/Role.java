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
@Table(name = "roles")
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity: Mysql, SQL Server, H2
	private Long id;

	@Column(unique = true, length = 30)
	private String nombre;

	private static final long serialVersionUID = 234103176895355370L;

}
