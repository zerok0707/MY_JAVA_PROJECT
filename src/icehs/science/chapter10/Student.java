package icehs.science.chapter10;

public class Student extends Person {
	
	private String department;
	
	
		@Override
		public void eat () {
			super.eat();
			System.out.println("조별로 먹어요.");
		}
	public void study () {
		System.out.println("공부를 합니다.");
	}
	
	

}