/*문제
상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.*/
package backjuntest.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class Test2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		
		String A = String.valueOf(iA);
		String B = String.valueOf(iB);
		
		char [] charArrayA=new char[A.length()];
		charArrayA[0] = A.charAt(2);
		charArrayA[1] = A.charAt(1);
		charArrayA[2] = A.charAt(0);
				
		char [] charArrayB=new char[B.length()];
		charArrayB[0] = B.charAt(2);
		charArrayB[1] = B.charAt(1);
		charArrayB[2] = B.charAt(0);
		
		String strA = String.valueOf(charArrayA);
		String strB = String.valueOf(charArrayB);
				
		int revA = Integer.valueOf(strA);
		int revB = Integer.valueOf(strB);
		
		
		if (revA > revB) {
			System.out.println(revA);
		}else {
			System.out.println(revB);
		}
		
	}
}
