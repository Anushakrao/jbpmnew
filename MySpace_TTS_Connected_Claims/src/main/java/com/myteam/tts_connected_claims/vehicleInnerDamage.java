package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class vehicleInnerDamage implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("fluidsLeaking")
	private java.lang.Boolean fluidsLeaking;

	@org.kie.api.definition.type.Label("bonnetCannotOpen")
	private java.lang.Boolean bonnetCannotOpen;

    @org.kie.api.definition.type.Label(value = "windscreenDamaged")
	private java.lang.Boolean windscreenDamaged;

    @org.kie.api.definition.type.Label("wheelObstructed")
	private java.lang.Boolean wheelObstructed;

    @org.kie.api.definition.type.Label("airbagsDeployed")
	private java.lang.Boolean airbagsDeployed;

	@org.kie.api.definition.type.Label("suspensionDamaged")
	private java.lang.Boolean suspensionDamaged;

	@org.kie.api.definition.type.Label(value = "undercarriageDamaged")
	private java.lang.Boolean undercarriageDamaged;

    @org.kie.api.definition.type.Label("vehicleOverturned")
	private java.lang.Boolean vehicleOverturned;


	public vehicleInnerDamage() {
	}

	public java.lang.Boolean getFluidsLeaking() {
		return this.fluidsLeaking;
	}

	public void setFluidsLeaking(java.lang.Boolean fluidsLeaking) {
		this.fluidsLeaking = fluidsLeaking;
	}

	public java.lang.Boolean getBonnetCannotOpen() {
		return this.bonnetCannotOpen;
	}

	public void setBonnetCannotOpen(java.lang.Boolean bonnetCannotOpen) {
		this.bonnetCannotOpen = bonnetCannotOpen;
	}

	public java.lang.Boolean getWindscreenDamaged() {
		return this.windscreenDamaged;
	}

	public void setWindscreenDamaged(java.lang.Boolean windscreenDamaged) {
		this.windscreenDamaged = windscreenDamaged;
	}
	
	public java.lang.Boolean getWheelObstructed() {
		return this.wheelObstructed;
	}

	public void setWheelObstructed(java.lang.Boolean wheelObstructed) {
		this.wheelObstructed = wheelObstructed;
	}

	public java.lang.Boolean getAirbagsDeployed() {
		return this.airbagsDeployed;
	}

	public void setAirbagsDeployed(java.lang.Boolean airbagsDeployed) {
		this.airbagsDeployed = airbagsDeployed;
	}
	
	public java.lang.Boolean getSuspensionDamaged() {
		return this.suspensionDamaged;
	}

	public void setSuspensionDamaged(java.lang.Boolean suspensionDamaged) {
		this.suspensionDamaged = suspensionDamaged;
	}

	public java.lang.Boolean getUndercarriageDamaged() {
		return this.undercarriageDamaged;
	}

	public void setUndercarriageDamaged(java.lang.Boolean undercarriageDamaged) {
		this.undercarriageDamaged = undercarriageDamaged;
	}
	
	public java.lang.Boolean getVehicleOverturned() {
		return this.vehicleOverturned;
	}

	public void setVehicleOverturned(java.lang.Boolean vehicleOverturned) {
		this.vehicleOverturned = vehicleOverturned;
	}

	public vehicleInnerDamage(java.lang.Boolean vehicleOverturned,
			java.lang.Boolean airbagsDeployed, java.lang.Boolean fluidsLeaking,
			java.lang.Boolean bonnetCannotOpen,
			java.lang.Boolean suspensionDamaged,
			java.lang.Boolean wheelObstructed,
			java.lang.Boolean windscreenDamaged,
			java.lang.Boolean undercarriageDamaged) {
		
		this.fluidsLeaking = fluidsLeaking;
		this.bonnetCannotOpen = bonnetCannotOpen;
		this.windscreenDamaged = windscreenDamaged;
		this.wheelObstructed = wheelObstructed;
		this.airbagsDeployed = airbagsDeployed;
		this.suspensionDamaged = suspensionDamaged;
		this.undercarriageDamaged = undercarriageDamaged;
		this.vehicleOverturned = vehicleOverturned;
	}

}