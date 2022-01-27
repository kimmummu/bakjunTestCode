package backjuntest.while문;

import java.util.Scanner;

public class Test10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = 1;
		int B = 1;
				
		while (A + B != 0) {
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			if (A==0 && B== 0) {
				System.out.println(" ");
			}else {
				System.out.println(A+B);
			}
		}
	}
}
