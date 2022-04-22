package it.soap.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import it.soap.dao.ImmobileDaoImpl;
import it.soap.entity.Address;
import it.soap.entity.Immobile;

@WebService
public class ImmobileSoapService {
	
	private ImmobileDaoImpl daoImpl ;

	public ImmobileSoapService() {
		super();
		this.daoImpl = new ImmobileDaoImpl();
	}
	
	@WebMethod(operationName = "addImmobile")
	public Immobile addImmobile(Immobile immobile) {
		return daoImpl.add(immobile);
	}

	@WebMethod(operationName = "showImmobiles")
	public List<Immobile> showAllImmobile() {
		return daoImpl.showAll();
	}

	@WebMethod(operationName = "showImmobilesById")
	public Immobile findImmobileById(@WebParam(name = "idImmobile") int id) {
		return daoImpl.findById(id);
	}
	
	@WebMethod(operationName = "findImmobileBySurface")
	public List<Immobile>findImmobileBySurface(@WebParam(name = "surfaceImmobile")int surface ){
		return daoImpl.findBySurface(surface);	
	}
	
	@WebMethod(operationName = "addAddressToImoobile")
	public Immobile addAddressToImoobile(@WebParam(name = "IdImmobile")int id ,@WebParam(name = "idAddress") int idAddress) {
		return daoImpl.addAddressToImmobile(id, idAddress);
	}
	@WebMethod(operationName = "addAdress")
	public Address addAdress(Address address) {
		return daoImpl.addAddress(address);
	}
}
