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
import it.immobile.entity.Immobile;
@WebServlet(urlPatterns = "/immobiles" )
public class ImmobileListServlet extends HttpServlet {
	@EJB
	IImmobileLocal iImmobileLocal;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Immobile>immobilesList = iImmobileLocal.showAll();
		req.setAttribute("immobilesList", immobilesList);
		req.getRequestDispatcher("/immobileList.jsp").forward(req, resp);
	}
}
