package icehs.science.chapter03;

public class Stringtest {

	public static void main(String[] args) {

		String sejong = "�������";
		String money = "10000";
		String year = "2017";
		int intYear = Integer.parseInt(year);
		
		System.out.println(sejong + ":" + money);
		System.out.println(year + "��");
		System.out.println(money + year);
		System.out.println(intYear + Integer.parseInt(money));
	}

}
