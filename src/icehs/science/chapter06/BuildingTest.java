package icehs.science.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		
		Building building = new Building();//��ü �����ϱ�
		
		//��ü�� ��� ������ �� �ο�
		building.name = "������Ÿ��";
		building.address = "������";
		building.totalFloor = 5;

		//��ü�� ��� �޼��带 ȣ��
		System.out.println("�ǹ��� : " + building.name);
		System.out.println("�ּ� : " + building.address);
		System.out.println("��ü �� �� : " + building.totalFloor);
		
		building.moveElevator();
		building.changeAddress("�����");
		
		System.out.println("�� �ּ� : " + building.address);
		

		
	}

}