package com.ipstcnam.vitameal.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ComposantPlat implements Serializable {

	private static final long serialVersionUID = 5909069262091283363L;

	@EmbeddedId
	private ComposantPlatPK composantPlatId;

	private float quantite;
	private String unite;

	public ComposantPlatPK getComposantPlatId() {
		return composantPlatId;
	}

	public void setComposantPlatId(ComposantPlatPK composantPlatId) {
		this.composantPlatId = composantPlatId;
	}

	public float getQuantite() {
		return quantite;
	}

	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

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

}
