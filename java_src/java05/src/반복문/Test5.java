package 반복문;

public class Test5 {
	
	public static void main(String[] args) {
		
		int i;
		
		for(i = 1;i < 10; i++) {
			System.out.println(i+"단");
			for(int j = 1;j < 10;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");	
			}
			System.out.println("");
		}
	}

}
