package icehs.science.chapter08;

public class Chocolate {
	String name;
	String type;
	int price;
	
	public Chocolate(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	String getName() 
	{
		return name;
	}
	
	int calculateTotalPrice(int count) 
	{
		return count * price;
	}
	
	int calculateTotalPrice(int count, int discount)
	{
		return count * price * (100-discount) / 100;
	}
	
	void changeChocolateInfo(String newName, int newPrice)
	{
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	
	void changeChocolateInfo(String newName, int newPrice, String newType)
	{
		name = newName;
		price = newPrice;
		type = newType;
		printChocolateInfo();
	}
	
	void printChocolateInfo()
	{
		System.out.println("ÀÌ¸§ : " + name + ", Á¾·ù : " + type + ", °¡°Ý : " + price) ;
	}
}