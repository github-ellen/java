package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J_210423_Exception {

	public static void main(String[] args) {
		//예외 처리 (try ~ catch)
//		int a = 10, b= 0;
//		System.out.println(a/b); //프로그램이 끝나버림. 이러한 경우를 처리하는 것이 예외 처리
		
		Scanner sc = new Scanner(System.in);
		int a=10, b = 0;
//		System.out.print("나눌 수는 ? : ");
//		try {
//			b = sc.nextInt(); //예외가 발생할 수 있는 문장이기 때문에 try로 감싸주기
//								//여기서 예외가 발생했을 경우에 catch 실행.
//			System.out.println(a/b); //b가 0으로 초기화된 상태이기 때문에.
//		} catch (InputMismatchException e) { //문자로 잘못 입력했을 때
//			System.out.println("숫자를 입력해주세요.");
//		} catch (ArithmeticException e) { //'0'을 입력했을 때
//			System.out.println("0으로 나눌 수 없습니다.");
//		} catch(Exception e) { //매개변수로 'Exception e'타입을 받겠다.
//						     	//문자를 넣었을 때의 경우, 0을 넣을 때의 경우 나누기
//								//문자, '0'을 제외한 모든 예외를 처리.
//								//'Exception e'은 가장 마지막에 !
//								//catch문의 첫 줄에 작성하면 오류 생김.
//			System.out.println("숫자를 입력해주세요.");
//		}
//		System.out.println("프로그램 정상 종료");
		
		//반복문을 추가한다면,
		while (true) {
			System.out.print("나눌 수는 ? : ");
			try {
				b = sc.nextInt(); //예외가 발생할 수 있는 문장이기 때문에 try로 감싸주기
									//여기서 예외가 발생했을 경우에 catch 실행.
				System.out.println(a/b); //b가 0으로 초기화된 상태이기 때문에.
				break;
			} catch (InputMismatchException e) { //문자로 잘못 입력했을 때
				System.out.println("숫자를 입력해주세요.");
				sc.nextLine(); //b = sc.nextInt();에서 발생한 오류. 만약 a하고 엔터를 눌렀을 때
								//b에 입력되지 않은 상태이기 때문에
				 	            //System.out.print("나눌 수는 ? : "); 무한 반복
				e.printStackTrace(); //예외가 발생된 지점을 추적하여 프린트해줌.
			} catch (ArithmeticException e) { //'0'을 입력했을 때
				System.out.println("0으로 나눌 수 없습니다.");
				//여기에 sc.nextLine();가 들어가지 않은 이유는
				//b에 0이 들어간 상태이고 System.out.println(a/b);에서 오류가 났기 때문에.
				e.printStackTrace();
			} catch(Exception e) { //매개변수로 'Exception e'타입을 받겠다.
							     	//문자를 넣었을 때의 경우, 0을 넣을 때의 경우 나누기
									//문자, '0'을 제외한 모든 예외를 처리.
									//'Exception e'은 가장 마지막에 !
									//catch문의 첫 줄에 작성하면 오류 생김.
				System.out.println("숫자를 입력해주세요.");
			}
		}
		System.out.println("프로그램 정상 종료");
		
		//연습문제
//		int[] arr = {10,20,30};
//		//사용자가 1을 입력하면 10을, 2를 입력하면 20을,... 출력하기
//		int user ;
//		try {
//			System.out.print("번호 입력 : "); //순서 생각하기!
//												//입력받고 그 값이 user에 들어가고 들어간 값에 따라 출력이 되는 것.
//			user = sc.nextInt();
//			System.out.println(arr[user-1]);
//		}
//		catch (InputMismatchException e) {
//			System.out.println("정수를 입력하세요.");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("1,2,3 중에 고르세요.");
//		}
//		catch (Exception e) {
//			e.printStackTrace(); //이거 먼저 보고 어떤 예외가 뜨는지 확인하기.
//								//이것을 실행했을 때 뜨는 'InputMismatchException'을 예외 처리
//		}
		
		//예외의 종류 : 1)체크 예외(반드시 예외해야한다) 2)언체크 예외(반드시 안 해도 됨)
		//체크 예외 : RuntimeException을 상속하지 않은 예외 - 네트워크나 DB, 파일 등 외부와 연결되는 것들
		//언체크 예외 : RuntimeException을 상속한 예외
		//파일을 스캐너로 읽어보기
		//파일을 읽어들일 예정이기 때문에 파일 만들기
//		File file = new File("sample.txt");
//
//
//		System.out.println(file); //어떤 파일을 읽어들이겠다.
//		try {
//			Scanner sc = new Scanner(file); //sc가 파일을 읽어들일꺼야.		
//			System.out.println("파일 읽기 성공");
//			//파일에 있는 내용을 하나씩 읽어들이기.
//			//inputstream 형태 생각하기
//			while(sc.hasNextLine()) { //한 줄씩 읽을꺼니까 nextLine.
//				String s = sc.nextLine();
//				System.out.println(s);
//			}
//		} catch (FileNotFoundException e) { //체크 예외
//			System.out.println("파일을 찾을 수 없습니다.");
//			e.printStackTrace();
//		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
