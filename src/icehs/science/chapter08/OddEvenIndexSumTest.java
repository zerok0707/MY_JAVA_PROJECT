package icehs.science.chapter08;

public class OddEvenIndexSumTest {
	public static void main(String[] args) {
		
		int oddSum = 0; //Ȧ��Index ���� ��
		int evenSum = 0; //¦��Index ���� ��
		
		int [] numbers = {12, 53, 24, 10, 22, 38, 64, 39};
		
		for (int i = 0; i < numbers.length ; i ++) {
			if (i % 2 == 0 ) {
				evenSum += numbers[i];
				
			}else {
				oddSum += numbers[i];
			}
		}
		System.out.println("Ȧ�� Index ������ �� : " + oddSum);
		System.out.println("¦�� Index ������ �� : " + evenSum);
	}

}