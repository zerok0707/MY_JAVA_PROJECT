package ichs.science.chapter03;

public class StringVariableEx {
	public static void main(String[] args) {
		
		String name = "Ȧ�浿" ;
		String mathScore = "96" ;
		int englishScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println("�̸� :" +name);
		System.out.println("���� ���� : " +mathScore);
		System.out.println("���� ���� : " +englishScore );
		System.out.println("------------");
		System.out.println(mathScore + englishScore);
		System.out.println(parseMathScore + englishScore);
	}

}
