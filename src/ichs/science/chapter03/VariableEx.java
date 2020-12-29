package ichs.science.chapter03;

// 어머니의 생신인 1960년 6월 20일을 저장하는 변수를 만들어 값을 저장하고, 저장된 값을 확인한다.
public class VariableEx {
	public static void main( String[] arg) {
		
		int bornYear;		// 태어난 년도를 저장할 변수 선언
		bornYear = 1960;	// 태어난 년도 1960 값 저장
		int bornMonth;		// 태어난 달을 저장할 변수 선언
		bornMonth = 6;		// 태어난 달 6 값 저장
		int bornDay = 20;	// 태어난 날짜를 저장할 변수를 선언하고 값 20 저장
		
		System.out.println( bornYear );
		System.out.println( bornMonth );
		System.out.println( bornDay );
	}

}
