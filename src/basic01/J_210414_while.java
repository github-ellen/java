package basic01;

import java.util.Scanner;

public class J_210414_while {

	public static void main(String[] args) {
		// �ݺ���
		//���� ���� ���ϱ� - 0 �Է� ��, ����
		Scanner sc = new Scanner(System.in);
//		double r ;		
//		while (true) {
//			System.out.print("�������� ? ");
//			r = sc.nextDouble();
//			if (r==0) {
//				System.out.println("�����մϴ�."); break;
//			}
//			System.out.println("���� ���̴� "+r*r*3.14);
//		}
		
		//���� ���� ���ϱ� 2ź
//		double r;
//		do {
//			System.out.print("�������� ? ");
//			r = sc.nextDouble();
//			System.out.println("���� ���̴� "+r*r*3.14);
//		} while(r!=0);

		//��������
		//1���� n������ �� ���ϱ�
		//n�� ���� �Է¹ޱ�
//		int sum =0;
//		int start = 0;
//		System.out.print("���� �Է��ϼ��� : ");
//		int num = sc.nextInt();
//		while (true) {
//			start ++;
//			if (start > num) break;
//			sum += start;
//		}
//		System.out.println("1���� n������ ���� "+ sum);
		
		//���� ����
		//���� ���� ���� �� ���ϱ�
		int nKg, count5, count3, rest;
		// �̵��ؾ��� kg �� �Է�
		System.out.println("����ؾ��ϴ� ������ ���Դ� ? ");
		nKg = sc.nextInt();
		count5 = nKg /5;
		while (true) {
			rest = nKg - (5*count5);
			if (rest % 3 ==0) {
				count3 = rest /3;
				System.out.printf("�ʿ��� ���� �� : %d(5kg) + %d(3kg)", count5, count3);
				break;
			}
			else {
				if (count5 ==0) {
					System.out.printf("%d\n", -1);
					break;
				}
				count5 -= 1; //5kg ���� �� ���̱�
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
