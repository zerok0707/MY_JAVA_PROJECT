package icehs.science.chapter05;

public class PrimeNumberTest {
	public static void main(String[] args) {
		
		int firstNum = 23;
		int secondNum = 26;
		
		for(int i = 2; i <= firstNum; i++)
		{
			if(i != firstNum && firstNum % i == 0)
			{
				System.out.println(firstNum + " �Ҽ��� �ƴմϴ�. ");
				break;
			}else if(i == firstNum)
			{
				System.out.println(firstNum + " �� �Ҽ��Դϴ�. ");
			}
		}
		
		for(int i = 2; i <= secondNum; i++)
		{
			if(i != secondNum && secondNum % i == 0)
			{
				System.out.println(secondNum + " �� �Ҽ��� �ƴմϴ�. ");
				break;
			}
			else if(i == secondNum)
			{
				System.out.println(secondNum + "�� �Ҽ��Դϴ�.");
			}
		}
	}

}
