package com.example.demo.repository;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CompraPasaje;
@Repository
@Transactional
public class CompraPasajeRespoImpl implements ICompraPasajeRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CompraPasaje buscarNumero(String numero) {
		// TODO Auto-generated method stub
//		TypedQuery<CompraPasaje> myQuery = entityManager
//				.createQuery("SELECT cp FROM CompraPasaje cp WHERE cp.numero=:numero", CompraPasaje.class);
//		myQuery.setParameter("numero", numero);
//		try {
//			return myQuery.getSingleResult();
//		} catch (NoResultException e) {
//			return null;
//		}
		return null;

	}


}
