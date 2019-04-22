package control;

import java.util.Date;


public class 연도구하기 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int year = date.getYear()+1900;
		
		int year2 = 2222 - year;
		
		System.out.println("2222년이 되려면 "+year2+"년 남았습니다.");
		


	}

}
