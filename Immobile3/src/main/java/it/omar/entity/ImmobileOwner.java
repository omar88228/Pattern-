package it.omar.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "T_IMMOBILE_OWNER")
public class ImmobileOwner implements Serializable {

	private static final long serialVersionUID = -7627019662340966630L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OWNER_ID")
	private int id;

	@Column(name = "OWNER_SIZE" ,length = 5)
	private String name;
	
	@Column(name = "OWNER_LAST_NAME",nullable = true)
	
	private String lastName;
	
	@OneToMany(mappedBy = "immobileOwner", cascade = CascadeType.ALL)
	private List<Immobile> immobiles;

	public List<Immobile> getImmobiles() {
		return immobiles;
	}

	public void setImmobiles(List<Immobile> immobiles) {
		this.immobiles = immobiles;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
