package GreenhouseSimulation;

public class Furnace extends EnvironmentFluctuations implements Runnable {
	
	private double heat_temperature;
	private double lower_temperature;
	
	/**
	 * 
	 * @param greenhouse
	 * @param lower_temperature
	 * @param heat_temperature
	 * @param rate
	 */
	public Furnace(GreenHouseEnvironment greenhouse, double lower_temperature, double heat_temperature, long rate){
		super(greenhouse, rate);
		setHeatTemperature(heat_temperature);
		setLowerTemperature(lower_temperature);
		
	}
	
	public Furnace(){
		super();
		this.setHeatTemperature(0);
		
	}
	
	
	
	/**
	 * @return the heat_temperature
	 */
	public double getHeatTemperature() {
		return heat_temperature;
	}



	/**
	 * @param heat_temperature the heat_temperature to set
	 */
	public void setHeatTemperature(double heat_temperature) {
		this.heat_temperature = heat_temperature;
	}



	/**
	 * @return the lower_temperature
	 */
	public double getLowerTemperature() {
		return lower_temperature;
	}



	/**
	 * @param lower_temperature the lower_temperature to set
	 */
	public void setLowerTemperature(double lower_temperature) {
		this.lower_temperature = lower_temperature;
	}
	
	



	public void run(){
	for(;;){
		if(greenhouse.getTemperature() < this.getLowerTemperature()){
			greenhouse.setTemperature(greenhouse.getTemperature() + this.getHeatTemperature());
			System.out.println("--------------------------------------------------------------------");
			System.out.println("HEATING HEATING HEATING");
			System.out.println("The Temperature in the green house is\t" + greenhouse.getTemperature());
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		}
		else{
			doNothing(getDelayTime());
			System.out.println("--------------------------------------------------------------------");			
			System.out.println("NOT TOO COOL");
			System.out.println("--------------------------------------------------------------------");
		}

	}
	}
	

}



