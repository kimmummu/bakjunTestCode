package backjuntest.기본수학;

import java.util.Scanner;

public class Test2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int beezip = 1;
		int cnt = 1;
		while(N> beezip) {
			if (N == 1) {
				System.out.println(N);
			}else if(N>beezip){
				beezip = beezip + (6 * cnt);
				cnt = cnt + 1;
			}
		}
		
		System.out.println(cnt);
	}
}
