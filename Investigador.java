package com.tuempresa.proyectofinal.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Investigador {

	@Id
	@Column (length = 25)
	String nombre;
	
	@Column (length = 50)
	String centro;
	
	@Stereotype("EMAIL")
	String correoelec;
	
	@ElementCollection
	@ListProperties("tema")
	Collection<Colaborador> temas;

}
