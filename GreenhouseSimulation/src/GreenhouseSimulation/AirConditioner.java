package GreenhouseSimulation;

public class AirConditioner {

}
package GreenhouseSimulation;

public class AirConditioner extends EnvironmentFluctuations implements Runnable {
	
	private double cool_temperature;
	private double upper_temperature;
	
	/**
	 * 
	 * @param greenhouse from GreenHouseEnvironment
	 * @param upper_temperature 
	 * @param cool_temperature
	 * @param rate
	 */
	public AirConditioner(GreenHouseEnvironment greenhouse, double upper_temperature, double cool_temperature, long rate){
		super(greenhouse, rate);
		setCoolTemperature(cool_temperature);
		setUpperTemperature(upper_temperature);
		
	}
	
	public AirConditioner(){
		super();
		setCoolTemperature(0.00);
		setUpperTemperature(30.00);
	}
	
	/**
	 * @return the cool_temperature
	 */
	public double getCoolTemperature() {
		return cool_temperature;
	}



	/**
	 * @param cool_temperature the cool_temperature to set
	 */
	public void setCoolTemperature(double cool_temperature) {
		this.cool_temperature = cool_temperature;
	}



	/**
	 * @return the upper_temperature
	 */
	public double getUpperTemperature() {
		return upper_temperature;
	}



	/**
	 * @param upper_temperature the upper_temperature to set
	 */
	public void setUpperTemperature(double upper_temperature) {
		this.upper_temperature = upper_temperature;
	}



	public void run(){
	for(;;){
		if(greenhouse.getTemperature() > this.getUpperTemperature()){
			greenhouse.setTemperature(greenhouse.getTemperature() + cool_temperature);
			System.out.println("--------------------------------------------------------------------");
			System.out.println("COOLING COOLING COOLING");
			System.out.println("The Temperature in the green house is\t" + greenhouse.getTemperature() + "C");
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		} else {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("NOT TOO HOT");
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		}
		
	}
	}
	

}
