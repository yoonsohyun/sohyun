package day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문자 ch가 a 또는 A이면 A입니다라고 콘솔에 출력하고\
		 * 문자 ch가 b 또는 B이면 B입니다라고 콘솔에 출력하고
		 * 문자 ch가 a,b,A,B가 아니면 A,B가 아닙니다라고 콘솔에 출력하는 문제를
		 * Switch case문으로 작성하시오
		 */		

		char ch = 'a';
		switch(ch){
		case 'a': //ch의 값이 a이면
		case 'A': //ch의 값이 a이면
			System.out.println("A입니다.");
			break;
		case 'b' :
		case 'B': //ch의 값이 b이면
			System.out.println("A입니다.");
			break;
		default :
			System.out.println("A,B가 아닙니다.");
		}
	}
}
	

