package it.omar.dao;
import java.util.List;
import it.omar.entity.Immobile;

public interface IImmobileDao {
	public boolean addImmobile(Immobile immobile);
	public List<Immobile> showAllImmobili();
	public Immobile findImmobileById(int immobileId);
	public List<Immobile> findImmobiliBySurface(int immobileSurface);

}
