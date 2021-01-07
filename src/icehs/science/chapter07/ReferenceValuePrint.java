package icehs.science.chapter07;

public class ReferenceValuePrint {
	public static void main(String[] args) {
	
		Publication publ = new Publication(5000, 300, "만화 삼국지");
		Publication publ2 = new Publication();
		int intValue = 10;
		System.out.println(publ.numberOfObjects);
		System.out.println(publ2.numberOfObjects);
		System.out.println(Publication.numberOfObjects);
		
		System.out.println("Publ 객체 참조 주소값");
		System.out.println(publ);
		
		System.out.println("Publ2 객체 참조 주소값");
		System.out.println(publ2);
		
		System.out.println("int 변수 저장값 : " + intValue);
}
}