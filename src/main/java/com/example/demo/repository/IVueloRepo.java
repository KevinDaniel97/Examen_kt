package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.Vuelo;
import com.example.demo.repository.modelo.VueloSencillo;

public interface IVueloRepo {

	public void ingresar (Vuelo vuelo);
	public List<VueloSencillo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo);
}
