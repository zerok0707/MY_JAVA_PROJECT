package icehs.science.chapter07;

public class PublicationTest {
	public static void main(String[] args) {
		System.out.println("===== 출판물 정보를 세팅 합니다. =====");
		
		Publication publ = new Publication();
		publ.setPrice(-100);
		publ.setPage(-100);
		publ.setPrice(5000);
		publ.setPage(300);
		publ.setTitle("만화 삼국지");
		
		System.out.println("출판물 정보 : " + publ.getTitle() + " ( " + publ.getPrice() + "원, " + publ.getPage() + "페이지 )");
	}
}