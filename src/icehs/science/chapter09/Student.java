package icehs.science.chapter09;

public class Student extends Person {
	
	String department;
	
	@Override
	void eat() {
		super.eat();
		System.out.println("������ �Ծ��.");
	}
	
	void study() {
		System.out.println("���θ� �մϴ�.");
	}
}