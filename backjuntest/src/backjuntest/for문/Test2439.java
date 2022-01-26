package backjuntest.for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test2439 {
	public static void main(String[] args) throws IOException {
			
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int num= T;
		sc.close();
		String star = "*";
		
		for(int i = 1; i<=T; i++) {
			for(int n = num; n>=2; n--) {
				System.out.print(" ");
			}
			for(int j = i; j<=i; j++)
				if (i==1) {
					System.out.println("*");
					num--;
				}else {
					
					star = star +"*";
					System.out.println(star);
					num--;		
				}
				
}
		}
}
