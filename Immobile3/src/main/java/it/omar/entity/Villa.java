package entity;

import java.io.Serializable;

import javax.persistence.*;

import enumeration.Type;
@Entity
@DiscriminatorValue("V")
public class Villa extends Immobile implements Serializable {

	private static final long serialVersionUID = 8556694493311128510L;
	@Column(name="NUMBER_OF_SWIMMINGPOOLS")
	private int numberOfSwimmingpools;
	@Column(name="GATETYPE")
	private String gateType ;
	
	public Villa(int numberOfSwimmingpools, String gateType,int surface, int localNumber, Address address,Type type) {
		super(surface, localNumber, address, type);
		this.numberOfSwimmingpools = numberOfSwimmingpools;
		this.gateType = gateType;
	}
	
	public Villa(int surface, int localNumber, Address address, Type type) {
		super(surface, localNumber, address, type);
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
