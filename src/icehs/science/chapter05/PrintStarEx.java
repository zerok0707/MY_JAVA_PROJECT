package icehs.science.chapter05;

public class PrintStarEx {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
