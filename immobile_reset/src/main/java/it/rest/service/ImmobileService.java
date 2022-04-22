package it.rest.service;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.wordnik.swagger.annotations.Api;
import it.rest.dao.ImmobileDaoImpl;
import it.rest.entity.Immobile;

@Path(value = "/immobile")
@Api(value="/immobile", description = "Operations about immobile")
public class ImmobileService {
	
	private ImmobileDaoImpl daoImpl;

	public ImmobileService() {
		super();
		this.daoImpl = new ImmobileDaoImpl();
	}

	@POST
	@Path(value = "/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Immobile addImmobile(Immobile immobile) {
		return daoImpl.add(immobile);
	}

	@GET
	@Path(value = "/listimmobile")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Immobile> showAllImmobile() {
		return daoImpl.showAll();
	}

	@GET
	@Path(value = "/find/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Immobile findImmobileById(@PathParam(value = "id") int id) {
		return daoImpl.findById(id);
	}
	
	@GET
	@Path(value = "/findsurface/{surface}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Immobile>findImmobileBySurface(@PathParam(value = "surface")int surface ){
		return daoImpl.findBySurface(surface);	
	}

}
