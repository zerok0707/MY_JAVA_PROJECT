package icehs.science.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DutchCalculator {
	public static void main(String[] args) {
		
		int numOfTimes = 0;
		int totalExpanse = 0;
		int numOfPeople = 0;
		int partMoney = 0;
		
		
		System.out.print("������ �������� ����Ǿ�����?");
		numOfTimes = getUserInput();
		System.out.println("====================");
		System.out.println("�� ������ �� ����� �Է��ϼ���.");
		for(int i = 1; i <= numOfTimes; i++)
		{
			System.out.print(i + "�� ��� : ");
			totalExpanse += getUserInput();
		}
		System.out.println("�� ����� " + totalExpanse + "�� �Դϴ�.");
		System.out.println("===============================");
		System.out.print("������ �ο��� �Է��ϼ���.");
		numOfPeople = getUserInput();
		partMoney = totalExpanse / numOfPeople;
		System.out.println("====================");
		for(int i = 1; i <= numOfPeople; i++)
		{
			if(i == numOfPeople)
			{
				System.out.println(i + ":" + totalExpanse + "��");
			}
			else 
			{
				System.out.println(i + " : " + partMoney + "��");
				totalExpanse -= partMoney;
			}
		}
	}public static int getUserInput() {
        
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

	

	
