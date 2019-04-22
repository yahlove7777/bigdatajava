package control;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int com = random.nextInt(3);
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.print("[가위:0][바위:1][보:2] : ");
		int me = sc.nextInt();

		if(me == 0) {
			if(com == 0){
				System.out.println("비겼습니다.");
			}
			else if(com == 1) {
				System.out.println("컴퓨터가 이겼습니다.");
			}
			else{
				System.out.println("사용자가 이겼습니다.");
			}
		}
		else if(me == 1) {
			if(com == 0){
				System.out.println("사용자가 이겼습니다.");
			}
			else if(com == 1) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}
		else if(me == 2) {
			if(com == 1){
				System.out.println("사용자가 이겼습니다.");
			}
			else if(com == 2) {
				System.out.println("비겼습니다.");
			}	
			else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}
		
		
		
	}

}
