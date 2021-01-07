package icehs.science.workshop1;

//문제 3.
//두 개의 주사위를 던졌을 때,
//눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
public class Workshop03 {

	public static void main( String[] args ) {
		int i;
		int j;
		for (i =1; i <=6; i++ ) {
			for (j = 1; j <=6; j ++) {
				if ( i + j == 6) {
					int num1 = i;
					int num2 = j;
					
					System.out.println( num1 + "+" + num2 + "=" + "6");
				}
				
			}
		}
 	}
}