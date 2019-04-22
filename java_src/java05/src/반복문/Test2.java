package 반복문;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("입력값 : ");
		int x = sc.nextInt();
		int start;
		
		
		for(start = 1 ;start <= x; start++) {
			System.out.print("★");
		}
	}

}
