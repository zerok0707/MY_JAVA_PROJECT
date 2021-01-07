package icehs.science.chapter08;

public class StudentArrayTest {
	public static void main(String[] args) {
		
		Student [] st = new Student[3];
		
		st[0] = new Student ("°­°¨Âù", "STU001", "010-1234-5678");
		st[1] = new Student ("ÀÌ¼ø½Å", "STU002", "010-2345-6789");
		st[2] = new Student ("±èÀ¯½Å", "STU003", "010-9876-5432");
		
		for (int i = 0 ; i < st.length; i++) {
			st[i].printStudentInfo();
		}
	}

}