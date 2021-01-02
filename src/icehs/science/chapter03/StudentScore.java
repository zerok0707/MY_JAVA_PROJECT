package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		
		double math = 94.7;
		double eng = 83.2;
		double Korean = 87.1;
		double science = 98.0;
		
		int intScience = (int)science;
		
		System.out.println("수학 : " + (int)math);
		System.out.println("영어 : " + (int)eng);
		System.out.println("국어 : " + (int)Korean);
		System.out.println("과학 : " + intScience);

	}

}
