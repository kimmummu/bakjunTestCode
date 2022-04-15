package backjuntest.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class Test1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		char [] arry = new char[T.length()];
		String resultStr ="";
		int resultInt1 = 0;
		int resultInt2 = 0;
		arry = T.toCharArray();
		
		for(int j =0; j <arry.length; j++) {
			for(int k =0; k < j; k++) {
				//resultInt1 = 1;
				if(arry[j] == arry[k]) {
					resultInt1 = resultInt1 + 1;
				}
			}
			if(j == 0) {
				resultInt2 = resultInt1;
			}else if(resultInt1 > resultInt2) {
				resultStr =  Character.toString(arry[j]);
				resultInt2 = resultInt1;
			}else if(resultInt1 == resultInt2){
				resultStr ="?";
			}
			
		}
		if(arry.length == 1){
			resultStr = Character.toString(arry[0]);
		}else { 
		System.out.println(resultStr.toUpperCase());
	
		}
	}
}
