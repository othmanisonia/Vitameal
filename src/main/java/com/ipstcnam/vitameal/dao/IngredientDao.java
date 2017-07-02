package com.ipstcnam.vitameal.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ipstcnam.vitameal.entity.Ingredient;
import com.ipstcnam.vitameal.listeners.ApplicationListener;

@Stateless
public class IngredientDao implements Serializable {

	private static final long serialVersionUID = -7830864526566789037L;
	
	@PersistenceContext(unitName="com.ipstcnam.vitameal.jpa")
	private EntityManager em;
	
	public IngredientDao() {
		em = ApplicationListener.getEmf().createEntityManager();
	}
	
	public void creer(Ingredient ingredient) {
		em.getTransaction().begin();
		try {
			em.persist(ingredient);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("Une erreur est survenue lors de l'ajout :");
			System.out.println(e.getMessage());
		}
	}

}

