package cal;

import java.util.Scanner;

public class Me2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.print("당신의 취미는? : ");
		String hooby = sc.next();
		System.out.print("평소 TV시청 시간은 얼마인가요? : ");
		String tv = sc.next();
		System.out.print("봄여행을 다녀왔나요?[y/n] : ");
		String trevel = sc.next();
		System.out.println("-------------------------------");
		
		System.out.println("내 취미는 "+hooby+"이고, 평소에 TV를 "+tv+"시간 봅니다.");
		if(trevel.equals("y")) {
			System.out.println("봄 여행을 다녀 왔습니다.");
		}
		else {
			System.out.println("봄 여행을 다녀오지 않았습니다.");
		}


	}

}
