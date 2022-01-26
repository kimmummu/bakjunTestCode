package backjuntest.for문;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10871 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 총 갯수
		int X = sc.nextInt(); // 비교할 수 X		
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			
			 int num = sc.nextInt();
			 list.add(num);
		}
		
		for (int j = 0; j < N; j++) {
			if(list.get(j)<X) {
				System.out.print(list.get(j)+" ");
			}
		}
	}
}
