package it.immobile.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.immobile.ejbSession.IImmobileLocal;
import it.immobile.entity.Immobile;
@WebServlet(urlPatterns = "/immobileById" )
public class SelectByIdservlet extends HttpServlet {
	@EJB
	IImmobileLocal iImmobileLocal;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Immobile> immobiles = iImmobileLocal.showAll();
		List<Integer>ids= new ArrayList<Integer>();
		for (Immobile immobile : immobiles) {
			ids.add(immobile.getId());
		} 
		req.setAttribute("ids", ids);
		req.getRequestDispatcher("/selectById.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Immobile immobile = iImmobileLocal.showById(id);
		req.setAttribute("immobile", immobile);
		req.getRequestDispatcher("/immobileInfo.jsp").forward(req, resp);
	}
	
}
