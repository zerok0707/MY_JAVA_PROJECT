package icehs.science.chapter09;

public class Teacher extends Person{

	String subject;
	

	@Override
	void eat() {
		super.eat();
		System.out.println("���� �Ļ縦 �մϴ�.");
	}
	
	void teach() {
		System.out.println("����Ĩ�ϴ�.");
	}
}