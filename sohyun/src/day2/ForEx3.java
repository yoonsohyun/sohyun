package day2;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		
		int num = 145; 
		System.out.print(num+"�� ��� :");
		int i=0;
		for(i=1; i <= num; i++){ //i�� 1���� num���� �ϳ��� �����Ͽ� �ݺ��Ѵ�.
			if(num % i == 0) 
				System.out.print(i+" "); // num�� i�� �������� �� �������� 0�̸�
                                        // �ֿܼ� i�� ����Ѵ�. */
		
				/*	�� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * 	�ִ� ����� : �� ���� ����� �� ���� ū ��
		 * 	����� : �� ���� ����� ������ ���
		 *  ��� : ������ �������� ���� 4�� ����� 1,2,4
		 *  8�� 12�� �ִ� �����
		 *  8 : 1,2,4,8
		 *  12 : 1,2,3,4,6,12
		 *  8�� 12�� ����� : 1,2,4
		 *  8�� 12�� �ִ� ����� :4 */
		/* ������ ����� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * 1���� �ڱ� �ڽű��� ����� ��������
		 * 0�� �Ǹ� �� ���� ������ ����̴�.
		 * */
		/*
			int num1 = 145; 
			int num2 = 50;
			System.out.print(num1+","+num2+"�� ����� :");
			int i=0;
			for(i=1; i <= num1; i++){ 
				if(num1 % i == 0 && num2 % i == 0)
					//num1�� i�� �������� �� �������� 0�̰�,
					//num2�� i�� �������� �� �������� 0�̸�

					System.out.print(i+" "); 
			} //��������ϱ� */
	              
			int num1 = 8; 
			int num2 = 12;
			int gcd = 1;
			System.out.print(num1+","+num2+"�� �ִ� ����� :");
			int i=0;
			for(i=1; i <= num1; i++){ 
				if(num1 % i == 0 && num2 % i == 0)
					gcd = i ;
			}		System.out.print(gcd); 
	}
	
	
}
