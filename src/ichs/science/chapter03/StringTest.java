package ichs.science.chapter03;

public class StringTest {
	public static void main(String[] args) {
		
		String king = "�������" ;
		String money = "10000" ;
		String year  = "2017";
		int intYear = Integer.parseInt(year);
		
		System.out.println(king +":" +money);
		System.out.println(year + "��");
		System.out.println(money + year);
		System.out.println(intYear + Integer.parseInt(money));
	}

}
