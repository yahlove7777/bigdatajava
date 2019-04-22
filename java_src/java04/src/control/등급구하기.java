package control;

import java.util.Date;
import java.util.Scanner;


public class 등급구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요 : ");
		String x = sc.next();
		
		char y = x.charAt(0);
		
		String result = null;
		
		switch (y) {
		case 'a':
		case 'A':
			result = "최우수입니다.";
			break;
		case 'b':
		case 'B':
			result = "우수입니다.";
			break;
		case 'c':
		case 'C':
			result = "보통입니다.";
			break;
		default:
			result = "통과하지 못했습니다.";
			break;
		}
		System.out.println(result);



	}

}
