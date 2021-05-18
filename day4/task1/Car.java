package day4.task1;

public class Car {
	private int cost;
	private String carName;
	private boolean isPlaying;
	private MusicSystem ms;
	private Engine engine;
	private int carPower;
	
	public Car() {
		super();
		
	}

	public Car(Engine engine) {
		this.engine = engine;
		
	}
	public Engine getEngine() {
		return engine;
	}

 


	public void setEngine(Engine engine) {
		this.engine = engine;
	}




	public int getCarPower() {
		return carPower;
	}




	public void setCarPower(int carPower) {
		this.carPower = carPower;
	}



	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public MusicSystem getMs() {
		return ms;
	}

	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}

	public Car(MusicSystem ms) {
		this.ms = ms;

	}

	
	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}




	public String getCarName() {
		return carName;
	}




	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void doStartCar()
	{
		 // ------
		carPower = engine.doStartEngine("petrol") + 100;
		
	}
	
	
	
	public void moveCarForward()
	{
		doStartCar();
		if(carPower>1000) System.out.println(" Car speed is High ");
		if(carPower<1000) System.out.println(" Car speed is low ");
		if(carPower<5000) System.out.println(" This must be a truck ");
		
		
	}

	
	
	public void playMusic()
	{
		isPlaying  = ms.startPlaying("xyz");
		if(isPlaying)
			System.out.println("Music is playing");
		else
			System.out.println("Cannot find the song");
		
	}
}
