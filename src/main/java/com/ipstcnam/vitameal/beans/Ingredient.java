package com.ipstcnam.vitameal.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient implements Serializable {

	private static final long serialVersionUID = -3859003130804553755L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer idIngredient;
	private String nom;

	public Integer getIdIngredient() {
		return idIngredient;
	}

	public void setIdIngredient(Integer idIngredient) {
		this.idIngredient = idIngredient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
