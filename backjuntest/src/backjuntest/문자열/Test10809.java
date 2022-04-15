package backjuntest.문자열;

import java.util.Scanner;

public class Test10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		int arr[] = new int[26];
		for(int i =0;i<26;i++){
			arr[i]=-1;
		}
		for(int i=0;i<name.length();i++) {
			char array[]=name.toCharArray();			
			if(arr[(int)array[i]-97] == -1) {
			    arr[(int)array[i]-97]=i;
			}
			
		}
		for(int i=0;i<26;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
