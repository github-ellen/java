package ex01_class;

import java.util.Scanner;
	
public class J_210420_bankPracticeMulti {

	public static void main(String[] args) {
		//���� ���� ���� ��� ����.
		Scanner sc = new Scanner(System.in);
		Bank[] banks = new Bank[3]; //��ũ ��ü�� �ּҸ� 3�� ������ �� �ִٴ� �ǹ�
		int custno = 0;
		System.out.println("�ȳ��ϼ���.");
		System.out.println("���� �����Դϴ�.\n");
		
		while (true) {
			System.out.printf("���� �� ��ȣ : %d\n", custno);
			System.out.printf("  < MENU > \n");
			System.out.println("0. �� ��ȣ �Է�"); //1���� ������ �迭 3�� �߿��� 0�� �ε����� ������ �� �ִ� ������ ����.
			System.out.println("1. ���� ����");
			System.out.println("2. �Ա�");
			System.out.println("3. ���");
			System.out.println("4. �ܾ� ��ȸ");
			System.out.println("9. ����\n");
			System.out.print("� �޴��� �����Ͻðڽ��ϱ� ? ");
			int num = sc.nextInt();
			System.out.printf("%d���� �����ϼ̽��ϴ�.\n", num);
			System.out.println("");
			

			switch (num) {
			case 0 :
				System.out.print("�� ��ȣ�� �Է��ϼ��� : ");
				custno = sc.nextInt();
				System.out.print("\n");
				break;
				
			case 1 :
				System.out.println("<���� ���� ȭ���Դϴ�.>\n");
				System.out.print("������� �Է��ϼ��� : ");
				String name = sc.nextLine(); //������ ���� ���� �����ϱ� nextLine����!
				sc.nextLine();//���� ���ֱ� ����.
				System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
				String bankNum = sc.next();
				banks[custno-1] = new Bank(name, bankNum);
				System.out.print("\n");
				break;
			case 2 : //ó������ 2���� ���� ��ü�� �������� ���� ����(bank = null)�̱� ������ ������ ����.
				if (banks == null) {
					System.out.println("���� ������ ���� �������ּ���.");
					continue;
				}
				System.out.print("�Ա��� �ݾ��� �Է����ּ��� : ");
				int in = sc.nextInt();
				System.out.printf("\n%,d���� �Ա��ϼ̽��ϴ�.", in);
				System.out.printf(" �ܾ��� %,d���Դϴ�.\n", banks[custno -1].getBalance());
				break;
			case 3 :
				if (banks == null) {
					System.out.println("���� ������ ���� �������ּ���.");
					continue;
				}
				System.out.print("����� �ݾ��� �Է����ּ��� : ");
				int out = sc.nextInt();
				int r = banks[custno -1].out(out);
				if (r == 0) {
					System.out.println("�ܾ��� " + banks[custno -1].getBalance()+"���Դϴ�.");
				}
				else {
					System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ�����ּ���.");
				}
				break;
			case 4 :
				if (banks == null) {
					System.out.println("���� ������ ���� �������ּ���.\n");
					continue;
				}
				System.out.print("��� ������ �ݾ��� " + banks[custno -1].getBalance() + "���Դϴ�.\n");
				break;
			case 9 :
				System.out.println("���� ������ �����մϴ�.");
				System.exit(9);
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			
			
		}
	}
		
}
