package ws1.java2.entity;

public class Car {
	public String modelName;
	public int maxSpeed;
	public int numberLimit;
	public int mileage;
	public boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
		System.out.println(" ��տ��� : " + mileage + "km/l");
	}
}
