package icehs.science.chapter06;

public class ChocolateTest {
	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "�Ƹ�����";
		choco.type = "��ũ";
		choco.price = 2200;
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		
		System.out.println(chocoName +" ���ݷ� 20�� : " + totalPrice);
		choco.changeChocolateInfo("ī�� Ű����", 2500);
		totalPrice = choco.calculateTotalPrice(15, 10);
		System.out.println(chocoName +" ���ݷ� 15�� (10%����) : " + totalPrice);
		choco.changeChocolateInfo("Ʈ���� ���", 2300, "ȭ��Ʈ");
	}
}