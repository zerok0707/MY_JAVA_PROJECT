package icehs.science.chapter09;

public class FoundAccount extends Account {
	private double earningRate;
	
	public FoundAccount(String number, String name, 
			int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	public void earnMoney() {
		System.out.println("���ͷ� : " + this.earningRate + "%");
		System.out.println("������ �߻��߽��ϴ�.");
	}
	
	@Override
	public void openAccount() {
		System.out.println("���¸� �����մϴ�.");
		System.out.print("�ݵ� ");
		super.openAccount();
		this.earnMoney();
	}
}