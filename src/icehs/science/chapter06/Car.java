package icehs.science.chapter06;

public class Car {
	String name = "[ICE ī~]";
	int oilAmount;		//���� �⸧�� ��
	double distance;	//������Ÿ�
	
	void addoil(int oil) 
	{
		oilAmount += oil;
		System.out.println("�ֹ��� " + oil + "L �����մϴ�");
	}
	
	void printCarInfo()
	{
		System.out.println(name + " ���� �⸧�� : " + oilAmount + ", �� ����Ÿ� : " + distance + "km");
	}
	
	void driveCar(String start, String end, Double driveDistance)
	{
		System.out.println(start + "���� " + end + " ����"  + driveDistance + "km �����Ͽ����ϴ�.");
		distance += driveDistance;
		int driveOil = (int)(driveDistance / 20);
		oilAmount -= driveOil;
	}
	
	void calcEnableDistance()
	{
		double enableDistance = oilAmount * 20;
		System.out.println("���� ������ �Ÿ��� �� " + enableDistance + "km �Դϴ�.");
	}
}