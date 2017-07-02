package com.ipstcnam.vitameal.forms;

import javax.servlet.http.HttpServletRequest;

import com.ipstcnam.vitameal.entity.ComposantPlat;
import com.ipstcnam.vitameal.entity.Ingredient;
import com.ipstcnam.vitameal.entity.Plat;
import com.ipstcnam.vitameal.entity.pk.ComposantPlatPK;
import com.ipstcnam.vitameal.forms.exception.MalformedFormException;

public class PlatForm {
	
	private Plat plat;
	private Ingredient ingredient;
	private ComposantPlat composantPlat;
	
	public PlatForm(HttpServletRequest request) throws MalformedFormException {
		createEntityFromRequest(request);
	}

	private void createEntityFromRequest(HttpServletRequest request) throws MalformedFormException {
		createPlat(request);
		createIngredient(request);
		createComposantPlat(request);
	}
	

	private void createPlat(HttpServletRequest request) {
		plat = new Plat();
		plat.setNom(request.getParameter("p_nomPlat"));
		
	}
	
	private void createIngredient(HttpServletRequest request) {
		ingredient = new Ingredient();
		ingredient.setNom(request.getParameter("p_nomIngredient"));
	}

	private void createComposantPlat(HttpServletRequest request) throws MalformedFormException {
		composantPlat = new ComposantPlat();
		
		ComposantPlatPK composantPlatPK = new ComposantPlatPK();
		composantPlatPK.setIngredient(ingredient);
		composantPlatPK.setPlat(plat);
		
		composantPlat.setComposantPlatId(composantPlatPK);
		composantPlat.setQuantite(parseFloat(request.getParameter("p_quantiteIngredient")));
		composantPlat.setUnite(request.getParameter("p_uniteIngredient"));
	}
	
	private float parseFloat(String string) throws MalformedFormException {
		try {
			return Float.parseFloat(string);
		} catch (NumberFormatException ex) {
			throw new MalformedFormException(ex);
		}
		
	}

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

	public ComposantPlat getComposantPlat() {
		return composantPlat;
	}

	public void setComposantPlat(ComposantPlat composantPlat) {
		this.composantPlat = composantPlat;
	}

}
