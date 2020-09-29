package basic;
//우리는 협업해서 진행합니다.
import java.util.Scanner;

public class Shell {
	static void title() throws InterruptedException {
		System.out.println("**********************************");
		String strintro = "게임선터에 오신것을 환경합니다.";
		char[] intro = strintro.toCharArray();
		for(char temp: intro) {
			System.out.print(temp);
			Thread.sleep(100); //0.1초 대기
		}
		System.out.println("\n**********************************");
		System.out.println("8가지의 즐거움을 맛볼수 있습니다.");
	}
	
	static boolean loopCheck(Scanner scan) {
		System.out.println("다른 게임을 하시겠습니까?( y or n): ");
		String input=null;
		if((input=scan.nextLine()) .equals(""))  //개행문자가 있으면(문자열값은 빈값으로 입력됨) 다시입력, 개행문자 아니면 정상입력
			input=scan.nextLine();
		return input.equals("y") ? true : false;
	}
		
	static String selectInput(Scanner scan) {
		System.out.println("게임을 선택해주세요(1~8): ");
		String num=scan.nextLine();
		String str = "basic.Game"+ num; //호출할 클래스명 결정
		return str;
	}
	
	static void playGame(String callClassName, Scanner scan) throws Exception {
		
/*		//해당하는 클래스를 이용하여 객체생성
		Class<?> c = Class.forName(callClassName);   //<?>는 제한없은 와일드 카드 즉,모든 유형 다 가능
		InterGame obj = (InterGame) c.newInstance();
		
		//게임진행
		obj.title(scan);
		obj.play(scan);				*/
		
		boolean isGame=true;  
		InterGame obj=null;
		switch (callClassName){
			case "basic.Game1" :
				obj = new Game1(); break;
			case "basic.Game2" :
				obj = new Game2(); break;
//			case "basic.Game3" :						//에러
//				obj = new Game3(); break;
//			case "basic.Game4" :						//에러
//				obj = new Game4(); break;
//			case "basic.Game5" : 						//현재 미존재
//				obj = new Game5(); break;
			case "basic.Game6" :
				obj = new Game6(); break;
//			case "basic.Game7" :						//잘못 구현되어 있음
//				obj = new Game7(); break;		
			case "basic.Game8" :
				obj = new Game8(); break;
			default:
				System.out.println("실행이 불가능한 게임입니다.");
				isGame=false;
				break;
		}
		if(isGame) {
			obj.title(scan);
			obj.play(scan);	
		}
		
	}
}
