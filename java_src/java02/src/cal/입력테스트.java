package cal;

import java.util.Scanner;

public class 입력테스트 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 만듬
		
		System.out.print("당신의 이름은? : ");
		String name = sc.next();
		System.out.print("당신의 태어난 연도는? : ");
		int year = sc.nextInt();
		System.out.print("당신의 관심과목은? : ");
		String hobby = sc.next();
		
		int age = 2019 - year + 1;
		
		System.out.println("-------------------------");
		System.out.println(name+" 님은 "+age+"살이고, "+hobby+"에 관심이 있습니다.");
		
	}

}

