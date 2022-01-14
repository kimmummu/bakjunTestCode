package backjuntest.입출력문;

/*문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A+B를 출력한다.*/

// 값을 잘못 입력했을 시 다시 입력하는걸 반복하고 싶은데 아직 모름
import java.util.Scanner;

public class Test1000  {
	public static void main(String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 숫자를 입력하세요. a는 0보다 큰 숫자를 입력해야합니다.");
		
		int a = sc.nextInt();
		
		if (a <= 0) {
			System.out.println("0보다 큰 수를 입력해주세요");
			int c = sc.nextInt();
			a = c;
		} 
		
		System.out.println("b의 숫자를 입력하세요. b는 10보다 작은 숫자를 입력해야합니다.");
		
		int b = sc.nextInt();
		if (b > 10) {
			System.out.println("10보다 작은 수를 입력해주세요");
			int d = sc.nextInt();
			b = d;
		} 
		
		
		System.out.println(a+b);
		
	
	}
}
