package icehs.science.chapter06;

public class Student {
	String name;
	String id;
	int korean;
	int english;
	int math;
	
	int calcAverage() {
		int result = (korean + english + math) / 3;
		return result;
	}
	
	void printStudentInfo() {
		System.out.println("�л����� : " + name);
		System.out.println("�й� : " + id);
		System.out.println("����� : " + korean);
		System.out.println("����� : " + english);
		System.out.println("���м��� : " + math);
	}
	
	void changeStudentID(String newID) {
		id = newID;
	}
}