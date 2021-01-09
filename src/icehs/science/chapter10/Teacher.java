package icehs.science.chapter10;

public class Teacher extends Person {
	private String Subject;
	
	
	@Override 
	public void eat() {
		super.eat();
		System.out.println("같이 식사를 합니다.");
	}
	public void teach () {
		System.out.println("가르칩니다.");
	}

}