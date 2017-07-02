package com.ipstcnam.vitameal.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.ipstcnam.vitameal.entity.pk.ComposantPlatPK;

/**
 * <p>
 * Cette classe représente un composant d'un plat. Elle correspond à une
 * association entre un plat et un ingrédient et donne la quantité en une unité
 * de mesure de cet ingrédient dans le plat.
 * </p>
 * <p>
 * L'identifiant de cette entité une clé composite entre un plat et un
 * ingrédient ({@link ComposantPlatPK}).
 * </p>
 * 
 * @see Ingredient
 * @see Plat
 * 
 * @author Nicolas Symphorien
 */
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

}
