package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	public void moveElevator() {
		System.out.println("���������͸� �����մϴ�.");
	}
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}
}