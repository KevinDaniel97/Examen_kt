package com.example.demo.repository.modelo;

import java.math.BigDecimal;

public class VueloSencillo {
	private String numero;
	private String origen;
	private String destino;
	private String nombreAvion;
	private BigDecimal valorAsiento;
	
	public VueloSencillo() {
	}
	
	public VueloSencillo(String numero, String origen, String destino, String nombreAvion,
			BigDecimal valorAsiento) {
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.nombreAvion = nombreAvion;
		this.valorAsiento = valorAsiento;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNombreAvion() {
		return nombreAvion;
	}

	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}
}
