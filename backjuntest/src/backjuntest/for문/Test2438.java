package backjuntest.for문;

import java.io.IOException;
import java.util.Scanner;

public class Test2438 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int T =  sc.nextInt();
		String star = "*";
		
		for (int i = 1; i <= T; i++ ) {
			if (i==1) {
				System.out.println(star);
			}else {
				star= star + "*";
				System.out.println(star);
			}
		}
		
	}
}
