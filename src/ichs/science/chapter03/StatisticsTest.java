package ichs.science.chapter03;

public class StatisticsTest {

	public static void main(String[] args) {
		int distance = 150000000;
		double lotto = 0.0000001235;
		long population = 6973738433L;
		boolean isRight = true;
		
		System.out.println("태양에서 지구까지의 거리 : " + distance);
		System.out.println("로또에 당첨될 확률 : " + lotto);
		System.out.println("전 세계의 인구 수 : " + population);
		System.out.println("위 값들이 정확한가요? : " + isRight);
	}
}
