package icehs.science.chapter07;

public class Product {
	String name;
	int price;
	int discount;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Product(String name, int price, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	void printProductInfo()
	{
		System.out.println("=====" + this.name + " =====");
		System.out.println("���� : " + this.price + " ��");
		if(this.discount == 0)
		{
			System.out.println("������ : �������� ����");
		}
		else
		{
			System.out.println("������ : " + this.discount + "%");
		}
	}
}