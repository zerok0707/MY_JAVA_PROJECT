package icehs.science.chapter10;

public class Student extends Person {
	
	private String department;
	
	
		@Override
		public void eat () {
			super.eat();
			System.out.println("������ �Ծ��.");
		}
	public void study () {
		System.out.println("���θ� �մϴ�.");
	}
	
	

}