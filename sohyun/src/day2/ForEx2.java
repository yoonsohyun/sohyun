package day2;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1부터 10사이에 홀수만 출력하는 코드를
		 * for문을 이용하여 작성하세요.
		 * i를 2로 나누었을때 나머지가 1과 같다면 i를 출력*/
		/*int i = 0;//반복문을 반복시키기위한 변수
		for(i = 0; i < 11; i++ ) {			
			if(i % 2 == 1)
			System.out.println(i);
		}
		System.out.println("조건문미사용");
		for(i = 1 ; i <= 10 ; i+=2){
			System.out.println(i);
		}*/
		
		
		
		
		
		
		
		/* 1부터 10까지의 합을 구하는 예제를 작성하세요.
		 * 1.반복문에서 사용할 변수 i와 합계를 저장할 변수 sum을 선언한다.
		 * 2. 반복문은 1부터 10까지 i가 하나씩 증가하며 반복한다.
		 * 3.반복문이 종료되면 합계를 출력
		 * */
		int i = 0;
		int sum = 0;
		for(i = 1 ; i <= 10 ; i++){
			sum = sum + i;
		}
			System.out.println("1부터 10까지의 합" + sum);
			/* 구구단 7단을 출력하는 코드 작성 */
		int j = 7;
			for(i = 1 ; i < 10 ; i++){
				
			System.out.println(j + "X" + i + "=" + j*i);
			}	
			
		for(i =1 ; i<10; i++){
			System.out.println("7 X " + i + " = " + 7*i);
		  }
		}
	}


