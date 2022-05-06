package it.immobile.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import it.immobile.entity.Immobile;
import it.immobile.service.ImmobileService;

@RestController
public class Controller {
	@Autowired
	ImmobileService service;
	
	@PutMapping("/immobiles/new")
	public Immobile addImmobile(Immobile immobile) {
		return service.addImmobile(immobile);
	}
	@GetMapping("/immobiles/{id}")
	public Immobile showImmobileById(@PathVariable("id") int id) {
		return service.findImmobileById(id);
	}
	@GetMapping( path = "/immobiles", produces = "application/json")
    
	public  List<Immobile> showAllImmobiles(int id) {
		return service.showAllImmobiles(id);
	}
	@DeleteMapping("/immobiles/{idImmobile}")
	public void deleteImmobile(@PathVariable("idImmobile") int id) {
		service.deleteImmobile(id);
	}
	@PatchMapping("/immobiles/{idImmobile}/{immobileSurface}")
	public Immobile updateImmobileSurface(@PathVariable("idImmobile") int id, @PathVariable("immobileSurface")  int surface) {
		return service.updateImmobileSurface(id, surface);
	}
	@PutMapping("/immobiles/{idImmobile}/address/{idAddress}")
	public Immobile addAddressToImmobile( @PathVariable("idImmobile")  int idImmobile, @PathVariable("idAddress")  int idAddress) {
		return service.addAddressToImmobile(idImmobile, idAddress);
	}
	
}
