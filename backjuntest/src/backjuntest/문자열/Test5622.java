package backjuntest.문자열;
/*상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.



전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Test5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toUpperCase();
		int count = 0;
		
		for (int i =0; i < str.length(); i++) {
			
			if(str.charAt(i)== 'A' || str.charAt(i)== 'B'|| str.charAt(i)== 'C') {
				count = count + 3;
			}else if (str.charAt(i)== 'D' || str.charAt(i)== 'E'|| str.charAt(i)== 'F') {
				count = count + 4;
			}else if (str.charAt(i)== 'G' || str.charAt(i)== 'H'|| str.charAt(i)== 'I') {
				count = count + 5;
			}else if (str.charAt(i)== 'J' || str.charAt(i)== 'K'|| str.charAt(i)== 'L') {
				count = count + 6;
			}else if (str.charAt(i)== 'M' || str.charAt(i)== 'N'|| str.charAt(i)== 'O') {
				count = count + 7;
			}else if (str.charAt(i)== 'P' || str.charAt(i)== 'Q'|| str.charAt(i)== 'R'|| str.charAt(i)== 'S') {
				count = count + 8;
			}else if (str.charAt(i)== 'T' || str.charAt(i)== 'U'|| str.charAt(i)== 'V') {
				count = count + 9;
			}else if (str.charAt(i)== 'W' || str.charAt(i)== 'X'|| str.charAt(i)== 'Y'|| str.charAt(i)== 'Z') {
				count = count + 10;
			}
			
		}
		System.out.println(count);
		
	}
}
