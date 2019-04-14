package jeonji.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력 :  두수의 입력을 받고 더하는 함수
		// 		
		
		/*
		 * 내가 짠 코드
	    */
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int args1 = scan.nextInt();
		System.out.println("숫자를 입력하세요.");
		int args2 = scan.nextInt();			
		
		int sum = args1+args2;
		System.out.println("숫자1  : "+ args1);
		System.out.println("숫자2  : "+ args2);
		System.out.println("합  : "+ sum);
		 */
		
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요");
		s1 = scanner.next();
		s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
	}
}
