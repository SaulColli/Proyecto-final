package com.tuempresa.proyectofinal.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class Colaborador {
	
	@Stereotype ("TEXTO")
	String tema;
	

}
