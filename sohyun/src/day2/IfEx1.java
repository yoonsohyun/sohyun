package day2;

public class IfEx1 {
	public static void main(String []args){
		/* 정수가 홀수인지 짝수인지 판별하는 코드를  if문을 이용하여 작성하시오. */
		
		int num =10;	
		if(num % 2 == 0) {
			System.out.print(num+"는 짝수");
		}else{
			System.out.println(num+"는 홀수");
		}
	}
}
