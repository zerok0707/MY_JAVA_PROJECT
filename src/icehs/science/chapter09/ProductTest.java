package icehs.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product tong = new Product("�뵹��", 450000, 8);
		tong.printProductInfo();
		System.out.println("------------------------------------");
		
		Television tv = new Television("�ó׸�TV", 3500000, 10, "ȭ��ũ�� 151cm");
		tv.printProductInfo();
		System.out.println("��� : " + tv.getDescription());
		
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		tong.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println("�뵹�� �ǸŰ� : "  + tong.calculateDiscountPrice());
		System.out.println("�ó׸� TV �ǸŰ� : " + tv.calculateDiscountPrice());
	}
}