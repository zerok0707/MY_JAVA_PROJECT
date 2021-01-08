package ws1.java2.entity;

public class Ship {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int replacement;
	
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		super();
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.replacement = replacement;
	}
	
	
	private boolean available;
	
	
	
	
	



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




	public int getReplacement() {
		return replacement;
	}




	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}




	public boolean isAvailable() {
		return available;
	}




	public void setAvailable(boolean available) {
		this.available = available;
	}




	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
		System.out.println(" �� �� �� : " + replacement + "��");
	}
}