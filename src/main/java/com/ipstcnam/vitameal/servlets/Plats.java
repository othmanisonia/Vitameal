package com.ipstcnam.vitameal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipstcnam.vitameal.beans.PlatsControleur;
import com.ipstcnam.vitameal.beans.enums.ActionPlatEnum;
import com.ipstcnam.vitameal.forms.PlatForm;
import com.ipstcnam.vitameal.forms.exception.MalformedFormException;

/**
 * Servlet implementation class Plats
 */
public class Plats extends HttpServlet {
	private static final String PLATS_JSP = "/WEB-INF/Plats.jsp";

	private static final long serialVersionUID = 3064447141542860928L;
	
	private static final String EDITER_PLAT_JSP = "/WEB-INF/EditerPlat.jsp";
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PlatsControleur platsControleur = getControleurFromContext(request);
		
		String action = request.getParameter("action");
		String id = request.getParameter("id");
		
		try {
			if (isWelformedAction(action)) {
				platsControleur.setAction(ActionPlatEnum.valueOf(action));
				platsControleur.setIdPlat(id);
				
				if (platsControleur.isCreerMode() || platsControleur.isEditerMode()) {
					getServletContext().getRequestDispatcher(EDITER_PLAT_JSP).forward(request, response);
				} else {
					getServletContext().getRequestDispatcher(PLATS_JSP).forward(request, response);
				}
			} else {
				doGet(request, response);
			}
		} catch (IOException | ServletException ex) {
			System.err.println(ex.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PlatsControleur platsControleur = getControleurFromContext(request);
		
		try {
			PlatForm platForm = new PlatForm(request);
			
			if (platsControleur.isCreerMode()) {
				platsControleur.creerNouveauPlat(platForm.getComposantPlat());
				getServletContext().getRequestDispatcher(PLATS_JSP).forward(request, response);
			} else if (platsControleur.isEditerMode()) {
				// TODO editer plat
				getServletContext().getRequestDispatcher(PLATS_JSP).forward(request, response);
			}
		} catch (MalformedFormException ex) {
			System.err.println(ex.getMessage());
		}

	}
	
	private boolean isWelformedAction(String actionRequestParameter) {
		return actionRequestParameter != null && ActionPlatEnum.contains(actionRequestParameter);
	}

	private PlatsControleur getControleurFromContext(HttpServletRequest request) {
		PlatsControleur platsControleur = (PlatsControleur) request.getSession().getAttribute("platsControleur");
		if (platsControleur == null) {
			platsControleur = new PlatsControleur();
		}
		request.getSession().setAttribute("platsControleur", platsControleur);
		return platsControleur;
	}

}
