package 반복문;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		//두개의 입력값을 받아서, 첫번째값부터 두번째값까지 더함

		Scanner sc = new Scanner(System.in);
		System.out.print("시작값은 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값은 : ");
		int num2 = sc.nextInt();
		
		int mul = 1;
		
		System.out.print(num1+"부터 "+num2+"까지의 곱은 :");
		
		while(num1<=num2) {
			
			mul = mul * num1;
			num1++;
			
		}
		System.out.print(mul);
	}

}
