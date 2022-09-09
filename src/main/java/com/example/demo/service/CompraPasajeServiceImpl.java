package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICompraPasajeRepo;
import com.example.demo.repository.modelo.CompraPasaje;

@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService {

	@Autowired
	private ICompraPasajeRepo compraPasajeRepo;

	@Override
	public CompraPasaje buscarNumero(String numero) {
		// TODO Auto-generated method stub
		return this.compraPasajeRepo.buscarNumero(numero);
	}


}
