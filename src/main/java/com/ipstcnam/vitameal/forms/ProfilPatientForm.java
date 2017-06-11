package com.ipstcnam.vitameal.forms;

import javax.servlet.http.HttpServletRequest;

import com.ipstcnam.vitameal.beans.ProfilPatient;
import com.ipstcnam.vitameal.beans.ProfilPatientDAO;

public class ProfilPatientForm {
	private static final String CHAMP_PRENOM  = "p_prenom";
	private static final String CHAMP_NOM  = "p_nom";
	private static final String CHAMP_SEXE  = "p_sexe";
	private static final String CHAMP_AGE  = "p_age";
	private static final String CHAMP_POIDS  = "p_poids";
	private static final String CHAMP_TAILLE  = "p_taille";
	private static final String CHAMP_ALLERGIES  = "p_allergies";
	private static final String CHAMP_CONTREINDICATIONS  = "p_contreIndications";
	private static final String CHAMP_DIABETE  = "p_diabete";
	private static final String CHAMP_COLESTEROL  = "p_colesterol";
	private static final String CHAMP_HYPERTENSION  = "p_hypertension";
	private ProfilPatientDAO leppDAO;
	
	public ProfilPatientForm(ProfilPatientDAO unppDAO) {
		leppDAO = unppDAO;
	}

	public ProfilPatient unPatient(HttpServletRequest request) {
		ProfilPatient patient = new ProfilPatient();
		String valParam;
		patient.setPrenom(request.getParameter(CHAMP_PRENOM));
		patient.setNom(request.getParameter(CHAMP_NOM));
		valParam = request.getParameter(CHAMP_SEXE);
		if (valParam.equals("Homme")) {
			patient.setSexe(true);
		} else {
			patient.setSexe(false);
		}
		valParam = request.getParameter(CHAMP_AGE);
		patient.setAge(Integer.parseInt(valParam));
		valParam = request.getParameter(CHAMP_POIDS);
		patient.setPoids(Integer.parseInt(valParam));
		valParam = request.getParameter(CHAMP_TAILLE);
		patient.setTaille(Integer.parseInt(valParam));
		valParam = request.getParameter(CHAMP_ALLERGIES);
		if (valParam != null && valParam.trim().length() != 0) {
			patient.setAllergies(valParam);
		}
		valParam = request.getParameter(CHAMP_CONTREINDICATIONS);
		if (valParam != null && valParam.trim().length() != 0) {
			patient.setContreIndications(valParam);
		}
		valParam = request.getParameter(CHAMP_DIABETE);
		if (valParam != null && valParam.trim().length() != 0) {
			if (valParam.equals("on")) {
				patient.setDiabete(true);
			} else {
				patient.setDiabete(false);
			}
		} else {
			patient.setDiabete(false);
		}
		valParam = request.getParameter(CHAMP_COLESTEROL);
		if (valParam != null && valParam.trim().length() != 0) {
			if (valParam.equals("on")) {
				patient.setColesterol(true);
			} else {
				patient.setColesterol(false);
			}
		} else {
			patient.setColesterol(false);
		}
		valParam = request.getParameter(CHAMP_HYPERTENSION);
		if (valParam != null && valParam.trim().length() != 0) {
			if (valParam.equals("on")) {
				patient.setHypertension(true);
			} else {
				patient.setHypertension(false);
			}
		} else {
			patient.setHypertension(false);
		}
		leppDAO.creer(patient);

		return patient;
	}
}
