package day2;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		
		int num = 145; 
		System.out.print(num+"의 약수 :");
		int i=0;
		for(i=1; i <= num; i++){ //i를 1부터 num까지 하나씩 증가하여 반복한다.
			if(num % i == 0) 
				System.out.print(i+" "); // num을 i로 나누었을 때 나머지가 0이면
                                        // 콘솔에 i를 출력한다. */
		
				/*	두 수의 최대 공약수를 구하는 코드를 작성하시오.
		 * 	최대 공약수 : 두 수의 공약수 중 가장 큰 수
		 * 	공약수 : 두 수의 약수중 공통인 약수
		 *  약수 : 나누어 떨어지는 수로 4의 약수는 1,2,4
		 *  8과 12의 최대 공약수
		 *  8 : 1,2,4,8
		 *  12 : 1,2,3,4,6,12
		 *  8과 12의 공약수 : 1,2,4
		 *  8과 12의 최대 공약수 :4 */
		/* 정수의 약수를 구하는 코드를 작성하시오.
		 * 1부터 자기 자신까지 나누어서 나머지가
		 * 0이 되면 그 수는 정수의 약수이다.
		 * */
		/*
			int num1 = 145; 
			int num2 = 50;
			System.out.print(num1+","+num2+"의 공약수 :");
			int i=0;
			for(i=1; i <= num1; i++){ 
				if(num1 % i == 0 && num2 % i == 0)
					//num1을 i로 나누었을 때 나머지가 0이고,
					//num2를 i로 나누었을 때 나머지가 0이면

					System.out.print(i+" "); 
			} //공약수구하기 */
	              
			int num1 = 8; 
			int num2 = 12;
			int gcd = 1;
			System.out.print(num1+","+num2+"의 최대 공약수 :");
			int i=0;
			for(i=1; i <= num1; i++){ 
				if(num1 % i == 0 && num2 % i == 0)
					gcd = i ;
			}		System.out.print(gcd); 
	}
	
	
}
