package backjuntest.기본수학;

import java.util.Scanner;

public class Test1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); //고정비
		int B = sc.nextInt();//가변비용
		int C = sc.nextInt(); //노트북 가격
		
		
		int berak_EvenPoint = 1;
		
		if (B>=C) {
			berak_EvenPoint = -1;
			
			
		}else {
			berak_EvenPoint = A/(C-B);
			berak_EvenPoint++;		
			
		}
		System.out.println(berak_EvenPoint);
	}
}
