package it.omar.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "IMMOBILE_OWNER")
public class ImmobileOwner implements Serializable {

	private static final long serialVersionUID = -7627019662340966630L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OWNER_ID")
	private int id;

	@Column(name = "OWNER_NAME" )
	private String name;
	
	@Column(name = "OWNER_LAST_NAME",nullable = true)
	
	private String lastName;

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
