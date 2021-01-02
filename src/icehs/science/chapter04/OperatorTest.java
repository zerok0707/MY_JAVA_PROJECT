package icehs.science.chapter04;

public class OperatorTest {
	public static void main(String[] args) {
		
		int num = 64;
		
		boolean result1 = (num % 2 == 0);
		boolean result2 = (num % 3 == 0);
		boolean result3 = (num % 2 == 0) && (num % 7 == 0);
		boolean result4 = (num % 2 == 0) || (num % 7 == 0);
		
		System.out.println("짝수입니까? : " + result1);
		System.out.println("3의 배수입니까? : " + result2);
		System.out.println("2의 배수이면서 7의 배수입니까? : " + result3);
		System.out.println("2의 배수이거나 7의 배수입니까? : " + result4);
	}

}
