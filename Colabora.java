package com.tuempresa.proyectofinal.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable 
@Getter @Setter
public class Colabora {

	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	Investigador investigador; 
}
