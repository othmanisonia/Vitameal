package main.java.com.ipstcnam.vitameal.beans;

import java.io.Serializable;

public class Utilisateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1188057400213293155L;
	private String nom;
	private String motDePasse;
	private String role;
	
	public Utilisateur() {
		nom = "";
		motDePasse = "";
		role = "";
	}

	public String getNom() {
		return nom;
	}

	public String getMotDePasse() {
		return motDePasse;
	}
	
	public String getRole() {
		return role;
	}

	public void setNom(String leNom) {
		nom = leNom;
	}

	public void setMotDePasse(String leMotDePasse) {
		motDePasse = leMotDePasse;
	}
	
	public void setRole(String unRole) {
		role = unRole;
	}
}
