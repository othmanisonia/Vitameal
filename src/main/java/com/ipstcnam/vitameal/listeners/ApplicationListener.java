package com.ipstcnam.vitameal.listeners;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 * Permet de créer un "EntityManagerFactory" au démarrage de l'application sur l'événement 
 * contextInitialized du listener ServletContextListener
 * la fermeture ce fait sur l'événement 
 * contextDestroyed du listener ServletContextListener.
 * 
 * Ce faisant, il y a donc 1 seul "EntityManagerFactory" créé pour toute la durée de vie de l'application.
 * 
 */
@WebListener
public class ApplicationListener implements ServletContextListener {

	private static EntityManagerFactory emf;

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void setEmf(EntityManagerFactory aEmf) {
		ApplicationListener.emf = aEmf;
	}
	
    /**
     * Default constructor. 
     */
    public ApplicationListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	if(emf!=null && emf.isOpen())
    	{
    		emf.close();
    	}
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         emf = Persistence.createEntityManagerFactory("com.ipstcnam.vitameal.jpa");
    }
}
