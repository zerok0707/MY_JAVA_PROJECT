package icehs.science.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String name = "서현석";
		String school = "동인천고등학교";
		String fullName = name + school;
		String strYear = "2020";
		int nextYear = Integer.parseInt(strYear) + 1;
		String ndYear = 1 + strYear;
		
		
		System.out.println("성명 : " + name);
		System.out.println("소속학교명 : " + school);
		System.out.println("전체이름 : " + fullName);
		System.out.println("올해 : " + strYear + "년");
		System.out.println("내년 : " + nextYear + "년");
		System.out.println("실버 갈 연도 : " + ndYear + "년");
	}

}
