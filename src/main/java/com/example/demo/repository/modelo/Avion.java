package com.example.demo.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "avion")
public class Avion {

	@Id
	@Column(name = "avio_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_avion") 
	@SequenceGenerator(name = "seq_avion", sequenceName = "seq_avion", allocationSize = 1)
	private Integer id;
	
	@Column(name = "avio_nombre")
	private String nombre;
	
	@Column(name = "avio_capacidad_asientos")
	private Integer capacidadAsientos;
	
	@OneToMany(mappedBy = "avion")
	private List<Vuelo> vuelos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCapacidadAsientos() {
		return capacidadAsientos;
	}

	public void setCapacidadAsientos(Integer capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}

	
}
