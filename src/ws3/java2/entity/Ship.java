package ws3.java2.entity;

public class Ship extends Vehicle{
	
	private int replacement;
	
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		
		super(modelName, maxSpeed, numberLimit);
		this.replacement = replacement;
	}

	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" ¹è ¼ö ·® : " + this.replacement + "Åæ");
	}
}