package backjuntest.문자열;

import java.util.Scanner;

public class Test11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt(); // 갯수
		sc.nextLine();
		
		char A = sc.nextLine().charAt(0); //받는값
		
		
		int sum = 0;
		
		for(int j = 0; j < B; j++) {
			int num = Character.getNumericValue(A); //-0을 붙이면 값 그대로 나오는듯?...
			sum = sum + num;
		}
		System.out.println(sum); 
	}
	
}
