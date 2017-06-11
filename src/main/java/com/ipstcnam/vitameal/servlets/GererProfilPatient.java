package com.ipstcnam.vitameal.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipstcnam.vitameal.beans.ProfilPatient;
import com.ipstcnam.vitameal.forms.ProfilPatientForm;

/**
 * Servlet implementation class ProfilPatient
 */
public class GererProfilPatient extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8677455699014006445L;
	private static final String PROFILP = "/WEB-INF/ProfilPatient.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext currentContext = this.getServletContext();
		currentContext.getRequestDispatcher(PROFILP).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfilPatientForm ppForm = new ProfilPatientForm();
		ProfilPatient patient = ppForm.unPatient(request);
		System.out.println(patient.toString());
		this.getServletContext().getRequestDispatcher(PROFILP).forward(request, response);
	}

}
