package GreenhouseSimulation;
public class GreenHouseEnvironment extends Environment{
	
	private double temp_flux;
	private double humid_flux;
	private double moist_flux;
	private double temp_rate;// in seconds
	private double humid_rate;
	private double moist_rate;	


	
	//Constructor
	
	/**
	 * 
	 * @param initial_temperature
	 * @param initial_humidity
	 * @param initial_moisture
	 * @param temp_flux
	 * @param humid_flux
	 * @param moist_flux
	 * @param rate
	 * @param temp_rate
	 * @param humid_rate
	 * @param moist_rate
	 */
	public GreenHouseEnvironment(double initial_temperature, double initial_humidity, double initial_moisture, 
			double temp_flux, double humid_flux, double moist_flux, double rate, double temp_rate,
			double humid_rate, double moist_rate){
		
		super(initial_temperature, initial_humidity, initial_moisture);
		System.out.println("Created an external environment.");
		this.temp_flux = temp_flux;
		this.humid_flux = humid_flux;
		this.moist_flux = moist_flux;
		this.temp_rate = temp_rate;
		this.humid_rate = humid_rate;
		this.moist_rate = moist_rate;
	}
	
	public GreenHouseEnvironment(){
		this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		System.out.println("Created a default exterior environment.");
	}
	
	/**
	 * 
	 * @param seconds
	 * @return milliseconds (seconds * 1000)
	 */
	public double convertMilliseconds(double seconds){
		return seconds * 1000;
	}
	
	//Copy constructor
//	public GreenHouseEnvironment(){
//		super(0,0,0);

//	}

	/**
	 * 
	 * @return humid_flux
	 */
	public double getHumidFlux() {
		return humid_flux;
	}

	/**
	 * 
	 * @param humid_flux
	 */
	public void setHumidFlux(double humid_flux) {
		this.humid_flux = humid_flux;
	}

	/**
	 * 
	 * @return temp_flux
	 */
	public double getTempFlux() {
		return temp_flux;
	}

	/**
	 * 
	 * @param temp_flux
	 */
	public void setTempFlux(double temp_flux) {
		this.temp_flux = temp_flux;
	}

	/**
	 * 
	 * @return moist_flux
	 */
	public double getMoistFlux() {
		return moist_flux;
	}

	/**
	 * 
	 * @param moist_flux
	 */
	public void setMoistFlux(double moist_flux) {
		this.moist_flux = moist_flux;
	}


	
	/**
	 * @return the temp_rate
	 */
	public double getTempRate() {
		return temp_rate;
	}

	/**
	 * @param temp_rate the temp_rate to set
	 */
	public void setTempRate(double temp_rate) {
		this.temp_rate = temp_rate;
	}

	/**
	 * @return the humid_rate
	 */
	public double getHumidRate() {
		return humid_rate;
	}

	/**
	 * @param humid_rate the humid_rate to set
	 */
	public void setHumidRate(double humid_rate) {
		this.humid_rate = humid_rate;
	}

	/**
	 * @return the moist_rate
	 */
	public double getMoistRate() {
		return moist_rate;
	}

	/**
	 * @param moist_rate the moist_rate to set
	 */
	public void setMoistRate(double moist_rate) {
		this.moist_rate = moist_rate;
	}

	public String toString(){
		String valueOf = "The Temperature in the green house is\t" + this.getTemperature() + "C"
						+"\nThe Humidity in the greenhouse is\t" + this.getHumidity() + "%"
						+"\nThe Soil Moisture in the greenhouse is\t" + this.getSoilMoisture() + "%";
					return valueOf;
	}
}
