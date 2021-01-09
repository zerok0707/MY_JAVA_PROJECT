package ws3.java2.entity;

public class Airplane extends Vehicle{
	
	private int numOfEngine;
	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super(modelName, maxSpeed, numberLimit);
		this.numOfEngine = numOfEngine;
	}

	public int getNumOfEngine() {
		return numOfEngine;
	}


	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}


	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" ¿£Áø°³¼ö : " + this.numOfEngine + "°³");
	}
}
