package it.omar.dao;
import java.util.List;
import it.omar.entity.Immobile;

public interface IImmobileDao {
	public boolean add(Immobile immobile);
	public List<Immobile> showAll();
	public Immobile findById(int immobileId);
	public List<Immobile> findBySurface(int immobileSurface);

}
