package icehs.science.chapter05;

public class GradeIfElseTest {
	public static void main(String[] args) {
		
		int grade = 77;
		
		if (grade >= 90 && grade <= 100)
		{
			System.out.println("A���� �Դϴ�.");
		}
		else if (grade >= 80 && grade <= 90)
		{
			System.out.println("B�����Դϴ�.");
		}
		else if (grade >= 70 && grade <= 80)
		{
			System.out.println("C�����Դϴ�.");
		}
		else if (grade >= 60 && grade <= 70)
		{
			System.out.println("D�����Դϴ�.");
		}
		else if (grade >= 0 && grade <= 60)
		{
			System.out.println("F�����Դϴ�.");
		}
		else
		{
			System.out.println("������ �߸��Ǿ����ϴ�...");
		}
	}

}
