package 반복문;

public class WhileTest4 {

	public static void main(String[] args) {
		//두개의 입력값을 받아서, 첫번째값부터 두번째값까지 더함

		int num1 = 11;
		int num2 = 20;
		int sum = 0;
		
		while(num1<=num2) {
			
			sum = sum + num1;
			num1++;
			
		}
		System.out.println(sum);
	}

}
