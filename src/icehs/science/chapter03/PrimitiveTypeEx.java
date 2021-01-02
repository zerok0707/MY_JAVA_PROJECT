package icehs.science.chapter03;

public class PrimitiveTypeEx {
	public static void main(String[] args) {
		
		int myAge = 27;					//나이를 저장하는 int 형 변수
		long billWealth = 7000000000L;  //빌게이츠의 재산을 저장하는 long형 변수
		double pi = 3.1415926535;		//실수값인 원주율을 저장하는 double형 변수
		boolean isRight = true;			//true와 false를 저장하는 boolean형 변수
		
		System.out.println("내 나이 : " + myAge);
		System.out.println("빌게이츠 전재산 : " + billWealth);
		System.out.println("원주율 값 : " +pi);
		System.out.println("위의 값이 맞나요? : " + isRight);
	}

}
