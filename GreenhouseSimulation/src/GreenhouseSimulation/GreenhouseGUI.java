package GreenhouseSimulation;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GreenhouseGUI extends JFrame {

	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	private JPanel user_panel;
	private JPanel environment_panel;
	private JPanel automation_control_panel;

	private JLabel environment_label_big;
	private JLabel environment_label_small;
	private JLabel environment_fluctuation_label;
	private JLabel automation_label;
	
	private JLabel temperature_label;
	private JLabel humidity_label;
	private JLabel soil_moisture_label;
	
	private JLabel fluctuation_power_label;
	private JLabel fluctuation_rate_label;
	
	private JTextField temperature_fluctuation_field;
	private JTextField humidity_fluctuation_field;
	private JTextField moisture_fluctuation_field;
	
	private JTextField temperature_rate_field;
	private JTextField humidity_rate_field;
	private JTextField moisture_rate_field;
	
	private JTextField temperature_field;
	private JTextField humidity_field;
	private JTextField soil_moisture_field;
	
	private JLabel auto_rate_label;
	private JLabel auto_power_label;

	private JTextField power_AC_field;
	private JTextField power_furnace_field;
	private JTextField power_humidifier_field;
	private JTextField power_sprinkler_field;
	
	private JTextField rate_AC_field;
	private JTextField rate_furnace_field;
	private JTextField rate_humidifier_field;
	private JTextField rate_sprinkler_field;
	
	
	private JLabel AC_label;
	private JLabel furnace_label;
	private JLabel humidifier_label;
	private JLabel sprinkler_system;	
	private JLabel upper_label;
	private JLabel lower_label;
	
	private JTextField upper_AC_field;
	private JTextField upper_furnace_field;
	private JTextField upper_humidifier_field;
	private JTextField upper_sprinkler_system_field;
	
	private JTextField lower_AC_field;
	private JTextField lower_furnace_field;
	private JTextField lower_humidifier_field;
	private JTextField lower_sprinkler_system_field;
	
	private JButton startSimulation = new JButton("Start Simulation");
	
	private JComboBox AC_OnOff;
	private JComboBox furnace_OnOff;
	private JComboBox humidifier_OnOff;
	private JComboBox sprinkler_OnOff;
	
	private String[] on_off = {"OFF", "ON"};
	private Font titleFont = new Font("Malfun Gothic", Font.BOLD, 20);
	private Font textFont = new Font("Malfun Gothic", Font.PLAIN, 20);
	
	/**
	 * 
	 */
	public GreenhouseGUI(){
		
		super("User Environment Simulation Controls");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel user_panel = new JPanel();
		user_panel.setLayout(new GridLayout(2, 1, 5, 5));
		
		
		environment_panel = new JPanel();
		//colors and font
		environment_panel.setLayout(new GridBagLayout());
	//	addComponent(user_panel, environment_panel, 0, 0, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
		
		environment_panel.setBackground(Color.GREEN);
		
		
		environment_label_big = new JLabel("Initial Greenhouse Settings");
		environment_label_big.setFont(titleFont);
		addComponent(environment_panel, environment_label_big, 0, 0, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
		
		
		temperature_label = new JLabel("Initial Greenhouse Temperature: ");
		addComponent(environment_panel, temperature_label, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);		
	
		temperature_field = new JTextField(30);
		addComponent(environment_panel, temperature_field, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);	
	
		humidity_label = new JLabel("Initial Greenhouse Humidity: ");
		addComponent(environment_panel, humidity_label, 0, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);	
	
		humidity_field = new JTextField(5);
		addComponent(environment_panel, humidity_field, 1, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);	
	
		soil_moisture_label = new JLabel("Initial Greenhouse Soil mosture: ");
		addComponent(environment_panel, soil_moisture_label, 0, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);			
	
		soil_moisture_field = new JTextField(5);
		addComponent(environment_panel, soil_moisture_field, 1, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);		
	
		//--------------------------------------------------------------------------------------------------------------------		

		environment_fluctuation_label = new JLabel("Environment Fluctuations");
		environment_fluctuation_label.setFont(titleFont);
		addComponent(environment_panel, environment_fluctuation_label, 0, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		fluctuation_power_label = new JLabel("Power");
		addComponent(environment_panel, fluctuation_power_label, 1, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		fluctuation_rate_label = new JLabel("Rate");
		addComponent(environment_panel, fluctuation_rate_label, 2, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
	
		temperature_label = new JLabel("External environment temperature fluctuation per minute: ");
		addComponent(environment_panel, temperature_label, 0, 5, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		temperature_fluctuation_field = new JTextField(5);
		addComponent(environment_panel, temperature_fluctuation_field, 1, 5, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);	
	
		temperature_rate_field = new JTextField(5);
		addComponent(environment_panel, temperature_rate_field, 2, 5, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		
		
		humidity_label = new JLabel("External Humidity fluctuation per minute: ");
		addComponent(environment_panel, humidity_label, 0, 6, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		humidity_fluctuation_field = new JTextField(5);
		addComponent(environment_panel, humidity_fluctuation_field, 1, 6, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		humidity_rate_field = new JTextField(5);
		addComponent(environment_panel, humidity_rate_field, 2, 6, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		soil_moisture_label = new JLabel("External Soil fluctuation per minute: ");
		addComponent(environment_panel, soil_moisture_label, 0, 7, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);	
		
		moisture_fluctuation_field = new JTextField(5);
		addComponent(environment_panel, moisture_fluctuation_field, 1, 7, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		moisture_rate_field = new JTextField(5);
		addComponent(environment_panel, moisture_rate_field, 2, 7, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);		
		
		
		Color lightBlue = new Color(0, 155, 225, 251);
		
		JPanel automation_control_panel = new JPanel();
		
		automation_control_panel.setLayout(new GridBagLayout());
		
		automation_control_panel.setBackground(lightBlue);
		
		automation_label = new JLabel("Automation Controls");
		lower_label = new JLabel("LOWEST");
		upper_label = new JLabel("HIGHEST");
		auto_power_label = new JLabel("Power");
		auto_rate_label = new JLabel("Rate");
		
		
		automation_label.setFont(titleFont);
		addComponent(automation_control_panel, automation_label, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		addComponent(automation_control_panel, lower_label, 2, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		addComponent(automation_control_panel, upper_label, 3, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);		
		addComponent(automation_control_panel, auto_power_label, 4, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		addComponent(automation_control_panel, auto_rate_label, 5, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);	
		
		AC_label = new JLabel("Air Conditioner: ");
		addComponent(automation_control_panel, AC_label, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		AC_OnOff = new JComboBox(on_off);
		addComponent(automation_control_panel, AC_OnOff, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);		
		
		upper_AC_field = new JTextField(5);
		addComponent(automation_control_panel, upper_AC_field, 2, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

		lower_AC_field = new JTextField(5);
		addComponent(automation_control_panel, lower_AC_field, 3, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		power_AC_field = new JTextField(5);
		addComponent(automation_control_panel, power_AC_field, 4, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		rate_AC_field = new JTextField(5);
		addComponent(automation_control_panel, rate_AC_field, 5, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);	
		
		furnace_label = new JLabel("Furnace: ");
		addComponent(automation_control_panel, furnace_label, 0, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

		furnace_OnOff = new JComboBox(on_off);
		addComponent(automation_control_panel, furnace_OnOff, 1, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);	
		
		upper_furnace_field = new JTextField(5);
		addComponent(automation_control_panel, upper_furnace_field, 2, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

		lower_furnace_field = new JTextField(5);
		addComponent(automation_control_panel, lower_furnace_field, 3, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		power_furnace_field = new JTextField(5);
		addComponent(automation_control_panel, power_furnace_field, 4, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		rate_furnace_field = new JTextField(5);
		addComponent(automation_control_panel, rate_furnace_field, 5, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		humidifier_label = new JLabel("Humidifier: ");
		addComponent(automation_control_panel, humidifier_label, 0, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);		

		humidifier_OnOff = new JComboBox(on_off);
		addComponent(automation_control_panel, humidifier_OnOff, 1, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);			
		
		upper_humidifier_field = new JTextField(5);
		addComponent(automation_control_panel, upper_humidifier_field, 2, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

		lower_humidifier_field = new JTextField(5);
		addComponent(automation_control_panel, lower_humidifier_field, 3, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

		power_humidifier_field = new JTextField(5);
		addComponent(automation_control_panel, power_humidifier_field, 4, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);		

		rate_humidifier_field = new JTextField(5);
		addComponent(automation_control_panel, rate_humidifier_field, 5, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);
		
		
		sprinkler_system = new JLabel("Sprinklers: ");
		addComponent(automation_control_panel, sprinkler_system, 0, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		
		sprinkler_OnOff = new JComboBox(on_off);
		addComponent(automation_control_panel, sprinkler_OnOff, 1, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);	
			
		upper_sprinkler_system_field = new JTextField(5);
		addComponent(automation_control_panel, upper_sprinkler_system_field, 2, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

		lower_sprinkler_system_field = new JTextField(5);
		addComponent(automation_control_panel, lower_sprinkler_system_field, 3 , 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);		

		power_sprinkler_field = new JTextField(5);
		addComponent(automation_control_panel, power_sprinkler_field, 4, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);		

		rate_sprinkler_field = new JTextField(5);
		addComponent(automation_control_panel, rate_sprinkler_field, 5, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

		addComponent(automation_control_panel, startSimulation, 0, 5, 6, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);		
		
		user_panel.add(environment_panel);				
		user_panel.add(automation_control_panel);
		add(user_panel, BorderLayout.CENTER);

	}
	
	/**
	 * 
	 * @return temperature 
	 */
	public double getTemperatureField(){
		return Double.parseDouble(temperature_field.getText());
	}
	
	/**
	 * 
	 * @return humidity 
	 */
	public double getHumidityField(){
		return Double.parseDouble(humidity_field.getText());
	}
	
	/**
	 * 
	 * @return soil_moisture 
	 */
	public double getSoilMoistureField(){
		return Double.parseDouble(soil_moisture_field.getText());
	}
	
	/**
	 * 
	 * @return temperature_rate 
	 */
	public double getTemperatureRateField(){
		return Double.parseDouble(temperature_rate_field.getText());
	}
	
	/**
	 * 
	 * @return humidity_rate
	 */
	public double getHumidityRateField(){
		return Double.parseDouble(humidity_rate_field.getText());
	}
	
	/**
	 * 
	 * @return moisture_rate
	 */
	public double getSoilMoistureRateField(){
		return Double.parseDouble(moisture_rate_field.getText());
	}
	
	/**
	 * 
	 * @return temperature_flux
	 */
	public double getTemperatureFluxField(){
		return Double.parseDouble(temperature_fluctuation_field.getText());
	}
	
	/**
	 * 
	 * @return humidity_flux
	 */
	public double getHumidityFluxField(){
		return Double.parseDouble(humidity_fluctuation_field.getText());
	}
	
	/**
	 * 
	 * @return moisture_flux
	 */
	public double getSoilMoistureFluxField(){
		return Double.parseDouble(moisture_fluctuation_field.getText());
	}
	
	/**
	 * 
	 * @return upper_AC_field
	 */
	public double getUpperACField(){
		return Double.parseDouble(upper_AC_field.getText());
	}
	
	/**
	 * 
	 * @return upper_furnace_field
	 */
	public double getUpperFurnaceField(){
		return Double.parseDouble(upper_furnace_field.getText());
	}
	
	/**
	 * 
	 * @return upper_humidifier_field
	 */
	public double getUpperHumidifierField(){
		return Double.parseDouble(upper_humidifier_field.getText());
	}
	
	/**
	 * 
	 * @return upper_sprinkler_system_field
	 */
	public double getUpperSprinklerSystemField(){
		return Double.parseDouble(upper_sprinkler_system_field.getText());
	}
	
	/**
	 * 
	 * @return lower_AC_field
	 */
	public double getLowerACField(){
		return Double.parseDouble(lower_AC_field.getText());
	}
	
	/**
	 * 
	 * @return lower_furnace_field
	 */
	public double getLowerFurnaceField(){
		return Double.parseDouble(lower_furnace_field.getText());
	}
	
	/**
	 * 
	 * @return lower_humidifier_field
	 */
	public double getLowerHumidifierField(){
		return Double.parseDouble(lower_humidifier_field.getText());
	}
	
	/**
	 * 
	 * @return lower_sprinkler_system_field
	 */
	public double getLowerSprinklerSystemField(){
		return Double.parseDouble(lower_sprinkler_system_field.getText());
	
	}
	
	/**
	 * 
	 * @return power_AC_field
	 */
	public double getPowerACField(){
		return Double.parseDouble(power_AC_field.getText());
	}
	/**
	 * 
	 * @return power_furnace_field
	 */
	public double getPowerFurnaceField(){
		return Double.parseDouble(power_furnace_field.getText());
	}
	
	/**
	 * 
	 * @return power_humidifier_field
	 */
	public double getPowerHumidifierField(){
		return Double.parseDouble(power_humidifier_field.getText());
	}
	
	/**
	 * 
	 * @return power_sprinkler_field
	 */
	public double getPowerSprinklerSystemField(){
		return Double.parseDouble(power_sprinkler_field.getText());
	
	}
	
	/**
	 * 
	 * @return rate_AC_field
	 */
	public double getRateACField(){
		return Double.parseDouble(rate_AC_field.getText());
	}
	
	/**
	 * 
	 * @return rate_furnace_field
	 */
	public double getRateFurnaceField(){
		return Double.parseDouble(rate_furnace_field.getText());
	}
	
	/**
	 * 
	 * @return rate_humidifier_field
	 */
	public double getRateHumidifierField(){
		return Double.parseDouble(rate_humidifier_field.getText());
	}
	
	/**
	 * 
	 * @return rate_sprinkler_field
	 */
	public double getRateSprinklerSystemField(){
		return Double.parseDouble(rate_sprinkler_field.getText());
	
	}
	
	/**
	 * 
	 * @param listenForStartButton
	 */
	void addSimulationListener(ActionListener listenForStartButton){
		startSimulation.addActionListener(listenForStartButton);
	}
//	startSimulation.addActionListener((ActionListener)EventHandler.create(ActionListener.class, frame, "startSimulation")));
	
	
	/**
	 * 
	 * @param thePanel
	 * @param theComp
	 * @param x_coord
	 * @param y_coord
	 * @param width
	 * @param height
	 * @param place
	 * @param stretch
	 */
	void addComponent(JPanel thePanel, JComponent theComp, int x_coord, int y_coord, int width, int height, int place, int stretch){
		
		GridBagConstraints gridParameters = new GridBagConstraints();
		gridParameters.gridx = x_coord;
		gridParameters.gridy = y_coord;
		gridParameters.gridwidth = width;
		gridParameters.gridheight = height;
		gridParameters.weightx = 100;
		gridParameters.weighty = 100;
		gridParameters.insets = new Insets(5, 5, 5, 5);
		gridParameters.anchor = place;
		gridParameters.fill= stretch;
		
		thePanel.add(theComp, gridParameters);
	}
	
	
	
}
