package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		
		int monthlySal = 1000000;
		int yearlySal = monthlySal * 12;
		int bonus = monthlySal * 2 / 10;
		int yearBonus = bonus * 4;
		int yearSalAfterTax = yearlySal - yearlySal / 10;
		int yearBonusAfterTax = yearBonus - yearBonus * 55 / 1000;
		int yearIncome = yearSalAfterTax + yearBonusAfterTax;
		
		System.out.println("���� : " + yearlySal + " , ���� ���� : " + yearSalAfterTax);
		System.out.println("���ʽ� : " + yearBonus + " , ���� ���ʽ� : " + yearBonusAfterTax);
		System.out.println("���޾� : " + yearIncome);
		
	}

}
