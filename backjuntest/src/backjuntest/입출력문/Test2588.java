package backjuntest.입출력문;

import java.util.Scanner;

public class Test2588 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String strB = String.valueOf(B);
		
		//System.out.println("데이터 타입: "+ strB.getClass().getName()+"값: "+strB );
		
		//int len = strB.length();
		
		//System.out.println(len);
		
		String str5 = strB.substring(0, 1);
		String str4 = strB.substring(1, 2);
		String str3 = strB.substring(2, 3);
		
		//System.out.println("str5: "+ str5);
		//System.out.println("str4: "+ str4);
		//System.out.println("str3: "+ str3);
		
		
		int T5 = Integer.parseInt(str5);
		int T4 = Integer.parseInt(str4);
		int T3 = Integer.parseInt(str3);
		
		int answer5 = (A*T5);
		int answer4 = (A*T4);
		int answer3 = (A*T3);
		
		
		
		
		
		System.out.println(answer3);
		System.out.println(answer4);
		System.out.println(answer5);
		System.out.println(A*B);
		
		
	}
}
