package icehs.science.chapter04;

public class SeperateNumberTest {
	public static void main(String[] args) {
		
		int number = 456;
		int num100 = number / 100;
		int num10 = (number % 100) / 10;
		int num1 = number % 10;
		
		System.out.println("���� : " + number);
		System.out.println("���� �ڸ� �� : " + num100);
		System.out.println("���� �ڸ� �� : " + num10);
		System.out.println("���� �ڸ� �� : " + num1);
		
		
	}

}
