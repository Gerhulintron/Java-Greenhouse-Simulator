package GreenhouseSimulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreenhouseControl {
	private GreenhouseGUI GreenhouseGUI;
	private GreenHouseEnvironment GreenHouse;
	private AirConditioner AirConditioner;
	private Furnace Furnace;
	private Humidifier Humidifier;
	private Sprinkler Sprinkler;
	
	/**
	 * 
	 * @param GreenhouseGUI
	 * @param GreenHouse
	 * @param AirConditioner
	 * @param Furnace
	 * @param Humidifier
	 * @param Sprinkler
	 */
	public GreenhouseControl(GreenhouseGUI GreenhouseGUI, GreenHouseEnvironment GreenHouse, AirConditioner AirConditioner, Furnace Furnace, Humidifier Humidifier, Sprinkler Sprinkler){
		this.GreenhouseGUI = GreenhouseGUI;
		this.GreenHouse = GreenHouse;
		
		this.AirConditioner = AirConditioner;
		this.Furnace = Furnace;
		this.Humidifier = Humidifier;
		this.Sprinkler = Sprinkler;
		
		this.GreenhouseGUI.addSimulationListener(new startListener());
	}
	
	class startListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			startThread();
		}
//			UserSimulationControls.addStartListener();
			
			

	}
	public void startThread(){
		Thread test1, test2, test3, test4, test5, test6, test7, test8;
		GreenHouseEnvironment greenhouse = new GreenHouseEnvironment();
		greenhouse.setTemperature(GreenhouseGUI.getTemperatureField());
		greenhouse.setHumidity(GreenhouseGUI.getHumidityField());
		greenhouse.setSoilMoisture(GreenhouseGUI.getSoilMoistureField());
		greenhouse.setTempFlux(GreenhouseGUI.getTemperatureFluxField());
		greenhouse.setHumidFlux(GreenhouseGUI.getHumidityFluxField());
		greenhouse.setMoistFlux(GreenhouseGUI.getSoilMoistureFluxField());
		greenhouse.setTempRate(GreenhouseGUI.getTemperatureRateField());
		greenhouse.setHumidRate(GreenhouseGUI.getHumidityRateField());
		greenhouse.setMoistRate(GreenhouseGUI.getSoilMoistureRateField());
		
		

		test1 = new Thread(new EnvironmentFluctuations(greenhouse, 10000));
		test2 = new Thread(new TemperatureFlux(greenhouse, -0.3, 1000));
			
		
		test3 = new Thread(new HumidityFlux(greenhouse, 0.07, 7500));
		test4 = new Thread(new MoistureFlux(greenhouse, 0.01, 5000));
		
		test5 = new Thread(new AirConditioner(greenhouse, 150, -10, 3000));
		test6 = new Thread(new Furnace(greenhouse, 0, 25, 3000));
		test7 = new Thread(new Humidifier(greenhouse, 10, 5, 0.5, 3000));
		test8 = new Thread(new Sprinkler(greenhouse, 5, 0, 0.4, 4000));
		
		
		test1.start();
		test2.start();
		test3.start();
		test4.start();
		test5.start();
		test6.start();
		test7.start();
		test8.start();

				
	}
	
	
	public static void main(String[] args){
		GreenhouseGUI GreenhouseGUI = new GreenhouseGUI();
		GreenHouseEnvironment GreenHouse = new GreenHouseEnvironment();
		AirConditioner AirConditioner = new AirConditioner();
		Furnace Furnace = new Furnace();
		Humidifier Humidifier = new Humidifier();
		Sprinkler Sprinkler = new Sprinkler();
		
		GreenhouseControl theControl = new GreenhouseControl(GreenhouseGUI, GreenHouse, AirConditioner, Furnace, Humidifier, Sprinkler);
		
		GreenhouseGUI.setVisible(true);
		
	}
	

}
 