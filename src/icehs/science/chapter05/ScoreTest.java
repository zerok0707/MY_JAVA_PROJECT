package icehs.science.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreTest {
		public static void main(String[] args) {
			int numOfSubjects = 0;
			int sumOfSubjects = 0;
			double gpa = 0;
			
			System.out.print("���� �л� ����?:");
			numOfSubjects = getUserInput();
			for(int i = 1; i <= numOfSubjects; i++)
			{
				System.out.print(i + "���� ���� : ");
				sumOfSubjects += getUserInput();
			}
			gpa = (double)sumOfSubjects / numOfSubjects;
			System.out.println("=====================");
			System.out.println(numOfSubjects + "���� ���� : " + sumOfSubjects + "��");
			System.out.println(numOfSubjects + "���� ��� : " + gpa + "��");
		}
	    public static int getUserInput() {
	        
	        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	        String inputString = null;
	        
	        try {
	            inputString = br.readLine();
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        }
	        
	        return Integer.parseInt( inputString );
	    }	
		
}
