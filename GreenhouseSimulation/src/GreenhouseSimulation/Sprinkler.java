package GreenhouseSimulation;

public class Sprinkler extends EnvironmentFluctuations implements Runnable {
	
	private double sprinkler_power;
	private double upper_soil_moisture_range;
	private double lower_soil_moisture_range;
	
	/**
	 * Constructor to set the upper and lower soil moisture ranges and sprinkler power/rate
	 * @param greenhouse
	 * @param upper_soil_moisture_range
	 * @param lower_soil_moisture_range
	 * @param sprinkler_power
	 * @param rate
	 */
	public Sprinkler(GreenHouseEnvironment greenhouse, double upper_soil_moisture_range, double lower_soil_moisture_range, double sprinkler_power, long rate){
		super(greenhouse, rate);
		setSprinklerPower(sprinkler_power);
		setUpperSoilMoistureRange(upper_soil_moisture_range);
		setLowerSoilMoistureRange(lower_soil_moisture_range);
		
	}
	
	public Sprinkler(){
		super();
		setSprinklerPower(1);
		setUpperSoilMoistureRange(12);
		setLowerSoilMoistureRange(0);
	}
	


	/**
	 * @return the sprinkler_power
	 */
	public double getSprinklerPower() {
		return sprinkler_power;
	}



	/**
	 * @param sprinkler_power the sprinkler_power to set
	 */
	public void setSprinklerPower(double sprinkler_power) {
		this.sprinkler_power = sprinkler_power;
	}



	/**
	 * @return the upper_soil_moisture_range
	 */
	public double getUpperSoilMoistureRange() {
		return upper_soil_moisture_range;
	}



	/**
	 * @param upper_soil_moisture_range the upper_soil_moisture_range to set
	 */
	public void setUpperSoilMoistureRange(double upper_soil_moisture_range) {
		this.upper_soil_moisture_range = upper_soil_moisture_range;
	}



	/**
	 * @return the lower_soil_moisture_range
	 */
	public double getLowerSoilMoistureRange() {
		return lower_soil_moisture_range;
	}



	/**
	 * @param lower_soil_moisture_range the lower_soil_moisture_range to set
	 */
	public void setLowerSoilMoistureRange(double lower_soil_moisture_range) {
		this.lower_soil_moisture_range = lower_soil_moisture_range;
	}



	public void run(){
	for(;;){
		if(greenhouse.getSoilMoisture() > this.getUpperSoilMoistureRange()){
			greenhouse.setSoilMoisture(greenhouse.getSoilMoisture() - this.getSprinklerPower());
			System.out.println("--------------------------------------------------------------------");
			System.out.println("DE-MOISTURIZING DE-MOISTURIZING DE-MOISTURIZING");
			System.out.println("The SoilMoisture in the green house is\t" + greenhouse.getSoilMoisture());
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		} else if(greenhouse.getSoilMoisture() < this.getLowerSoilMoistureRange()){
			greenhouse.setSoilMoisture(greenhouse.getSoilMoisture() + this.getSprinklerPower());
			System.out.println("--------------------------------------------------------------------");			
			System.out.println("MOISTURIZING MOISTURIZING MOISTURIZING");
			System.out.println("The SoilMoisture in the green house is\t" + greenhouse.getSoilMoisture());
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		} else {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("THE MOISTURE IS JUST RIGHT");
			System.out.println("--------------------------------------------------------------------");
			doNothing(getDelayTime());
		}
		
	}
	}
	

}
