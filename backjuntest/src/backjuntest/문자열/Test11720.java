package backjuntest.문자열;

import java.util.Scanner;

public class Test11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt(); // 갯수
		sc.nextLine();
		
		String A = sc.nextLine(); //받는값
		
		
		int sum = 0;
		
		for(int j = 0; j < B; j++) {
			int num = A.charAt(j)-'0';
			sum = sum + num;
		}
		System.out.println(sum); 
	}
	
}
