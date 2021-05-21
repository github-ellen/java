package ex01_class;

import java.util.Scanner;


public class J_210420_bankPractice {

	public static void main(String[] args) {
		//하나의 계좌만 등록 가능.
		Scanner sc = new Scanner(System.in);
		Bank bank = null ;
		System.out.println("안녕하세요.");
		System.out.println("국제 은행입니다.");
		
		while (true) {
			System.out.printf("\n  < MENU > \n");
			System.out.println("1. 계좌 개설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 잔액 조회");
			System.out.println("0. 종료\n");
			System.out.print("어떤 메뉴를 선택하시겠습니까 ? ");
			int num = sc.nextInt();
			System.out.printf("%d번을 선택하셨습니다.\n", num);
			System.out.println("");
			

			switch (num) {
			case 1 :
				System.out.println("<계좌 개설 화면입니다.>\n");
				System.out.print("통장명을 입력하세요 : ");
				String name = sc.nextLine(); //공백이 있을 수도 있으니까 nextLine으로!
				sc.nextLine();//버퍼 없애기 위한.
				System.out.print("계좌번호를 입력하세요 : ");
				String bankNum = sc.next();
				bank = new Bank(name, bankNum);
				break;
			case 2 : //처음부터 2번을 고르면 객체가 생성되지 않은 상태(bank = null)이기 때문에 컴파일 오류.
				if (bank == null) {
					System.out.println("계좌 개설을 먼저 진행해주세요.");
					continue;
				}
				System.out.print("입금할 금액을 입력해주세요 : ");
				int in = sc.nextInt();
				System.out.printf("\n%,d원을 입금하셨습니다.", in);
				bank.in(in);
				System.out.printf(" 잔액은 %,d원입니다.\n", bank.getBalance());
				break;
			case 3 :
				if (bank == null) {
					System.out.println("계좌 개설을 먼저 진행해주세요.");
					continue;
				}
				System.out.print("출금할 금액을 입력해주세요 : ");
				int out = sc.nextInt();
				int r = bank.out(out);
				if (r == 0) {
					System.out.println("잔액은 " + bank.getBalance()+"원입니다.");
				}
				else {
					System.out.println("잔액이 부족합니다. 잔액을 확인해주세요.");
				}
				break;
			case 4 :
				if (bank == null) {
					System.out.println("계좌 개설을 먼저 진행해주세요.\n");
					continue;
				}
				System.out.println("출금 가능한 금액은 " + bank.getBalance() + "원입니다.");
				break;
			case 0 :
				System.out.println("은행 업무를 종료합니다.");
				System.exit(0);
			default : 
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
			
		}
	}
		
}
