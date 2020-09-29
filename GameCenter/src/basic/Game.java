package basic;

public class Game {

	public static void main(String[] args) throws Exception {
		// 1.각각의 클래스이름은 김수언님부터 시작해서 Game1 ~ Game8
		// 2.해당 클래스를 구현할때는 InterGame 이라는 인터페스를 구현해서 만드시오
		// 3.작성후에는 공유폴더의 작업통합이라는 폴더에 올려주세요.
		
		do {
			Shell.title(); //메인 타이틀 출력
			String callClassName = Shell.selectInput(); //해당게임선택
			Shell.playGame(callClassName);
		}while(Shell.loopCheck()); //반복여부 확인후 반복 또는 종료
		
		System.out.println("이용해 주셔서 감사합니다. 끝");
	}
}
