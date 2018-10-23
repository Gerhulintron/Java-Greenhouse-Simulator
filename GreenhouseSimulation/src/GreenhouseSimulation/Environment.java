package GreenhouseSimulation;
public abstract class Environment {
	
	private double temperature;
	private double humidity;
	private double soil_moisture;
	
	/**
	 * 
	 * @param temperature
	 * @param humidity
	 * @param soil_moisture
	 */
	public Environment(double temperature, double humidity, double soil_moisture) {
		setTemperature(temperature);
		setHumidity(humidity);
		setSoilMoisture(soil_moisture);
	}
	
	public Environment(){
		this(0,0,0);
	}
	
	//Getters and Setters

	/**
	 * 
	 * @return temperature
	 */
	double getTemperature() {
		return temperature;
	}

	/**
	 * 
	 * @param temperature
	 */
	void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * 
	 * @return humidity
	 */
	double getHumidity() {
		return humidity;
	}

	/**
	 * 
	 * @param humidity
	 */
	void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	/**
	 * 
	 * @return soil_moisture
	 */
	double getSoilMoisture() {
		return soil_moisture;
	}

	/**
	 * 
	 * @param soil_moisture
	 */
	void setSoilMoisture(double soil_moisture) {
		this.soil_moisture = soil_moisture;
	}
	
	
	
}
