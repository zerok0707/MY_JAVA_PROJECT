package icehs.science.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee maki = new Coffee();
		ame.name ="�Ƹ޸�ī��";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		latte.name = "ī���";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		maki.name = "ī��� ��Ű�ƶ�";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		int priceSum = ame.getPrice() + latte.getPrice() + maki.getPrice();
		System.out.println("�հ� : " + priceSum +"��");
	}
}