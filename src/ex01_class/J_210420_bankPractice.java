package ex01_class;

import java.util.Scanner;


public class J_210420_bankPractice {

	public static void main(String[] args) {
		//�ϳ��� ���¸� ��� ����.
		Scanner sc = new Scanner(System.in);
		Bank bank = null ;
		System.out.println("�ȳ��ϼ���.");
		System.out.println("���� �����Դϴ�.");
		
		while (true) {
			System.out.printf("\n  < MENU > \n");
			System.out.println("1. ���� ����");
			System.out.println("2. �Ա�");
			System.out.println("3. ���");
			System.out.println("4. �ܾ� ��ȸ");
			System.out.println("0. ����\n");
			System.out.print("� �޴��� �����Ͻðڽ��ϱ� ? ");
			int num = sc.nextInt();
			System.out.printf("%d���� �����ϼ̽��ϴ�.\n", num);
			System.out.println("");
			

			switch (num) {
			case 1 :
				System.out.println("<���� ���� ȭ���Դϴ�.>\n");
				System.out.print("������� �Է��ϼ��� : ");
				String name = sc.nextLine(); //������ ���� ���� �����ϱ� nextLine����!
				sc.nextLine();//���� ���ֱ� ����.
				System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
				String bankNum = sc.next();
				bank = new Bank(name, bankNum);
				break;
			case 2 : //ó������ 2���� ���� ��ü�� �������� ���� ����(bank = null)�̱� ������ ������ ����.
				if (bank == null) {
					System.out.println("���� ������ ���� �������ּ���.");
					continue;
				}
				System.out.print("�Ա��� �ݾ��� �Է����ּ��� : ");
				int in = sc.nextInt();
				System.out.printf("\n%,d���� �Ա��ϼ̽��ϴ�.", in);
				bank.in(in);
				System.out.printf(" �ܾ��� %,d���Դϴ�.\n", bank.getBalance());
				break;
			case 3 :
				if (bank == null) {
					System.out.println("���� ������ ���� �������ּ���.");
					continue;
				}
				System.out.print("����� �ݾ��� �Է����ּ��� : ");
				int out = sc.nextInt();
				int r = bank.out(out);
				if (r == 0) {
					System.out.println("�ܾ��� " + bank.getBalance()+"���Դϴ�.");
				}
				else {
					System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ�����ּ���.");
				}
				break;
			case 4 :
				if (bank == null) {
					System.out.println("���� ������ ���� �������ּ���.\n");
					continue;
				}
				System.out.println("��� ������ �ݾ��� " + bank.getBalance() + "���Դϴ�.");
				break;
			case 0 :
				System.out.println("���� ������ �����մϴ�.");
				System.exit(0);
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			
			
		}
	}
		
}
