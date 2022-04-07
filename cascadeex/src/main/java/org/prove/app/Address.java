package org.prove.app;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
   
    @OneToOne
    private Person person;
    
	public Address() {
		super();
	}

	public Address( String street) {
		
		this.street = street;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}



	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
    
}