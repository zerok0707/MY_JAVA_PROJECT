package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student gildong = new Student();
		
		gildong.name = "ȫ�浿";
		gildong.id = "S001";
		gildong.korean = 94;
		gildong.english = 80;
		gildong.math = 89;
		
		gildong.printStudentInfo();
		System.out.println("��� : "  + gildong.calcAverage());
		
		System.out.println("* �й��� �����մϴ�!!!");
		
		gildong.changeStudentID("STU0001");
		
		gildong.printStudentInfo();
		
	}
}