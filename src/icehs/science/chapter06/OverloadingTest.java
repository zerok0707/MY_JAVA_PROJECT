package icehs.science.chapter06;

public class OverloadingTest {
	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.addition(1000, 365);
		over.addition(4.3, 1.8);
		over.addition("ANT", "AND");
		
	}
}