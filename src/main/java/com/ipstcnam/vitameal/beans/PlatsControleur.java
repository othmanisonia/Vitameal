package com.ipstcnam.vitameal.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateful;

import com.ipstcnam.vitameal.beans.enums.ActionPlatEnum;
import com.ipstcnam.vitameal.dao.ComposantPlatDao;
import com.ipstcnam.vitameal.dao.IngredientDao;
import com.ipstcnam.vitameal.dao.PlatDao;
import com.ipstcnam.vitameal.entity.ComposantPlat;
import com.ipstcnam.vitameal.entity.Plat;

@Stateful
public class PlatsControleur implements Serializable {

	private static final long serialVersionUID = 3124658966228263518L;

	PlatDao platDao;
	ComposantPlatDao composantPlatDao;
	IngredientDao ingredientDao;

	String idPlat;
	ActionPlatEnum action;

	public PlatsControleur() {
		platDao = new PlatDao();
		composantPlatDao = new ComposantPlatDao();
		ingredientDao = new IngredientDao();
	}

	public String getIdPlat() {
		return idPlat;
	}

	public void setIdPlat(String idPlat) {
		this.idPlat = idPlat;
	}

	public ActionPlatEnum getAction() {
		return action;
	}

	public void setAction(ActionPlatEnum action) {
		this.action = action;
	}

	public List<Plat> findAllPlats() {
		return platDao.findAll();
	}

	public boolean isEditerMode() {
		return ActionPlatEnum.editer.equals(action);
	}

	public boolean isCreerMode() {
		return ActionPlatEnum.creer.equals(action);
	}
	
	public Plat findPlat(Integer idPlat) {
		return platDao.findById(idPlat);		
	}

	public void creerNouveauPlat(ComposantPlat composantPlat) {
		platDao.creer(composantPlat.getComposantPlatId().getPlat());
		ingredientDao.creer(composantPlat.getComposantPlatId().getIngredient());
		composantPlatDao.creer(composantPlat);
		
	}
	
	public void editerPlat(Plat plat, ComposantPlat composantPlat) {
		
	}
	
	public ComposantPlat findComposantPlat(Integer idPlat) {
		
		List<ComposantPlat> composantPlats = composantPlatDao.findAllByPlatId(idPlat);
		
		
		return composantPlats.isEmpty() ? null : composantPlats.get(0) ;
	}

}
