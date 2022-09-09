package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vuelo;
import com.example.demo.repository.modelo.VueloSencillo;
@Repository
@Transactional
public class VueloRespoImpl implements IVueloRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	public List<VueloSencillo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<VueloSencillo> myQuery = this.entityManager.createQuery(
				"select new com.uce.edu.demo.repository.modelo.VueloSencillo (v.numero, v.origen, v.destino, v.categoria, v.avion.nombre, v.valorAsiento) FROM Vuelo v WHERE v.origen = :origen AND v.destino = :destino AND v.fechaVuelo = :fechaVuelo",
				VueloSencillo.class);
		myQuery.setParameter("origen", origen);
		myQuery.setParameter("destino", destino);
		myQuery.setParameter("fechaVuelo", fechaVuelo);
		return myQuery.getResultList();
		
		
	}
}
