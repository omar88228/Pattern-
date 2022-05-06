package it.immobile.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.immobile.ejbSession.IAddressLocal;
import it.immobile.ejbSession.IImmobileLocal;
import it.immobile.entity.Address;
import it.immobile.entity.Immobile;

@Stateless
@Path(value = "/immobile")
@Api(tags = { "immobile api" })

public class RestService {

	@EJB
	IImmobileLocal immobileLocal;
	@EJB
	IAddressLocal addressLocal;

	@POST
	@Path(value = "/immobiles/new")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "add a new immobile ", response = Immobile.class)
	public Immobile addImmobile(Immobile immobile) {
		return immobileLocal.add(immobile);
	}

	@GET
	@Path(value = "/immobiles/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Get a immobile by id", notes = "Returns a immobile as per the id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully "),
			@ApiResponse(code = 404, message = "Not found - The immobile was not found") })
	public Immobile showImmobileById(
			@PathParam(value = "id") @ApiParam(name = "id", value = "immobile id", example = "1") int id) {
		return immobileLocal.showById(id);
	}

	@GET
	@Path(value = "/immobiles")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Get all immobiles ", notes = "Returns a immobile list", response = List.class)
	public List<Immobile> showAllImmobiles() {
		return immobileLocal.showAll();
	}

	@PUT
	@Path(value = "/immobiles/{idImmobile}/address/{idAddress}")
	@ApiOperation(value = "add an address to a immobile  ", response = Immobile.class)
	@Produces(MediaType.APPLICATION_JSON)
	public Immobile addAddressToImmobile(
			@PathParam(value = "idImmobile") @ApiParam(name = "idImmobile", value = "immobile id", example = "1") int idImmobile,
			@PathParam(value = "idAddress") @ApiParam(name = "idImmobile", value = "address id", example = "1") int idAddress) {
		return immobileLocal.addAddress(idImmobile, idAddress);
	}

	@POST
	@Path(value = "/addresses/new")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "add a new address ", response = Address.class)
	public Address addAddres(Address address) {
		return addressLocal.add(address);
	}

	@GET
	@Path(value = "/addresses")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Get all addresses ", notes = "Returns a address list", response = List.class)
	public List<Address> showAllAddresses() {
		return addressLocal.showAll();
	}

	@DELETE
	@Path(value = "/immobiles/{idImmobile}")
	@ApiOperation(value = "delete a immobile by id", notes = "delete a immobile as per the id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved"),
			@ApiResponse(code = 404, message = "Not found - The immobile was not found") })
	@Produces(MediaType.APPLICATION_JSON)
	public Immobile deleteImmobile(
			@PathParam(value = "idImmobile") @ApiParam(name = "idImmobile", value = "address id", example = "1") int idImmobile) {
		return immobileLocal.delete(idImmobile);
	}

	@DELETE
	@Path(value = "/addresses/{idAddress}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "delete a address by id", notes = "delete a address as per the id")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved"),
			@ApiResponse(code = 404, message = "Not found - The immobile was not found")
			})
	public Immobile deleteAddress(@PathParam(value = "idAddress") @ApiParam(name = "idAddress", value = "address id", example = "1") int idAddress) {
		return immobileLocal.delete(idAddress);
	}

}
