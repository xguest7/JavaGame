package basic;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws Exception {
		// 1.각각의 클래스이름은 김수언님부터 시작해서 Game1 ~ Game8
		// 2.해당 클래스를 구현할때는 InterGame 이라는 인터페스를 구현해서 만드시오
		// 3.해당 소스는 깃허브를 이용해 관리됩니다. (https://github.com/xguest7/JavaGame.git)
		
		Scanner scan = new Scanner(System.in);
		do {
			Shell.title(); //메인 타이틀 출력
			String callClassName = Shell.selectInput(scan); //해당게임선택
			Shell.playGame(callClassName,scan);
		}while(Shell.loopCheck(scan)); //반복여부 확인후 반복 또는 종료
		
		System.out.println("이용해 주셔서 감사합니다. 끝");
		scan.close();
	}
}
