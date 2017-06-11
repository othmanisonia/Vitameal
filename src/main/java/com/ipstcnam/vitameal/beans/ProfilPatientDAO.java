package com.ipstcnam.vitameal.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ipstcnam.vitameal.listeners.ApplicationListener;

@Stateless
public class ProfilPatientDAO {
	@PersistenceContext(unitName="com.ipstcnam.vitameal.jpa")
	private EntityManager em;
	
	public ProfilPatientDAO() {
		em = ApplicationListener.getEmf().createEntityManager();
	}
	
	public void creer(ProfilPatient profilPatient) {
		em.getTransaction().begin();
		try {
			em.persist(profilPatient);
			em.getTransaction().commit();
			System.out.println("Ajout effectué avec succés.");
		} catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("Une erreur est survenue lors de l'ajout :");
			System.out.println(e.getMessage());
		}
		em.close();
	}
}
