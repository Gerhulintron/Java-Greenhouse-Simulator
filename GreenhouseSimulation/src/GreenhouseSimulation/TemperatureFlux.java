package GreenhouseSimulation;


public class TemperatureFlux extends EnvironmentFluctuations implements Runnable{
	

	private double temperature_flux;
//	GreenHouseEnvironment greenhouse = new GreenHouseEnvironment(20, 26, 26, 20, 20, 20, 60);	
	
	/**
	 * Constructor for setting and displaying the temperature fluctuations
	 * @param greenhouse
	 * @param temperature_flux
	 * @param delayTime
	 */
	public TemperatureFlux(GreenHouseEnvironment greenhouse, double temperature_flux, long delayTime) {
		super(greenhouse, delayTime);
		this.temperature_flux = temperature_flux;
	
		
		
	}
	
	
	public void run(){
	for(;;){
		greenhouse.setTemperature(greenhouse.getTemperature() + temperature_flux);
		System.out.println("The Temperature in the green house is\t" + greenhouse.getTemperature() + "C");
		doNothing(getDelayTime());

	}	

}	
}
