package icehs.science.chapter07;

public class PublicationTest {
	public static void main(String[] args) {
		System.out.println("===== ���ǹ� ������ ���� �մϴ�. =====");
		
		Publication publ = new Publication();
		publ.setPrice(-100);
		publ.setPage(-100);
		publ.setPrice(5000);
		publ.setPage(300);
		publ.setTitle("��ȭ �ﱹ��");
		
		System.out.println("���ǹ� ���� : " + publ.getTitle() + " ( " + publ.getPrice() + "��, " + publ.getPage() + "������ )");
	}
}