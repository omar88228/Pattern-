package it.immobile.ejbSession;

import java.util.List;
import javax.ejb.Local;
import it.immobile.entity.Immobile;

@Local
public interface IImmobileLocal {
	
	public Immobile add(Immobile immobile);

	public Immobile showById(int id);

	public List<Immobile> showAll();

	public Immobile addAddress(int idImmobile, int idAddress);
	
	public Immobile delete(int id);
}
