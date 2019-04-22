package window;

import java.util.Date;

public class 날짜테스트 {

	public static void main(String[] args) {
		
		Date name = new Date();
		int hour = name.getHours();
		int min = name.getMinutes();
		int sec = name.getSeconds();
		System.out.println("현재 시각은 "+hour+"시 "+min+"분 "+sec+"초 입니다.");		

	}

}
