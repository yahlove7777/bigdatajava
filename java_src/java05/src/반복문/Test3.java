package 반복문;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//두개의 입력값을 받아서, 첫번째값부터 두번째값까지 더함

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값은 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값은 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 값은 : ");
		int num3 = sc.nextInt();
		
		int sum = 0;
		sum = num1 + num2 + num3;
		
		System.out.print("세 수의 합은 : "+sum);

	}

}
