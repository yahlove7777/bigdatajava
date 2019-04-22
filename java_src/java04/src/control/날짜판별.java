package control;

import java.util.Date;


public class 날짜판별 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int mon = date.getMonth() + 1;
		
		String result = null;
		
		switch (mon) {
		case 3: case 4: case 5:
			result = "봄";
			break;
		case 6: case 7: case 8:
			result = "여름";
			break;
		case 9: case 10: case 11:
			result = "가을";
			break;
		default:
			result = "겨울";
			break;
		}
		System.out.println("지금은 "+mon+"월, 지금은 "+result+ " 입니다");



	}

}
