package GreenhouseSimulation;
public class Instruments{
	
	private double upper_temperature = 0;
	private double lower_temperature = 0;
	private double upper_humidity = 0;
	private double lower_humidifier = 0;
	private double upper_moisture = 0;
	private double lower_moisture = 0;
	
	
	//Constructors -------------------------------------------------------------------
	
	/**
	 * 
	 * @param upper_temperature
	 * @param lower_temperature
	 * @param upper_humidity
	 * @param lower_humidity
	 * @param upper_moisture
	 * @param lower_moisture
	 */
	public Instruments(double upper_temperature, double lower_temperature, double upper_humidity,double lower_humidity,
			double upper_moisture, double lower_moisture){
		
		
		setUpperTemperature(upper_temperature);
		setLowerTemperature(lower_temperature);
		setUpperHumidity(upper_humidity);
		setLowerHumidity(lower_humidity);
		setUpperMoisture(upper_moisture);
		setLowerMoisture(lower_moisture);
		
		System.out.println("Created an external environment.");
		
	}
	
	//Copy constructor
	public Instruments(){
		
		System.out.println("Created a default exterior environment.");
	}

	
	
	//Setters and Getters---------------------------------------------------------
	/**
	 * 
	 * @return upper_temperature
	 */
	public double getUpperTemperature() {
		return upper_temperature;
	}

	/**
	 *
	 * @param upper_temperature 
	 */
	public void setUpperTemperature(double upper_temperature) {
		this.upper_temperature = upper_temperature;
	}

	/**
	 * 
	 * @return lower_temperature
	 */
	public double getLowerTemperature() {
		return lower_temperature;
	}

	/**
	 * 
	 * @param lower_temperature
	 */
	public void setLowerTemperature(double lower_temperature) {
		this.lower_temperature = lower_temperature;
	}

	/**
	 * 
	 * @return upper_humidity
	 */
	public double getUpperHumidity() {
		return upper_humidity;
	}

	/**
	 * 
	 * @param upper_humidity
	 */
	public void setUpperHumidity(double upper_humidity) {
		this.upper_humidity = upper_humidity;
	}

	/**
	 * 
	 * @return lower_humidifier
	 */
	public double getLowerHumidity() {
		return lower_humidifier;
	}

	/**
	 * 
	 * @param lower_humidifier
	 */
	public void setLowerHumidity(double lower_humidifier) {
		this.lower_humidifier = lower_humidifier;
	}

	/**
	 * 
	 * @return upper_moisture
	 */
	public double getUpperMoisture() {
		return upper_moisture;
	}

	/**
	 * 
	 * @param upper_moisture
	 */
	public void setUpperMoisture(double upper_moisture) {
		this.upper_moisture = upper_moisture;
	}

	/**
	 * 
	 * @return lower_moisture
	 */
	public double getLowerMoisture() {
		return lower_moisture;
	}

	/**
	 * 
	 * @param lower_moisture
	 */
	public void setLowerMoisture(double lower_moisture) {
		this.lower_moisture = lower_moisture;
	}

	/**
	 * This will return true if a number is lower than the lower threshold
	 * @param lowest_limit
	 * @param measured_unit
	 * @return boolean
	 */
	public static boolean belowThreshold(double measured_unit, double lowest_limit){
		if(measured_unit < lowest_limit){
			System.out.println("The number is lower than the threshold."); 
			return true;
			}
		else {
			System.out.println("The number is not lower than the threshold.");
			return false;
		}
		}
	
	/**
	 *  This will return true if a number is higher than the threshold
	 * @param measured_unit
	 * @param highest_limit
	 * @return boolean
	 */
	public static boolean aboveTheshold(double measured_unit, double highest_limit){
		if(measured_unit > highest_limit){
			System.out.println("The number is higher than the threshold.");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This will return true if the number is within the range
	 * @param highest_limit
	 * @param lowest_limit
	 * @param number
	 * @return boolean
	 */
	public static boolean rangeCheck(double highest_limit, double lowest_limit, double number ){
		if(belowThreshold(highest_limit, number) && aboveTheshold(lowest_limit, number)){
			System.out.println("The number is within the range of " + highest_limit + " and " + lowest_limit);
			return true;}
		else {
			return false;
		}
	}
	
		
	}
	

