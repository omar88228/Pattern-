package it.immobile.controller;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.immobile.ejbSession.IAddressLocal;
import it.immobile.entity.Address;


@WebServlet(urlPatterns = "/address" )
public class NewAddressServlet extends HttpServlet {
	
	@EJB
	IAddressLocal addressLocal;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/addressForum.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String street = req.getParameter("street");
		int cap = Integer.parseInt(req.getParameter("cap"));
		String city = req.getParameter("city");
		String province = req.getParameter("province");
		String region = req.getParameter("region");
		Address address = new Address(cap, street, city, province, region);
		addressLocal.add(address);
		List< Address> addresses = addressLocal.showAll();
		req.setAttribute("addresses", addresses);
		req.getRequestDispatcher("/addressList.jsp").forward(req, resp);	
	}
}
