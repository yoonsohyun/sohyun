package day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���� ch�� a �Ǵ� A�̸� A�Դϴٶ�� �ֿܼ� ����ϰ�\
		 * ���� ch�� b �Ǵ� B�̸� B�Դϴٶ�� �ֿܼ� ����ϰ�
		 * ���� ch�� a,b,A,B�� �ƴϸ� A,B�� �ƴմϴٶ�� �ֿܼ� ����ϴ� ������
		 * Switch case������ �ۼ��Ͻÿ�
		 */		

		char ch = 'a';
		switch(ch){
		case 'a': //ch�� ���� a�̸�
		case 'A': //ch�� ���� a�̸�
			System.out.println("A�Դϴ�.");
			break;
		case 'b' :
		case 'B': //ch�� ���� b�̸�
			System.out.println("A�Դϴ�.");
			break;
		default :
			System.out.println("A,B�� �ƴմϴ�.");
		}
	}
}
	

