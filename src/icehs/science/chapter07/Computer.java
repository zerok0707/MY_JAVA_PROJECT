package icehs.science.chapter07;

public class Computer {
	String model;
	String osVer;
	int production;
	int sales;
	
	public Computer(String model, String osVer, int production) {
		super();
		this.model = model;
		this.osVer = osVer;
		this.production = production;
	}
	public Computer(String model, String osVer, int production, int sales) {
		super();
		this.model = model;
		this.osVer = osVer;
		this.production = production;
		this.sales = sales;
	}
	
	void printComputerInfo() {
		System.out.println("=== " + this.model +" (" + this.osVer +") ===");
		System.out.println("�� : " + this.production + " / ���� : " + this.sales);
	}
	
}