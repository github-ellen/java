package basic01;

import java.util.Scanner;

public class J_210416_practice {

	public static void main(String[] args) {
//		//�� ������ �����Ͽ� ���α׷������� ���α׷� ������!!
//		Scanner sc = new Scanner(System.in);
//		String[] sub = {"����","����","����"};
//		int[][] score = new int[2][3] ;
//		String[] name = new String[2];
////		//Ÿ��Ʋ
//		System.out.println("******************************");
//		System.out.println("���� ���� ���� ���α׷� V1.0.0");
//		System.out.println("******************************");
//		//�޴�
//		while (true) {
//		System.out.println("1. �л� �̸� ���");
//		System.out.println("2. �л��� ���� ���");
//		System.out.println("3. �л��� �հ�, ��� ���");
//		System.out.println("4. ���� �հ�, ��� ���");
//		System.out.println("0. ����");
//		System.out.println("==============================");
//		//����ڿ��� �޴��� ���� �ϰ� �ʹٸ�
//		System.out.print("� �޴��� �����ұ�� ? ");
//		int num =sc.nextInt();
////		//�Է��� �޴��� �̵��ϱ�
//		System.out.println();
////		if (num == 1) {
////			for (int i = 0 ; i < score.length ; i++) {
////				for(int j = 0; j <score[i].length ; j++) {
////					System.out.print((i+1) + "�� �л��� "+ sub[j] + " ���� : ");
////					score[i][j] = sc.nextInt();
////				}
////				System.out.println();
////		}
////		}
////		else if (num == 2) {
////			for (int i = 0 ; i < score.length ; i++) {
////			int sum=0;
////			for(int j = 0; j <score[i].length ; j++) {
////				sum += score[i][j];
////			}
////			System.out.printf("%d�� �л��� �հ� : %d\n", i+1, sum); 
////			System.out.printf("%d�� �л��� ��� : %.2f\n", i+1, (double)sum/score[i].length); 
////			}
////			System.out.println();
////		}
////		else if (num == 3) {
////			for (int j = 0 ; j < 3 ; j++) {
////				int sum = 0;
////				for (int i = 0; i < 2 ; i++) {
////					sum += score[i][j];
////				}
////				System.out.println("["+sub[j]+"]"+" �հ�� "+ sum);
////				System.out.println("["+sub[j]+"]"+" ����� "+ (double)sum/score.length);
////				System.out.println("---------------------");	
////			}
////		}
////		else if (num == 0) {
////			System.out.println("���α׷��� �����մϴ�.");
////			System.out.println("�����մϴ�."); break;
////		}
////		else
////			System.out.println("�߸� �����̽��ϴ�.\n");
////		}
//
//		//if�� -> switch��
//			switch (num) {
//			case 1 :
//				for (int i = 0 ; i < score.length ; i++) {
//					System.out.print("�л��� �̸� : ");
//					name[i] = sc.next();
//				} 
//				System.out.println();
//				break;
//			case 2 :
//				for (int i = 0 ; i < score.length ; i++) {
//					for(int j = 0; j <score[i].length ; j++) {
//						System.out.print(name[i] + " �л��� "+ sub[j] + " ���� : ");
//						score[i][j] = sc.nextInt();
//					}
//					System.out.println();
//				} break;
//			case 3 : 
//				for (int i = 0 ; i < score.length ; i++) {
//					int sum=0;
//					for(int j = 0; j <score[i].length ; j++) {
//						sum += score[i][j];
//					}
//					System.out.printf(name[i] + " �л��� �հ� : %d\n", i+1, sum); 
//					System.out.printf(name[i] + " �л��� ��� : %.2f\n", i+1, (double)sum/score[i].length); 
//				}
//				System.out.println();
//				break;
//			case 4 : 
//				for (int j = 0 ; j < 3 ; j++) {
//					int sum = 0;
//					for (int i = 0; i < 2 ; i++) {
//						sum += score[i][j];
//					}
//					System.out.println("["+sub[j]+"]"+" �հ�� "+ sum);
//					System.out.println("["+sub[j]+"]"+" ����� "+ (double)sum/score.length);
//					System.out.println("---------------------");	
//				} break;
//			case 0 : 
//				System.out.println("���α׷��� �����մϴ�.");
//				System.out.println("�����մϴ�.");
//				System.exit(0); //0�̶�� �ִ� ���� ���� ����
//			default :
//				System.out.println("�߸� �����̽��ϴ�.\n");
//			}
//		}

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(a + "*" + i + "= a*i");
		}

	}

}
