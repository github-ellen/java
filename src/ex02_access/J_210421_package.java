package ex02_access;

import ex01_class.Bank;

public class J_210421_package {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.getA());
		
		
		//�ٸ� ��Ű���� �ִ� Ŭ������ ����Ϸ��� ?
		//ex01_class.Bank b1 = new ex01_class.Bank("�������� ", "11-22-3");
		Bank b1 = new Bank("�������� ", "11-22-3"); //import �߱� ������ ����
		//Bank Ŭ���� �տ� public�� �پ����.
		//pubilc : ��� Ŭ������ ���� ����
		//private : �ڽ��� Ŭ���� ���ο����� ���� ����
		//default(���� �����ڰ� ����) : ���� ��Ű���� ���� ����.
	}

}
