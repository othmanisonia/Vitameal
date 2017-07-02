package com.ipstcnam.vitameal.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ipstcnam.vitameal.entity.ComposantPlat;
import com.ipstcnam.vitameal.listeners.ApplicationListener;

@Stateless
public class ComposantPlatDao implements Serializable {

	private static final long serialVersionUID = -7830864526566789037L;
	
	@PersistenceContext(unitName="com.ipstcnam.vitameal.jpa")
	private EntityManager em;
	
	public ComposantPlatDao() {
		em = ApplicationListener.getEmf().createEntityManager();
	}
	
	public void creer(ComposantPlat composantPlat) {
		em.getTransaction().begin();
		try {
			em.persist(composantPlat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("Une erreur est survenue lors de l'ajout :");
			System.out.println(e.getMessage());
		}
	}

	public List<ComposantPlat> findAllByPlatId(Integer idPlat) {
		String hqlQuery = "select composantPlat from ComposantPlat composantPlat where composantPlat.composantPlatId.plat.idPlat = :idPlat";
		Query query = em.createQuery(hqlQuery);
		query.setParameter("idPlat", idPlat);
		List list = query.getResultList();
		return list;
		
	}

}

