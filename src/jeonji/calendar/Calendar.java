package jeonji.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		// ���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = scan.nextInt();
		
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		System.out.printf("%d���� %d������ �ֽ��ϴ�.",  month, maxDays[month-1]);
		scan.close();
		
		
		
	}
}

