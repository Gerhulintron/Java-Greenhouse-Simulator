package GreenhouseSimulation;

public class MoistureFlux extends EnvironmentFluctuations implements Runnable {

	private double moisture_flux;
	
	/**
	 * Constructor for getting and showing the moisture fluctuations 
	 * @param greenhouse
	 * @param moisture_flux
	 * @param delayTime
	 */
	public MoistureFlux(GreenHouseEnvironment greenhouse, double moisture_flux, long delayTime) {
		super(greenhouse, delayTime);
		this.moisture_flux = moisture_flux;
}
	
	public void run(){
	for(;;){
		greenhouse.setSoilMoisture(greenhouse.getSoilMoisture() + moisture_flux);
		System.out.println("The Soil Moisture of the green house is\t" + greenhouse.getSoilMoisture() + "%");
		doNothing(getDelayTime());

	}	

}	
}	

