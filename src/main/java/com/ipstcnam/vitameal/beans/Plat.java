package com.ipstcnam.vitameal.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plat implements Serializable {

	private static final long serialVersionUID = -8641846010466974430L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer idPlat;
	private String nom;

	public Integer getIdPlat() {
		return idPlat;
	}

	public void setIdPlat(Integer idPlat) {
		this.idPlat = idPlat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
