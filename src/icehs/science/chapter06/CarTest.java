package icehs.science.chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car iceCar = new Car();
		
		iceCar.distance = 140;
		iceCar.oilAmount = 5;
		
		iceCar.printCarInfo();
		
		iceCar.addoil(10);
		iceCar.printCarInfo();
		
		iceCar.driveCar("IT����", "��õ����", 10.17);
		iceCar.printCarInfo();
		
		iceCar.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		iceCar.printCarInfo();
		
		iceCar.calcEnableDistance();
	}
}