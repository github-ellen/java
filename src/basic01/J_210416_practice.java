package basic01;

import java.util.Scanner;

public class J_210416_practice {

	public static void main(String[] args) {
//		//위 내용을 참조하여 프로그램스러운 프로그램 만들어보기!!
//		Scanner sc = new Scanner(System.in);
//		String[] sub = {"국어","영어","수학"};
//		int[][] score = new int[2][3] ;
//		String[] name = new String[2];
////		//타이틀
//		System.out.println("******************************");
//		System.out.println("국제 성적 관리 프로그램 V1.0.0");
//		System.out.println("******************************");
//		//메뉴
//		while (true) {
//		System.out.println("1. 학생 이름 등록");
//		System.out.println("2. 학생별 성적 등록");
//		System.out.println("3. 학생별 합계, 평균 출력");
//		System.out.println("4. 과목별 합계, 평균 출력");
//		System.out.println("0. 종료");
//		System.out.println("==============================");
//		//사용자에게 메뉴를 고르게 하고 싶다면
//		System.out.print("어떤 메뉴를 실행할까요 ? ");
//		int num =sc.nextInt();
////		//입력한 메뉴로 이동하기
//		System.out.println();
////		if (num == 1) {
////			for (int i = 0 ; i < score.length ; i++) {
////				for(int j = 0; j <score[i].length ; j++) {
////					System.out.print((i+1) + "번 학생의 "+ sub[j] + " 점수 : ");
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
////			System.out.printf("%d번 학생의 합계 : %d\n", i+1, sum); 
////			System.out.printf("%d번 학생의 평균 : %.2f\n", i+1, (double)sum/score[i].length); 
////			}
////			System.out.println();
////		}
////		else if (num == 3) {
////			for (int j = 0 ; j < 3 ; j++) {
////				int sum = 0;
////				for (int i = 0; i < 2 ; i++) {
////					sum += score[i][j];
////				}
////				System.out.println("["+sub[j]+"]"+" 합계는 "+ sum);
////				System.out.println("["+sub[j]+"]"+" 평균은 "+ (double)sum/score.length);
////				System.out.println("---------------------");	
////			}
////		}
////		else if (num == 0) {
////			System.out.println("프로그램을 종료합니다.");
////			System.out.println("감사합니다."); break;
////		}
////		else
////			System.out.println("잘못 누르셨습니다.\n");
////		}
//
//		//if문 -> switch문
//			switch (num) {
//			case 1 :
//				for (int i = 0 ; i < score.length ; i++) {
//					System.out.print("학생의 이름 : ");
//					name[i] = sc.next();
//				} 
//				System.out.println();
//				break;
//			case 2 :
//				for (int i = 0 ; i < score.length ; i++) {
//					for(int j = 0; j <score[i].length ; j++) {
//						System.out.print(name[i] + " 학생의 "+ sub[j] + " 점수 : ");
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
//					System.out.printf(name[i] + " 학생의 합계 : %d\n", i+1, sum); 
//					System.out.printf(name[i] + " 학생의 평균 : %.2f\n", i+1, (double)sum/score[i].length); 
//				}
//				System.out.println();
//				break;
//			case 4 : 
//				for (int j = 0 ; j < 3 ; j++) {
//					int sum = 0;
//					for (int i = 0; i < 2 ; i++) {
//						sum += score[i][j];
//					}
//					System.out.println("["+sub[j]+"]"+" 합계는 "+ sum);
//					System.out.println("["+sub[j]+"]"+" 평균은 "+ (double)sum/score.length);
//					System.out.println("---------------------");	
//				} break;
//			case 0 : 
//				System.out.println("프로그램을 종료합니다.");
//				System.out.println("감사합니다.");
//				System.exit(0); //0이라고 넣는 것은 정상 종료
//			default :
//				System.out.println("잘못 누르셨습니다.\n");
//			}
//		}

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(a + "*" + i + "= a*i");
		}

	}

}
