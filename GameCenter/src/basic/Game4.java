package basic;

import java.util.Scanner;

public class Game4 implements InterGame {

	public void title(Scanner scan) {
		System.out.println("★☆★★☆★3개의 랜덤게임★☆★★☆★");
		System.out.println("3번째 문제 까지 성공시 상품 획득");

	}

	int ran1(Scanner scan) {
		System.out.println("★☆★첫번째★☆★ -> 1~10중 숫자를 맞추시오.(제한횟수 10회)");
		new Scanner(System.in);
		int count1 = 0;
		int count2 = 10;
		int num = (int) ((Math.random() * 10) + 1);
		for (int i = 0; i < 10; ++i) {
			System.out.print("숫자를 입력하세요  :  ");
			int sc = scan.nextInt();
			if (sc > 10 || sc < 1) {
				System.out.println("입력오류....다시입력하세요.");
			}
			if (sc == 3) {
				System.out.println("---------------------");
				System.out.println("---------------------");
				System.out.println("맞추셧습니다. 다음문제로...");
				System.out.println("---------------------");
				System.out.println("---------------------");
				return ran2(scan);
			} else if (sc != 3) {
				count1++;
				count2--;
				System.out.println("틀리셧습니다 . 도전횟수 : " + count1 + "번째 !! 남은 도전횟수 : " + count2);
				switch (count1) {
				case 10:
					System.out.println("도전횟수 10번 끝 ...실패!");
					break;
				}
			}
		}
		return 0;
	}

	int ran2(Scanner scan) {
		System.out.println("★☆★두번째★☆★ -> 1~2중 숫자를 맞추시오.(제한횟수 5회)");
		int count1 = 0;
		int count2 = 5;
		for (;;) {
			System.out.print("숫자를 입력하세요 : ");
			int num = (int) ((Math.random() * 2) + 1);
			int sc = scan.nextInt();
			if (sc > 2 || sc < 1) {
				System.out.println("입력오류....다시입력하세요.");
			}
			if (num == sc) {
				System.out.println(" 입력숫자  :  " + sc + "  컴퓨터의 숫자  :  " + num);
				System.out.println("---------------------");
				System.out.println("---------------------");
				System.out.println("맞추셧습니다. 다음문제로...");
				System.out.println("---------------------");
				System.out.println("---------------------");
				return ran3(scan);
			} else {
				count1++;
				count2--;
				System.out.println(" 입력숫자  :  " + sc + "  컴퓨터의 숫자  :  " + num);
				System.out.println("틀리셧습니다 . 도전횟수 : " + count1 + "번째 !! 남은 도전횟수 : " + count2);
				switch (count1) {
				case 5:
					System.out.println("도전횟수 5번 끝 ...실패!");
					break;
				}
				
			}
			return 0;
		}

	}

	int ran3(Scanner scan) {
		System.out.println(" ★☆★★☆★ 축하 합니다 ★☆★★☆★");
		System.out.println("두번째 게임이 마지막 게임입니다.");
		System.out.println("세번째 게임은 없습니다.");
		System.out.println("상품도 없습니다.");
		System.out.println("고생하셧습니다.");
		System.out.println(" ★☆★★☆★ End ★☆★★☆★");
		return 0;
	}

	public void play(Scanner scan) {
		ran1(scan);
	}

}
