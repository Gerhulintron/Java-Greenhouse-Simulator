package GreenhouseSimulation;

public class EnvironmentFluctuations implements Runnable{
	

	
	GreenHouseEnvironment greenhouse;
	private long delayTime;

	
/**
 * 
 * @param greenhouse
 * @param delayTime
 */
	public EnvironmentFluctuations(GreenHouseEnvironment greenhouse, long delayTime){
		super();
		this.greenhouse = greenhouse;
		this.setDelayTime(delayTime);
	}
	
	public EnvironmentFluctuations(){
		super();
		GreenHouseEnvironment greenhouse;
		this.setDelayTime(1000);
				
				
				

	}
	
	
	/**
	 * 
	 * @param delayTime
	 */
	private void setDelayTime(long delayTime) {
		this.delayTime = delayTime;
		
	}

	/**
	 * 
	 * @return delayTime
	 */
	protected long getDelayTime() {
		// TODO Auto-generated method stub
		return this.delayTime;
	}
	

	/**
	 * 
	 * @param delayTime
	 */
	public void doNothing(long delayTime){
		try{
			Thread.sleep(delayTime);
		}
		catch(InterruptedException e){
			System.out.println("Unexpected interrupt");
			System.exit(0);
		}
	}
	
	
	public void run(){

	for(;;){
		System.out.println("--------------------------------------------------------------------");
		System.out.println(greenhouse);
		System.out.println("--------------------------------------------------------------------");
		doNothing(this.getDelayTime());
	
}
	
	}
}

	

	
