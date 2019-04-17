package data;

public class DataTest {

	public static void main(String[] args) {
		// comment, 주석, 설명
		// Ctrl + / (한줄 주석)
		// sysout, syso + {Ctrl + SpaceBar (자동완성)}
		System.out.println("나의 데이터 프린트");
		
		int spaceY = 300; //-21억 ~ 21억 
		//byte(1byte = 8bit : -128 ~127) 
		//short(2byte)
		//int(4byte)
		//long(8byte)
		int startX = 1;
		int startY = 1;
		int result = startX + startY;
		String result2 = "그래픽의 시작점  y축은 " + spaceY;
		double x = 5.5;
		double y = 5.5;
		char gendr = '남';
		boolean breakTime = true; //false(거짓)
		
		System.out.println("그래픽의 시적점 x축은 " + startX);
		System.out.println(result2);
		System.out.println(result);
		System.out.println();
		System.out.println(x+y);
		System.out.println(gendr);
		System.out.println(breakTime);
		
		
		
	}

}
