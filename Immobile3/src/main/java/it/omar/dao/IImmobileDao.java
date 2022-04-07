package it.omar.dao;
import java.util.List;
import it.omar.entity.Immobile;
import it.omar.entity.ImmobileOwner;

public interface IImmobileDao {
	public Immobile add(Immobile immobile);
	public List<Immobile> showAll();
	public Immobile findById(int immobileId);
	public List<Immobile> findBySurface(int immobileSurface);
	public ImmobileOwner addOwner(ImmobileOwner immobileOwner);

}
