package icehs.science.chapter06;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.name ="ȫ�浿";
		acc.accNo = "123-456789";
		acc.balance = 10000;
		
		acc.printAccountInfo();
		acc.deposit(20000);
		System.out.println("�ܾ� : " + acc.balance +"��");
		acc.deposit(-20000);
		acc.withdraw(-20000);
		acc.withdraw(45000);
		System.out.println("�ܾ� : " + acc.balance +"��");		
	}
}