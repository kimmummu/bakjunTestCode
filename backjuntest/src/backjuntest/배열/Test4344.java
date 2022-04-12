package backjuntest.배열;

import java.util.Arrays;
import java.util.Scanner;

public class Test4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(); //테스트 케이스
		//sc.nextLine();
		
		for (int i = 0; i < C; i++) {
			
			int student = sc.nextInt();
			int sum = 0;
			int avg = 0;
			int cnt = 0;
			int A[] = new int[student+1];
			double result = 0;
			
			for(int j = 1; j < student+1; j++) {
				
			
				A[0] = student; // 학생 수
				A[j] = sc.nextInt(); // 점수
				
				
				sum = sum + A[j];
			}
			avg = sum / student;
			for(int g = 1; g<student+1;g++) {
				if (A[g] > avg) {
					cnt= cnt+1;
				}
			}
			result = (double)cnt/student *  100;
			System.out.println(String.format("%.3f", result)+"%");
		}
	}
}
