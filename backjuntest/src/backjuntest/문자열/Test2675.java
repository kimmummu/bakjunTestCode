package backjuntest.문자열;

import java.util.Scanner;

public class Test2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스 수
		
		
		for(int i = 0; i < T; i++) {
			
			int R = sc.nextInt();//반복 횟수
			String S = sc.next(); //받을 문자
			for(int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
