package ws3.java2.entity;

public class Airplane {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int numOfEngine;
	private boolean available;
	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.numOfEngine = numOfEngine;
	}

	
	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public int getNumberLimit() {
		return numberLimit;
	}


	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}


	public int getNumOfEngine() {
		return numOfEngine;
	}


	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + this.modelName);
		System.out.println(" �ְ�ӵ� : " + this.maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + this.numberLimit + "��");
		System.out.println(" �������� : " + this.numOfEngine + "��");
	}
}
