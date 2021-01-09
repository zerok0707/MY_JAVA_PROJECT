package icehs.science.chapter10;

public class Mobile {
	
	private String product;
	private int price;
	
	public Mobile(String product) {
		this.product = product;
	}

	public void call(int item)
	{
		System.out.println(this.product + " : " + item + "분 통화했습니다.");
	}
	
	public void charge(int item)
	{
		System.out.println(this.product + " : " + item + "분 충전했습니다.");
	}
}