package icehs.science.chapter07;

public class ReferenceValuePrint {
	public static void main(String[] args) {
	
		Publication publ = new Publication(5000, 300, "��ȭ �ﱹ��");
		Publication publ2 = new Publication();
		int intValue = 10;
		System.out.println(publ.numberOfObjects);
		System.out.println(publ2.numberOfObjects);
		System.out.println(Publication.numberOfObjects);
		
		System.out.println("Publ ��ü ���� �ּҰ�");
		System.out.println(publ);
		
		System.out.println("Publ2 ��ü ���� �ּҰ�");
		System.out.println(publ2);
		
		System.out.println("int ���� ���尪 : " + intValue);
}
}