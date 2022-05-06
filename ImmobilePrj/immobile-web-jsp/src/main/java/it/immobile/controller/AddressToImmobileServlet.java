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
import it.immobile.ejbSession.IAddressLocal;
import it.immobile.ejbSession.IImmobileLocal;
import it.immobile.entity.Address;
import it.immobile.entity.Immobile;

@WebServlet(urlPatterns = "/addressToImobile" )
public class AddressToImmobileServlet extends HttpServlet {
	@EJB
	IImmobileLocal immobileLocal;
	@EJB
	IAddressLocal addressLocal ;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Immobile> immobiles = immobileLocal.showAll();
		List<Integer>idsImmobile= new ArrayList<Integer>();
		for (Immobile immobile : immobiles) {
			idsImmobile.add(immobile.getId());
		} 
		List<Address> addresses = addressLocal.showAll();
		List<Integer> idsAdderes = new ArrayList<Integer>();
		for (Address address : addresses) {
			idsAdderes.add(address.getId());
		}
		req.setAttribute("idsImmobile", idsImmobile);
		req.setAttribute("idsAdderes", idsAdderes);
		req.getRequestDispatcher("/addressToImmobile.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idImmobile = Integer.parseInt(req.getParameter("idImmobile"));
		int idAddress = Integer.parseInt(req.getParameter("idAddress"));
		Immobile immobile = immobileLocal.addAddress(idImmobile, idAddress);
		req.setAttribute("immobile", immobile);
		req.getRequestDispatcher("/immobileInfo.jsp").forward(req, resp);
	}
	
}
