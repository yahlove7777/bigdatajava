package cal;

public class If2 {

	public static void main(String[] args) {
		
		int x = 400;
		int z = x % 2;
		
		if(z == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("-----3항 연산자로 출력------");
		System.out.println(z == 0 ? "짝수":"홀수");
	}

}
