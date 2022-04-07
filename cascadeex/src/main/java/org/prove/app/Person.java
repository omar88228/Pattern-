package org.prove.app;

import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	 @OneToOne(mappedBy = "person",cascade = CascadeType.MERGE)
	private Address addresses;

	public Person(String name) {

		this.name = name;

	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddresses() {
		return addresses;
	}

	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}

}
