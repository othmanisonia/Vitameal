package com.ipstcnam.vitameal.entity.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import com.ipstcnam.vitameal.entity.Ingredient;
import com.ipstcnam.vitameal.entity.Plat;

/**
 * Clé composite de l'entité ComposantPlat entre un ingrédient et un plat.
 * 
 * @see ComposantPlat
 * @see Ingredient
 * @see Plat
 * 
 * @author Nicolas Symphorien
 *
 */
@Embeddable
public class ComposantPlatPK implements Serializable {

	private static final long serialVersionUID = 91100405592885502L;

	@ManyToOne
	private Plat plat;

	@ManyToOne
	private Ingredient ingredient;

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

}
