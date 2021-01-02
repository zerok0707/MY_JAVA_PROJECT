package icehs.science.chapter05;

public class GradeIfElseTest {
	public static void main(String[] args) {
		
		int grade = 77;
		
		if (grade >= 90 && grade <= 100)
		{
			System.out.println("A학점 입니다.");
		}
		else if (grade >= 80 && grade <= 90)
		{
			System.out.println("B학점입니다.");
		}
		else if (grade >= 70 && grade <= 80)
		{
			System.out.println("C학점입니다.");
		}
		else if (grade >= 60 && grade <= 70)
		{
			System.out.println("D학점입니다.");
		}
		else if (grade >= 0 && grade <= 60)
		{
			System.out.println("F학점입니다.");
		}
		else
		{
			System.out.println("점수가 잘못되었습니다...");
		}
	}

}
