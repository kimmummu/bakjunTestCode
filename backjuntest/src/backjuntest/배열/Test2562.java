package backjuntest.배열;

import java.util.Scanner;

public class Test2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int [] arr = null;
		
		for(int i= 0; i<101; i++) {
			if( sc.hasNextInt()) {
				break;
			}else{
			arr[i] = sc.nextInt();
			}
		}
		int max = 0;
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] >= max) {
				max = arr[j];
			}
		System.out.println(max);	
		}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == max) {
				System.out.print(j);
			}
		}
		
	}
}