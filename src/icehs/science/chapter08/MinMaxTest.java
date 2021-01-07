package icehs.science.chapter08;

public class MinMaxTest {
	public static void main(String[] args) {
		int[] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
			if (min > arr[i])
			{
				min = arr[i];
			}
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		System.out.println("ÃÖ´ë°ª : " + max);
		System.out.println("ÃÖ¼Ò°ª : " + min);
	}
}