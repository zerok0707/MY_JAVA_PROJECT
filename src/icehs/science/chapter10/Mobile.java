package icehs.science.chapter10;

public class Mobile {
	private String product;
	private int price;
	
	public Mobile(String product) {
		this.product = product;
	}

	public void call(int time) {
		System.out.println(this.product +" : " + time +"�� ��ȭ�߽��ϴ�.");
	}
	
	public void charge(int time) {
		System.out.println(this.product +" : " + time +"�� �����߽��ϴ�.");
		
	}
}