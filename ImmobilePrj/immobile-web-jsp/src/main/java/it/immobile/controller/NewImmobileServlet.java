package it.immobile.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.immobile.ejbSession.IImmobileLocal;
import it.immobile.entity.Address;
import it.immobile.entity.Immobile;
import it.rest.enumeration.Type;

@WebServlet(urlPatterns = "/immobile" )
public class NewImmobileServlet extends HttpServlet {
	
	@EJB
	IImmobileLocal iImmobileLocal;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/immobileForum.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int surface =Integer.parseInt(req.getParameter("surface"));
		int localNumber =Integer.parseInt(req.getParameter("localNumber"));
		String type =req.getParameter("type").toUpperCase();
		String street = req.getParameter("street");
		int cap = Integer.parseInt(req.getParameter("cap"));
		String city = req.getParameter("city");
		String province = req.getParameter("province");
		String region = req.getParameter("region");
		Address address = new Address(cap, street, city, province, region);
		Immobile immobile = new Immobile(surface, localNumber,type , address);
		iImmobileLocal.add(immobile);
		List<Immobile>immobilesList = iImmobileLocal.showAll();
		req.setAttribute("immobilesList", immobilesList);
		req.getRequestDispatcher("/immobileList.jsp").forward(req, resp);	
	}
	
}
