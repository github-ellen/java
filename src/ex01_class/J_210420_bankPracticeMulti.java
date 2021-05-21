package ex01_class;

import java.util.Scanner;
	
public class J_210420_bankPracticeMulti {

	public static void main(String[] args) {
		//여러 개의 계좌 등록 가능.
		Scanner sc = new Scanner(System.in);
		Bank[] banks = new Bank[3]; //뱅크 객체의 주소를 3개 저장할 수 있다는 의미
		int custno = 0;
		System.out.println("안녕하세요.");
		System.out.println("국제 은행입니다.\n");
		
		while (true) {
			System.out.printf("현재 고객 번호 : %d\n", custno);
			System.out.printf("  < MENU > \n");
			System.out.println("0. 고객 번호 입력"); //1번을 누르면 배열 3개 중에서 0번 인덱스에 접근할 수 있는 권한이 생김.
			System.out.println("1. 계좌 개설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 잔액 조회");
			System.out.println("9. 종료\n");
			System.out.print("어떤 메뉴를 선택하시겠습니까 ? ");
			int num = sc.nextInt();
			System.out.printf("%d번을 선택하셨습니다.\n", num);
			System.out.println("");
			

			switch (num) {
			case 0 :
				System.out.print("고객 번호를 입력하세요 : ");
				custno = sc.nextInt();
				System.out.print("\n");
				break;
				
			case 1 :
				System.out.println("<계좌 개설 화면입니다.>\n");
				System.out.print("통장명을 입력하세요 : ");
				String name = sc.nextLine(); //공백이 있을 수도 있으니까 nextLine으로!
				sc.nextLine();//버퍼 없애기 위한.
				System.out.print("계좌번호를 입력하세요 : ");
				String bankNum = sc.next();
				banks[custno-1] = new Bank(name, bankNum);
				System.out.print("\n");
				break;
			case 2 : //처음부터 2번을 고르면 객체가 생성되지 않은 상태(bank = null)이기 때문에 컴파일 오류.
				if (banks == null) {
					System.out.println("계좌 개설을 먼저 진행해주세요.");
					continue;
				}
				System.out.print("입금할 금액을 입력해주세요 : ");
				int in = sc.nextInt();
				System.out.printf("\n%,d원을 입금하셨습니다.", in);
				System.out.printf(" 잔액은 %,d원입니다.\n", banks[custno -1].getBalance());
				break;
			case 3 :
				if (banks == null) {
					System.out.println("계좌 개설을 먼저 진행해주세요.");
					continue;
				}
				System.out.print("출금할 금액을 입력해주세요 : ");
				int out = sc.nextInt();
				int r = banks[custno -1].out(out);
				if (r == 0) {
					System.out.println("잔액은 " + banks[custno -1].getBalance()+"원입니다.");
				}
				else {
					System.out.println("잔액이 부족합니다. 잔액을 확인해주세요.");
				}
				break;
			case 4 :
				if (banks == null) {
					System.out.println("계좌 개설을 먼저 진행해주세요.\n");
					continue;
				}
				System.out.print("출금 가능한 금액은 " + banks[custno -1].getBalance() + "원입니다.\n");
				break;
			case 9 :
				System.out.println("은행 업무를 종료합니다.");
				System.exit(9);
			default : 
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
			
		}
	}
		
}
