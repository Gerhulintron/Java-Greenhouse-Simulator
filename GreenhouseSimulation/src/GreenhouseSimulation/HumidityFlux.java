package GreenhouseSimulation;

	public class HumidityFlux extends EnvironmentFluctuations implements Runnable {

		private double humidity_flux;
		
		/**
		 * 
		 * @param greenhouse
		 * @param humidity_flux
		 * @param delayTime
		 */
		public HumidityFlux(GreenHouseEnvironment greenhouse, double humidity_flux, long delayTime) {
			super(greenhouse, delayTime);
			this.humidity_flux = humidity_flux;
}
		
		public void run(){
		for(;;){
			greenhouse.setHumidity(greenhouse.getHumidity() + humidity_flux);
			System.out.println("The Humidity in the green house is\t" + greenhouse.getHumidity() + "%");
			doNothing(getDelayTime());

		}	

	}	
	}
