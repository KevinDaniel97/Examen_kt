package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAvionRepo;
import com.example.demo.repository.modelo.Avion;
@Service
public class AvionServiceImpl implements IAvionService {

	@Autowired
	private IAvionRepo avionRepo;
	
	@Override
	public void insertar(Avion avion) {
		// TODO Auto-generated method stub
	 this.avionRepo.insertar(avion);
	}

}
