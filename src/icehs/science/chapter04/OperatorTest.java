package icehs.science.chapter04;

public class OperatorTest {
	public static void main(String[] args) {
		
		int num = 64;
		
		boolean result1 = (num % 2 == 0);
		boolean result2 = (num % 3 == 0);
		boolean result3 = (num % 2 == 0) && (num % 7 == 0);
		boolean result4 = (num % 2 == 0) || (num % 7 == 0);
		
		System.out.println("¦���Դϱ�? : " + result1);
		System.out.println("3�� ����Դϱ�? : " + result2);
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : " + result3);
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : " + result4);
	}

}
