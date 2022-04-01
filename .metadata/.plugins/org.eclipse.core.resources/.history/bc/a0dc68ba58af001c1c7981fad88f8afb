package builder;

import entity.Garage;

public class BuilderGarage extends BuilderImmobile {
	private String gateType;

	public BuilderGarage gateType(String gateType) {
		this.gateType = gateType;
		return this;
	}



	@Override
	public Garage buildGarage() {
		Garage garage = super.buildGarage();
		garage.setGateType(gateType);
		return garage;
	}

}
