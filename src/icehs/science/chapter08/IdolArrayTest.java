package icehs.science.chapter08;

public class IdolArrayTest {
	public static void main(String[] args) {
		
		Idol idols[] = new Idol[4];
		idols[0] = new Idol("�ҳ�ô�", "�¿�");
		idols[1] = new Idol("����Ÿ", "����");
		idols[2] = new Idol("���", "���巡��");
		idols[3] = new Idol("��Ʈ", "��伷");
		
		System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
		System.out.println(idols[1].getGroup() + " : " + idols[1].getName());
		System.out.println(idols[2].getGroup() + " : " + idols[2].getName());
		System.out.println(idols[3].getGroup() + " : " + idols[3].getName());
	}
}