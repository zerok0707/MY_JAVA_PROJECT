package icehs.science.chapter07;

public class ProductTest {
	public static void main(String[] args) {
		Product mix = new Product("ÄżÇÇšÍ˝ş", 12000, 20);
		mix.printProductInfo();
		
		Product cup = new Product("ÁžŔĚÄĹ", 3000);
		cup.printProductInfo();
	}
}