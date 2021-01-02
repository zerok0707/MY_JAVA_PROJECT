package icehs.science.chapter05;

public class VariousSumTest {
	public static void main(String[] args) {
	
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 1; i <= 1000; i++)
		{
			sum += i; 
			if(i % 2 == 0)
			{
				evenSum += i;
			}
			else
			{
				oddSum += i;
			}
		}
		System.out.println(sum);
		System.out.println(evenSum);
		System.out.println(oddSum);
	}

}
