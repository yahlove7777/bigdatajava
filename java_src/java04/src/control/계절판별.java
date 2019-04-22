package control;

import java.util.Date;


public class 계절판별 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int mon = date.getMonth()+1;
		
		String result = null;
		
		switch (mon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = "31일까지 있는 달입니다.";
			break;
		case 2:
			result = "28일까지 있는 달입니다.";
			break;
		default:
			result = "30일까지 있는 달입니다.";
			break;
		}
		System.out.println(result);



	}

}
