package jeonji.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//�Է� :  �μ��� �Է��� �ް� ���ϴ� �Լ�
		// 		
		
		/*
		 * ���� § �ڵ�
	    */
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int args1 = scan.nextInt();
		System.out.println("���ڸ� �Է��ϼ���.");
		int args2 = scan.nextInt();			
		
		int sum = args1+args2;
		System.out.println("����1  : "+ args1);
		System.out.println("����2  : "+ args2);
		System.out.println("��  : "+ sum);
		 */
		
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("�� ���� �Է��� �ּ���");
		s1 = scanner.next();
		s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.", a, b, a+b);
	}
}
