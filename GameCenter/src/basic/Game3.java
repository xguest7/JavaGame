package basic;

import java.util.Scanner;

public class Game3 implements InterGame {

	@Override
	public void title() {
		System.out.println("그냥 가볍게 해보는 겁니다");
	}

	@Override
	public void play() {
			Scanner scan = new Scanner(System.in);
			int com;
			int user;
			for(;;) {
				com=(int)(Math.random()*10)+1;	//컴퓨터가 정한수(1~10)
				System.out.println("랜덤값"+com);
				System.out.println("숫자를 입력해주세요(0:짝, 1:홀): ");
				user=scan.nextInt();
				if((com%2) == user) {
					System.out.println("정답입니다.");
				}else {
					System.out.println("틀렸습니다.");
				}
			}
		}
	}
