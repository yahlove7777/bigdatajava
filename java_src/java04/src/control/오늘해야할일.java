package control;

import java.util.Date;


public class 오늘해야할일 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int day = date.getDay();
		
		String result = null;
		
		switch (day) {
		case 0:
			result = "쉬는 날";
			break;
		case 1:
			result = "학원에 가는날";
			break;
		case 2:
			result = "동네 한바퀴 도는날";
			break;
		case 3:
			result = "영어 공부 하는날";
			break;
		case 4:
			result = "공부 하는날";
			break;
		case 5:
			result = "친구 만나는날";
			break;
		default:
			result = "술 마시는날";
			break;
		}
		System.out.println(result);



	}

}
