package day2;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*두 수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소 공배수 : 두 수의 공배수 중 최소인 공배수
		 * 공배수 : 두 수의 배수 중 공통적인 배수
		 * 배수 : 배수를 정수로 나누어서 나머지가 0인 수
		 * 10 : 10 20 30 40 50 60 70 ...
		 * 15 : 15 30 45 60 ....
		 * 10과 15의 공배수 : 30 60 90 ...
		 * 10과 15의 최소 공배수 : 30 
		 * 
		 * */
		int num1 = 10, num2 = 15 ,i = 0;
		int cnt = 0 ;
		System.out.println(num1 + "과" + num2 + "의"+ "공배수는?");
		for(i=num1 ; i <= num1*num2 ; i++ ){
			cnt++;
			 if(i % num1 == 0 && i % num2 == 0){
			 // i를 num1으로 나누었을 때 나머지가 0이고,
			 // i가 num2으로 나누었을 때 나머지가 0이면,
			 // i를 출력(공배수)
		     // 반복문을 종료하기 위해서는 switch case문에서 사용한break를 이용.
			 // a가 b의 배수 = b는 a의 약수 = a를 b로 나누었을 때 나머지가 0
				 System.out.println("단 순 : "+ i);
			     break;//단순하게 최소공배수 구한거
		} 
		 
	}
		System.out.println("단순 반복 횟수 "+cnt);
		cnt = 0;

for(i=num1 ; i <= num1*num2 ; i+=num1 ){	
	cnt++;
	 if(i % num2 == 0){
		 
		 System.out.println("조금생각 : "+ i);
	     break;
 }  
}
System.out.println("조금 생각 횟수 "+cnt);
cnt = 0;


int tmpnum = num1;
int div = num2;
if(num2>num1){
	tmpnum=num2;
	div = num1;
}
for(i=tmpnum ; i <= num1*num2 ; i+=tmpnum ){	
	cnt++;
	 if(i % div == 0){
		 System.out.println("많이 생각 : "+ i);
	     break;
 } 
 }
System.out.println("많이 생각 횟수"+cnt);
}
}
