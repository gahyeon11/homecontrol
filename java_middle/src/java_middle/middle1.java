package java_middle;
import java.util.Scanner;
public class middle1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Control control = new Control();  

		System.out.println("현재 집의 상태");
		
		while(true) {

		control.onoroff();   
		//Control 클래스의 onoroff메소드 실행
		System.out.println("");
		System.out.println(
				"\n(보안, 전등, 커튼, 가스 ,티비)어떤 것의 상태를 변경하시나요?  -----종료는 quit을 입력하세요----- ");
		control.enter=sc.next();

		
		if(control.enter.equals("보안")) {  //Control 클래스의 security메소드 실행
			System.out.println(
					"(재실, 잠시외출, 단기외출, 장기외출) 무엇으로 변경하시겠습니까?");
			control.sec=sc.next();
			control.security();
			}
		else if(control.enter.equals("전등")) {     //Control 클래스의 light메소드 실행
			System.out.print(
					"전등 번호를 입력하세요");
			control.lightnum=sc.nextInt();
			control.light();
			}
		else if(control.enter.equals("커튼")) {     //Control 클래스의 curtain메소드 실행
			control.curtain();}
		else if(control.enter.equals("가스")) {     //Control 클래스의 gas메소드 실행
			control.gas();}
		else if(control.enter.equals("티비")) {     //Control 클래스의 tv메소드 실행
			control.tv();}

		if(control.enter.equals("quit")) {      //반복문 종료
			System.out.println(" 시스템을 종료합니다. " );
			break;

		}
	
		}
		
	}
	
}

