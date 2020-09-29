package basic;

import java.util.Scanner;

public class Game1 implements InterGame {

	
	int animal=0;
	int activity=0;
	String animalStr, name;
	
	@Override
	public void title(Scanner scan) {
		System.out.println("================ 다마고치 게임 =================\n");
		System.out.println("나만의 귀여운 애완동물을 키워보세요!");
		System.out.println("음식을 주고, 씻겨주고, 잘 보살피면 성장합니다!");
		System.out.println("** 레벨업 시스템은 곧 업데이트 예정입니다^^ **");
		System.out.println("================================================");
	}
	
	@Override
	public void play(Scanner scan) {
		
		// 1. 애완동물 선택하기
		selection(scan);
		
		// 2. 이름 지어주기
		name(scan);

		// 활동 선택하기
		System.out.println("3. "+name+"와 함께할 활동 선택하기");
		System.out.println("   1) 먹이 주기");
		System.out.println("   2) 잠 재우기");
		System.out.println("   3) 산책하기");
		System.out.println("   4) 목욕시키기");
//		System.out.println("   5) 종료");
		System.out.print  (name+"와 함께할 활동을 선택하세요: ");
		activity = scan.nextInt();
		System.out.println("================================================");
		
		switch (activity) {
		case 1:
			eat();		// 먹이 주기
			break;
		case 2:
			sleep();	// 잠 재우기
			break;
		case 3:
			walk();		// 산책하기
			break;
		case 4:
			bath();		// 목욕하기
			break;
		}

	}
	
	private void selection(Scanner scan) {
		while(animal==0) {
			System.out.println("1. 애완동물 선택하기");
			System.out.println("   1)강아지 \n   2)고양이 \n   3)토끼 \n   4)다람쥐 \n");
			System.out.print(">> 키우고 싶은 애완동물을 선택하세요: ");
			animal = scan.nextInt();

//			System.out.println("================================================");
			if 		(animal==1) animalStr="강아지";
			else if (animal==2)	animalStr="고양이";
			else if (animal==3)	animalStr="토끼";
			else if (animal==4)	animalStr="다람쥐";
			System.out.println(">> 사랑스러운 "+animalStr+" 한 마리가 태어났습니다.");
//			else 	System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		System.out.println("================================================");
	}

	private void name(Scanner scan) {
		System.out.println("2. 이름 지어주기");
		System.out.print(">> "+animalStr+"의 이름을 입력해주세요: ");
		name = scan.next();
		System.out.println(">> "+animalStr+"의 이름은 \'"+name+"\'입니다.");
		System.out.println("================================================");
	}

	private void eat() {
		System.out.println(name+"와 밥을 먹습니다.");
		System.out.println(name+"가 배가 불러 기분이 좋아집니다.");
		System.out.println("================================================");
		
	}
	
	private void sleep() {
		System.out.println(name+"가 잠을 잡니다.");
		System.out.println(name+"가 잠을 푹 자서 행복해집니다.");
		System.out.println("================================================");
		
	}

	private void walk() {
		System.out.println(name+"가 산책을 합니다.");
		System.out.println(name+"가 신나게 산책을 해서 즐거워집니다.");
		System.out.println("================================================");
	}

	private void bath() {
		System.out.println(name+"가 목욕을 합니다.");
		System.out.println(name+"가 깨끗하게 목욕을 해서 산뜻함을 느낍니다.");
		System.out.println("================================================");
	}
}
