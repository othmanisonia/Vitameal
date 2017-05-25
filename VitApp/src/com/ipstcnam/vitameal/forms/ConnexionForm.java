package com.ipstcnam.vitameal.forms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import com.ipstcnam.vitameal.beans.Utilisateur;

public class ConnexionForm {
    private static final String CHAMP_NOM  = "j_username";
    private static final String CHAMP_PASS   = "j_password";

    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    private static final Map<String, String> REGISTRED_USERS =
    	    Arrays.stream(new String[][] {
    	        { "VitaDiet", "vitadiet" },
    	        { "VitaMed", "vitamed" }, 
    	        { "Nicolas", "nicolas" },
    	        { "Sonia", "sonia" },
    	        { "Jean-Félix", "jean-félix" }
    	    }).collect(Collectors.toMap(kv -> kv[0], kv -> kv[1]));
    
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public Utilisateur connecterUtilisateur( HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
        String nom = getValeurChamp( request, CHAMP_NOM );
        String unMotDePasse = getValeurChamp( request, CHAMP_PASS );

        Utilisateur utilisateur = new Utilisateur();

    	if (REGISTRED_USERS.containsKey(nom)) {
    		String mdp = REGISTRED_USERS.get(nom);
        	if (unMotDePasse.equals(mdp)) {
        		utilisateur.setNom(nom);
        		utilisateur.setMotDePasse(unMotDePasse);
        	}
    	} else {
    		setErreur( CHAMP_PASS, "Nom ou mot de passe incorrect." );
    	}

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de la connexion.";
        } else {
            resultat = "Échec de la connexion.";
        }

        return utilisateur;
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }
}
