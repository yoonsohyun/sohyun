package day2;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�� ���� �ּ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ּ� ����� : �� ���� ����� �� �ּ��� �����
		 * ����� : �� ���� ��� �� �������� ���
		 * ��� : ����� ������ ����� �������� 0�� ��
		 * 10 : 10 20 30 40 50 60 70 ...
		 * 15 : 15 30 45 60 ....
		 * 10�� 15�� ����� : 30 60 90 ...
		 * 10�� 15�� �ּ� ����� : 30 
		 * 
		 * */
		int num1 = 10, num2 = 15 ,i = 0;
		int cnt = 0 ;
		System.out.println(num1 + "��" + num2 + "��"+ "�������?");
		for(i=num1 ; i <= num1*num2 ; i++ ){
			cnt++;
			 if(i % num1 == 0 && i % num2 == 0){
			 // i�� num1���� �������� �� �������� 0�̰�,
			 // i�� num2���� �������� �� �������� 0�̸�,
			 // i�� ���(�����)
		     // �ݺ����� �����ϱ� ���ؼ��� switch case������ �����break�� �̿�.
			 // a�� b�� ��� = b�� a�� ��� = a�� b�� �������� �� �������� 0
				 System.out.println("�� �� : "+ i);
			     break;//�ܼ��ϰ� �ּҰ���� ���Ѱ�
		} 
		 
	}
		System.out.println("�ܼ� �ݺ� Ƚ�� "+cnt);
		cnt = 0;

for(i=num1 ; i <= num1*num2 ; i+=num1 ){	
	cnt++;
	 if(i % num2 == 0){
		 
		 System.out.println("���ݻ��� : "+ i);
	     break;
 }  
}
System.out.println("���� ���� Ƚ�� "+cnt);
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
		 System.out.println("���� ���� : "+ i);
	     break;
 } 
 }
System.out.println("���� ���� Ƚ��"+cnt);
}
}
