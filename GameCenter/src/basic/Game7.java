package basic;

import java.util.Scanner;

public class Game7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com;
		int user;
		for(;;) {
			com=(int)(Math.random()*10)+1;
			System.out.println(com);
			System.out.println("숫자를 입력해주세요(0: 짝수, 1: 홀수): ");
			user=scan.nextInt();
			if((com%2) == user) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}

	}

}
