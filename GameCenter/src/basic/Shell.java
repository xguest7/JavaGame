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
		scan.skip("[\\r\\n]+"); //윈도우 엔터입력시 개행문자 \r\n ,참고> 리눅스는 \n
		String input=scan.nextLine();
		return input.equals("y") ? true : false;
	}
		
	static String selectInput(Scanner scan) {
		System.out.println("게임을 선택해주세요(1~8): ");
		String num=scan.nextLine();
		String str = "basic.Game"+ num; //호출할 클래스명 결정
		return str;
	}
	
	static void playGame(String callClassName, Scanner scan) throws Exception {
		
		//해당하는 클래스를 이용하여 객체생성
		Class<?> c = Class.forName(callClassName);   //<?>는 제한없은 와일드 카드 즉,모든 유형 다 가능
		InterGame obj = (InterGame) c.newInstance();
		
		//게임진행
		obj.title(scan);
		obj.play(scan);
	}
}
