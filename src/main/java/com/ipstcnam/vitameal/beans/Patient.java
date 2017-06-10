package main.java.com.ipstcnam.vitameal.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient implements Serializable {
	private static final long serialVersionUID = 7503530612867464912L;
	@Id
	//@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long idPatient;
	private String prenom;
	private String nom;
	private boolean sexe;
	private int age;
	private int poids;
	private int taille;
	private String allergies;
	private String contreIndications;
	private boolean diabete;
	private boolean colesterol;
	private boolean hypertension;

	public Patient() {
		prenom = "";
		nom = "";
		sexe = true; // homme
		age = 0;
		poids = 0;
		taille = 0;
		allergies = "";
		contreIndications = "";
		diabete = false;
		colesterol = false;
		hypertension = false;
	}
	
	public void setIdPatient(long unId) {
		idPatient = unId;
	}
	
	public void setPrenom(String unPrenom) {
		prenom = unPrenom;
	}
	
	public void setNom(String unNom) {
		nom = unNom;
	}

	public void setSexe(boolean unSexe) {
		sexe = unSexe;
	}

	public void setAge(int unAge) {
		age = unAge;
	}

	public void setPoids(int unPoids) {
		poids = unPoids;
	}

	public void setTaille(int uneTaille) {
		taille = uneTaille;
	}

	public void setAllergies(String desAllergies) {
		allergies = desAllergies;
	}

	public void setContreIndications(String desContreIndications) {
		contreIndications = desContreIndications;
	}

	public void setDiabete(boolean unDiabete) {
		diabete = unDiabete;
	}

	public void setColesterol(boolean unColesterol) {
		colesterol = unColesterol;
	}

	public void setHypertension(boolean uneHypertension) {
		hypertension = uneHypertension;
	}

	public long getIdPatient() {
		return idPatient;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public boolean getSexe() {
		return sexe;
	}

	public int getAge() {
		return age;
	}

	public int getPoids() {
		return poids;
	}

	public int getTaille() {
		return taille;
	}

	public String getAllergies() {
		return allergies;
	}

	public String getContreIndications() {
		return contreIndications;
	}

	public boolean getDiabete() {
		return diabete;
	}

	public boolean getColesterol() {
		return colesterol;
	}

	public boolean gethypertension() {
		return hypertension;
	}
	
	public String toString() {
		String patients = prenom + " " + nom + " ";
		if (sexe) {
			patients += "homme ";
		} else {
			patients += "femme ";
		}
		patients += age + " ans " + poids + " Kg " + taille + " cm\nAllergies: " + allergies + " Contre Indications: " + contreIndications + "\n";
		patients += "Diabète: " + diabete + " Colestérol: " + colesterol + " Hypertension: " + hypertension + "\n";
		return patients;
	}
}
