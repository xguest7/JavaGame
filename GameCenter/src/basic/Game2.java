package basic;

import java.util.Scanner;

public class Game2 implements InterGame {

	
	@Override
	public void title() {
		System.out.println("우승 도전");
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("리그를 진행을 원하시면 1을 입력");
		int user = sc.nextInt();
		
		if(user == 1) {
			System.out.println("리그 진행중");
			for(int i=1; i<10; i++) { 
				System.out.println("도전 횟수"+i);
			int num= (int)(Math.random()*10)+1;	
			if(num<8) {
				System.out.println("리그 우승");
			}else if(num>8 || num<10){
				System.out.println("우승 실패");
				break;
			}
			}
	    }else {
	    	System.out.println("리그 중단");
	    }
	}
}

