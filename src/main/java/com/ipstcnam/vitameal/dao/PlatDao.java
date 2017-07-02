package com.ipstcnam.vitameal.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ipstcnam.vitameal.entity.Plat;
import com.ipstcnam.vitameal.listeners.ApplicationListener;

@Stateless
public class PlatDao implements Serializable {

	private static final long serialVersionUID = -5676123578912282186L;
	
	@PersistenceContext(unitName="com.ipstcnam.vitameal.jpa")
	private EntityManager em;
	
	public PlatDao() {
		em = ApplicationListener.getEmf().createEntityManager();
	}
	
	public void creer(Plat plat) {
		em.getTransaction().begin();
		try {
			em.persist(plat);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("Une erreur est survenue lors de l'ajout :");
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Plat> findAll() {
		String hqlQuery = "select plat from Plat plat";
		Query query = em.createQuery(hqlQuery);
		
		return query.getResultList();
	}
	
	public Plat findById(Integer idPlat) {
		return em.find(Plat.class, idPlat);
	}

}
