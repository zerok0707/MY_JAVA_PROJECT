package icehs.science.chapter07;

import icehs.science.chapter06.Account;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("����ī���� �˼�");//book1.title = "����ī���� �˼�";
		book1.setPrice(15000);//book1.price = 15000;
		book1.printBookInfo();
		
		Book book2 = new Book("�ظ�����", 20000);
		book2.printBookInfo();
		
		Book book3 = new Book("Office 365 in School", "������", 26000);
		book3.printBookInfo();
		Account acc = new Account();
		acc.withdraw(1000);
	}
}