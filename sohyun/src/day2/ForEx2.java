package day2;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1���� 10���̿� Ȧ���� ����ϴ� �ڵ带
		 * for���� �̿��Ͽ� �ۼ��ϼ���.
		 * i�� 2�� ���������� �������� 1�� ���ٸ� i�� ���*/
		/*int i = 0;//�ݺ����� �ݺ���Ű������ ����
		for(i = 0; i < 11; i++ ) {			
			if(i % 2 == 1)
			System.out.println(i);
		}
		System.out.println("���ǹ��̻��");
		for(i = 1 ; i <= 10 ; i+=2){
			System.out.println(i);
		}*/
		
		
		
		
		
		
		
		/* 1���� 10������ ���� ���ϴ� ������ �ۼ��ϼ���.
		 * 1.�ݺ������� ����� ���� i�� �հ踦 ������ ���� sum�� �����Ѵ�.
		 * 2. �ݺ����� 1���� 10���� i�� �ϳ��� �����ϸ� �ݺ��Ѵ�.
		 * 3.�ݺ����� ����Ǹ� �հ踦 ���
		 * */
		int i = 0;
		int sum = 0;
		for(i = 1 ; i <= 10 ; i++){
			sum = sum + i;
		}
			System.out.println("1���� 10������ ��" + sum);
			/* ������ 7���� ����ϴ� �ڵ� �ۼ� */
		int j = 7;
			for(i = 1 ; i < 10 ; i++){
				
			System.out.println(j + "X" + i + "=" + j*i);
			}	
			
		for(i =1 ; i<10; i++){
			System.out.println("7 X " + i + " = " + 7*i);
		  }
		}
	}


