package basic01;

import java.util.Scanner;

public class J_210414_while {

	public static void main(String[] args) {
		// 반복문
		//원의 넓이 구하기 - 0 입력 시, 종료
		Scanner sc = new Scanner(System.in);
//		double r ;		
//		while (true) {
//			System.out.print("반지름은 ? ");
//			r = sc.nextDouble();
//			if (r==0) {
//				System.out.println("종료합니다."); break;
//			}
//			System.out.println("원의 넓이는 "+r*r*3.14);
//		}
		
		//원의 넓이 구하기 2탄
//		double r;
//		do {
//			System.out.print("반지름은 ? ");
//			r = sc.nextDouble();
//			System.out.println("원의 넓이는 "+r*r*3.14);
//		} while(r!=0);

		//연습문제
		//1부터 n까지의 수 더하기
		//n의 값은 입력받기
//		int sum =0;
//		int start = 0;
//		System.out.print("수를 입력하세요 : ");
//		int num = sc.nextInt();
//		while (true) {
//			start ++;
//			if (start > num) break;
//			sum += start;
//		}
//		System.out.println("1부터 n까지의 합은 "+ sum);
		
		//백준 문제
		//가장 적은 봉지 수 구하기
		int nKg, count5, count3, rest;
		// 이동해야할 kg 수 입력
		System.out.println("배달해야하는 설탕의 무게는 ? ");
		nKg = sc.nextInt();
		count5 = nKg /5;
		while (true) {
			rest = nKg - (5*count5);
			if (rest % 3 ==0) {
				count3 = rest /3;
				System.out.printf("필요한 봉지 수 : %d(5kg) + %d(3kg)", count5, count3);
				break;
			}
			else {
				if (count5 ==0) {
					System.out.printf("%d\n", -1);
					break;
				}
				count5 -= 1; //5kg 봉지 수 줄이기
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
