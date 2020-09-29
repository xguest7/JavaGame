package basic;

import java.util.Scanner;

public class Game6 implements InterGame {

	@Override
	public void title() {
		System.out.println("***숫자맞추기 게임***");
		System.out.println("1~100까지 숫자중에 입력해주세요 (기회는 7번)");
		System.out.println("※게임을 중간에 멈추고 싶으면 '종료'라고 입력해주세요※");
	}

	@Override
	public void play() {
		Scanner scan = new Scanner(System.in);
		int count=1;
		int com=(int)(Math.random()*100)+1;
		System.out.println();
		System.out.println();
		for(;;) {
			System.out.print("숫자를 입력해주세요(1~100) : ");
			String user=scan.next();
			if(user.equals("종료")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			int userint = Integer.parseInt(user);	
			if(userint>com) {
				System.out.println("틀렸습니다. 입력하신 숫자가 더 큽니다 ("+count+"번째 시도)");
				++count;
				System.out.println();
			}else if(userint<com) {
				System.out.println("틀렸습니다. 입력하신 숫자가 더 작습니다 ("+count+"번째 시도)");
				++count;
				System.out.println();
			}else if(userint==com) {
				System.out.println();
				System.out.println("★★★★★★★★★★★★★★★★");
				System.out.println("★★★정답입니다★★★"); 
				System.out.println("★★★★★★★★★★★★★★★★");
				System.out.println(" ("+count+"번째 시도)");break;
			}
			if(count==8) {
				System.out.println("다음에 다시 도전해주세요"); break;
			}		
		}

	}

}
