package it.omar.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.omar.enumeration.Type;
@Entity
@DiscriminatorValue("G")
public class Garage extends Immobile implements Serializable {
	
	private static final long serialVersionUID = -5705237215009620764L;
	
	@Column(name="GATETYPE")
	private String gateType;

	public Garage() {
		super();
	}

	public Garage(int surface, int localNumber, Address address, Type type,String gateType) {
		super(surface, localNumber, address, type);	
		this.gateType=gateType;
	}

	public void setGateType(String gateType) {
		this.gateType = gateType;
	}

	public String getGateType() {
		return gateType;
	}

	@Override
	public String estateType() {
		return super.estateType() + " the gate type is : " + this.gateType;
	}

}
