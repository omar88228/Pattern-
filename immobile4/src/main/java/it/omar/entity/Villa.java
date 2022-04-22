package it.omar.entity;

import java.io.Serializable;

import javax.persistence.*;

import it.omar.enumeration.Type;
@Entity
@DiscriminatorValue("V")
public class Villa extends Immobile implements Serializable {

	private static final long serialVersionUID = 8556694493311128510L;
	@Column(name="NUMBER_OF_SWIMMINGPOOLS")
	private int numberOfSwimmingpools;
	
	@Column(name="GATETYPE")
	private String gateType ;
	
	public Villa() {
		super();
	}

	public void setNumberOfSwimmingpools(int numberOfSwimmingpools) {
		this.numberOfSwimmingpools = numberOfSwimmingpools;
	}
	public void setGateType(String gateType) {
		this.gateType = gateType;
	}
	
	@Override
	public String estateType() {
		return super.estateType() + " the gate type is : " + this.gateType + " and the number of swimming pool is : " + this.numberOfSwimmingpools;
	}

	
}
