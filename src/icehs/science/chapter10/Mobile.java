package icehs.science.chapter10;

public class Mobile {
	
	private String product;
	private int price;
	
	public Mobile(String product) {
		this.product = product;
	}

	public void call(int item)
	{
		System.out.println(this.product + " : " + item + "�� ��ȭ�߽��ϴ�.");
	}
	
	public void charge(int item)
	{
		System.out.println(this.product + " : " + item + "�� �����߽��ϴ�.");
	}
}