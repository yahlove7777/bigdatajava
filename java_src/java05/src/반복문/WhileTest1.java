package 반복문;

public class WhileTest1 {

	public static void main(String[] args) {
		
		int start = 1;
		int sum = 0;
		
		while(start <= 10) {
			
			System.out.println(start);
			sum = sum + start;
			start++;
		}
		System.out.println(sum);
		
		
		

	}

}
