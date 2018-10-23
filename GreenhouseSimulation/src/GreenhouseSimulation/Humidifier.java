package GreenhouseSimulation;

public class Humidifier extends EnvironmentFluctuations implements Runnable {
	
	private double humidify_power;
	private double upper_humidity_range;
	private double lower_humidity_range;
	
	/**
	 * 
	 * @param greenhouse
	 * @param upper_humidity_range
	 * @param lower_humidity_range
	 * @param humidify_power
	 * @param rate
	 */
	public Humidifier(GreenHouseEnvironment greenhouse, double upper_humidity_range, double lower_humidity_range, double humidify_power, long rate){
		super(greenhouse, rate);
		setHumidifyPower(humidify_power);
		setUpperHumidityRange(upper_humidity_range);
		setLowerHumidityRange(lower_humidity_range);
		
	}
	
	public Humidifier(){
		super();
		setHumidifyPower(17);
		setUpperHumidityRange(30);
		setLowerHumidityRange(0);
	}

	/**
	 * @return the humidify_power
	 */
	public double getHumidifyPower() {
		return humidify_power;
	}



	/**
	 * @param humidify_power the humidify_power to set
	 */
	public void setHumidifyPower(double humidify_power) {
		this.humidify_power = humidify_power;
	}



	/**
	 * @return the upper_humidity_range
	 */
	public double getUpperHumidityRange() {
		return upper_humidity_range;
	}



	/**
	 * @param upper_humidity_range the upper_humidity_range to set
	 */
	public void setUpperHumidityRange(double upper_humidity_range) {
		this.upper_humidity_range = upper_humidity_range;
	}



	/**
	 * @return the lower_humidity_range
	 */
	public double getLowerHumidityRange() {
		return lower_humidity_range;
	}



	/**
	 * @param lower_humidity_range the lower_humidity_range to set
	 */
	public void setLowerHumidityRange(double lower_humidity_range) {
		this.lower_humidity_range = lower_humidity_range;
	}



	public void run(){
	for(;;){
		if(greenhouse.getHumidity() > this.getUpperHumidityRange()){
			greenhouse.setHumidity(greenhouse.getHumidity() - this.getHumidifyPower());
			System.out.println("--------------------------------------------------------------------");
			System.out.println("DE-HUMIDIFYING DE-HUMIDIFYING DE-HUMIDIFYING");
			System.out.println("The Humidity in the green house is\t" + greenhouse.getHumidity());
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		} else if(greenhouse.getHumidity() < this.getLowerHumidityRange()){
			greenhouse.setHumidity(greenhouse.getHumidity() + this.getHumidifyPower());
			System.out.println("--------------------------------------------------------------------");			
			System.out.println("HUMIDIFYING HUMIDIFYING HUMIDIFYING");
			System.out.println("The Humidity in the green house is\t" + greenhouse.getHumidity());
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		} else {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("THE HUMIDITY IS JUST RIGHT");
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		}
		
	}
	}
	

}
