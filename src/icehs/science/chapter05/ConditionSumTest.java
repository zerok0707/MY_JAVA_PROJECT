package icehs.science.chapter05;

public class ConditionSumTest {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 30; i++)
		{
			if(i % 2 != 0 && i % 3 != 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
