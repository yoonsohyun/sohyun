package day2;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		switch(����){
		case ��1: //if(���� == ��1)
			���๮1;
			//break�� ������ �������� ��1�� �� ���๮ 1�� �����ϰ�,
			//������ �������� �� 1�� �� ���๮ 1�� ���๮ 2�� ���� �����
			break;
		case ��2: //else if(���� == ��2)
			���๮2;
			break; 
		default: //else
			���๮3;
		}
		*/
		/* num�� ���� 0�̸� �ֿܼ� 0�Դϴ� ���,
		 * num�� ���� 1 �̸� �ֿܼ� 1�Դϴ� ���
		 * num�� ���� 0�� 1�� �ƴϸ� �ֿܼ� 0�� 1�� �ƴմϴٶ�� 
		 * ����ϴ¿���	 */
		int num = 3;
		switch(num){
		case 0: // if(num == 0)
			System.out.println("0�Դϴ�.");
			break;
		case 1: // else if(num == 1)
			System.out.println("1�Դϴ�.");
			break;
		default: // else
			System.out.println(num+ "�� 0�� 1�� �ƴմϴ�.");
		}
		

	}

}
