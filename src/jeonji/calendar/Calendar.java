package jeonji.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = scan.nextInt();
		
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		System.out.printf("%d월은 %d월까지 있습니다.",  month, maxDays[month-1]);
		scan.close();
		
		
		
	}
}

