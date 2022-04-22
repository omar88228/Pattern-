package it.rest.dao;
import java.util.List;

import it.rest.entity.Immobile;

public interface IImmobileDao  {
	public Immobile add(Immobile immobile);
	public List<Immobile> showAll();
	public Immobile findById(int immobileId);
	public List<Immobile> findBySurface(int immobileSurface);
	
}
