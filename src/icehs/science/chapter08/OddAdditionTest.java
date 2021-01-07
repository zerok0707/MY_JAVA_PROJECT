package icehs.science.chapter08;

public class OddAdditionTest {
	public static void main(String[] args) {
		int[] numbers = {10, 21, 33, 42, 51, 79, 80};
		int sum = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] % 2 == 1)
			{
				sum += numbers[i];
				System.out.println(numbers[i] + " ");
			}
		}
		System.out.println("È¦¼öµéÀÇ ÇÕ°è´Â " + sum + "ÀÔ´Ï´Ù.");
	}
}