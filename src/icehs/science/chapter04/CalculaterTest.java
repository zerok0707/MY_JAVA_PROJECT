package icehs.science.chapter04;

public class CalculaterTest {
	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 7;
		
		int plusResult = number1 + number2;
		int minusResult = number1 - number2;
		int multiResult = number1 * number2;
		int divisionResult = number1 / number2;
		int remainderResult = number1 % number2;
		
		System.out.println("µ¡¼À °á°ú : " + plusResult);
		System.out.println("»¬¼À °á°ú : " + minusResult);
		System.out.println("°ö¼À °á°ú : " + multiResult);
		System.out.println("³ª´°¼À °á°ú : " + divisionResult);
		System.out.println("³ª¸ÓÁö °á°ú : " + remainderResult);
	}

}
