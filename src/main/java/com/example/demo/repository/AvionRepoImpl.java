package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Avion;

@Repository
@Transactional
public class AvionRepoImpl implements IAvionRepo {
	
	@PersistenceContext 
	private EntityManager entityManager;

	@Override
	public void insertar(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(avion);
	}

}
