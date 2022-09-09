package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVueloRepo;
import com.example.demo.repository.modelo.Vuelo;
import com.example.demo.repository.modelo.VueloSencillo;
@Service
public class VueloServiceImpl implements IVueloService {

	@Autowired
	private IVueloRepo iVueloRepo;
	
	@Override
	public void ingresar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.iVueloRepo.ingresar(vuelo);
	}

	@Override
	public List<VueloSencillo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		return this.iVueloRepo.buscarVuelos(origen, destino, fechaVuelo);
	}

}
