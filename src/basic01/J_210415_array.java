package basic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J_210415_array {

	public static void main(String[] args) {
		// 배열
//		int[] arr ; //배열의 값을 저장할 수 있는 배열을 생성한 것.
//					//선언은 Stack에 저장됨.
//		//new int[5]; //연속적인 공간의 할당이기 때문에 사이즈가 기입되어야함.
//		arr = new int[5]; //new int[5];를 적은 후 그 주소를 저장할 공간 만들기.
//							//객체를 생성해서 주소를 arr에 대입하겠다.
//		arr[0] = 10;
//		System.out.println(arr[0]);
		
//		int[] arr = new int[5];
//		for (int i = 0 ; i <5 ; i++) {
//			System.out.println(arr[i]); //heap에 만들어지기 때문에 자동 초기화
//		}
		
//		int[] arr = new int[5];
//		//1~5 값 대입하려면 ?
//		for (int i = 0 ; i <5 ; i++) {
//			System.out.println(arr[i]+(i+1));
//		}
		
		//또는
//		int[] arr = new int[5];
//		//1~5 값 대입하려면 ?
//		for (int i = 0 ; i <5 ; i++) {
//			arr[i] = i+1 ;
//			/*위의 식이 이해가 안 간다면 하나하나 풀어서 생각하기
//			* arr[0] = 1;
//			* arr[1] = 2;
//			* arr[2] = 3;
//			* arr[3] = 4;
//			* arr[4] = 5; */
//			System.out.println(arr[i]);
//		}
		
//		//10의 배수가 찍히게 하려면 ?
////		arr[0] = 10;
////		arr[1] = 20;
////		arr[2] = 30;
//		for (int i = 0 ; i <5 ; i++) {
//			arr[i] = (i+1)*10;
//			System.out.println(arr[i]);
//		}
		
		//하드코딩 안 하려면 ?
//		int[] arr = new int[5];
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		//선언과 초기화
		//int[] arr = new int[3]; //3개의 공간을 힙영역에 만들꺼얌.
		//int[] arr = new int[] {10, 20, 30}; //선언과 동시에 초기화한 것.
											//반드시 사이즈 생략해야함 !
		//또는
//		int[] arr = {10,20,30};
////		for (int i = 0 ; i < arr.length ; i++) {
////			//length = 필드 : 배열의 속성(길이)을 의미
////			System.out.println(arr[i]);
////		}
//		//for (int i = 0 ; i < arr.length ; i++) 문장이 너무 길어!!! 줄일테야!!!
//		//for ~ each 문 사용
//		for(int a : arr) { //arr이라는 배열 안에 값을 각각 대입하겠다는 의미.
//							//값이 int 이기 때문에 int a가 되는 것. 
//			System.out.println(a);
//		}
//		
//		//매번 배열을 만들어서 어떤 값이 들어있는지 확인하는 게 너무 귀찮을 때는
//		//Arrays(클래스) 사용
//		//매소드 이름은 같은데 매개변수의 형이 다른 것은 '오버로딩(toString)'이라 한다.
//		Arrays.toString(arr); //arr이라는 매개변수를 넘기면 String 값 반환.
//		System.out.println(Arrays.toString(arr)); //문자열로 출력하는 클래스.
//													//값 확인용으로만 사용.
//		System.out.println(arr);  //println 메소드는 toString() 실행
//		System.out.println(arr.toString());
		
		//연습문제
		//점수 평균 구하기
//		int[] score = {88, 89, 77};
//		int sum = 0;
//		//for (int i = 0 ; i <3 ; i++)
//		for (int a : score ) {
//			sum += a;
//		}
//		double avg = (double)sum/3 ;
//		System.out.println("평균 : " + avg);
//		System.out.println("평균 : " + (int)avg); //정수값으로 반환
//		System.out.println("평균 : " + Math.round(avg*100)/100.0); //둘째짜리 반올림하여 출력.
//		System.out.printf("평균 : %.2f", avg);
		
		//학생의 점수를 입력받아 평균 구하기
//		int[] stu = new int[3];
//		int sum =0;
//		Scanner sc = new Scanner(System.in);
////				stu[0] = 80
////				stu[1] = 88
////				stu[2] = 72		
//		for (int i = 0 ; i <stu.length ; i++) {
//			System.out.print("3명 학생의 점수 : "); //3개의 저장공간을 만들어야함!
//			stu[i] = sc.nextInt();
//			sum += stu[i]; 
//		}
//		double avg = (double)sum/3 ;
//		System.out.printf("평균 : %.2f", avg);
		
		//문자열
//		String[] arr = new String[3]; //3개의 문자열을 저장할 공간을 만들어라.
//		for (String a : arr) {
//			System.out.println(a);
//		}
		
//		String[] arr = new String[] {"java", "python", "c"};
//		System.out.println(arr);
//		for (String a : arr) {
//			System.out.println(a);
//		}
		
//		//연습문제
//		//좋아하는 컬러 3개를 입력받아 배열에 저장, 출력
//		String[] color = new String[3];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0 ; i < color.length ; i++) {
//			System.out.println("컬러를 입력하세요 : ");
//			//color[0] = 첫번째 입력 값
//			//color[1] = 두번째 입력 값
//			//color[2] = 세번째 입력 값
//			color[i] = sc.next(); //값을 우선 저장한 후에
//		}
//		for (String a : color) { //반복문으로 출력하기
//			System.out.print(a + " ");
//		}
		
		//연습문제
		//피보나치 수열 20개 구하기
//		//1. 저장 공간 만들기.
//		int[] fibo = new int[20];
//		fibo[0] = 0;
//		fibo[1] = 1;
//		//2. 반복문
//		for (int i = 2 ; i<20 ; i++) { //입력하는 출력문과 반복하는 출력물을 다르게!
//			fibo[i] = fibo[i-2]+fibo[i-1];
//		}
//		for (int i = 0; i <21 ; i++) {
//			System.out.println(fibo[i]);
//		}
		
//		//연습문제
//		//시험 채점 프로그램
//		//정답 배열과 제출 배열 비교
//		int[] right = {1,3,5,1,2,5}; //정답 배열
//		int[] ans = {1,3,2,5,2,2}; //제출 배열
//		int count = 0;
//		//right[0] == ans [0]
//		//right[1] == ans [1]
//		for (int i = 0 ; i < right.length ; i++) {
//			if (right[i] == ans[i]) {
//				System.out.println((i+1)+"번 : 정답");
//				count += 1;
//			}
//			else
//				System.out.println((i+1)+"번 : 오답");
//		}
//		int score = count * (100 / right.length);
//		System.out.println(count + "개 맞췄습니다.");
//		System.out.println("점수는 " + score+"점");
		
		//연습문제
		//최대값/최솟값 출력
//		int[] arr = {4,6,7,2,5};

//		//arr[1] arr[2]
//		//arr[1] arr[4]
//		//arr[2] arr[4]
//		//arr[3] arr[4]
//		Arrays.sort(arr);
//		for (int i = 0 ; i <5 ; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("\n"+"최댓값 : " + arr[4]);
//		System.out.println("최솟값 : " + arr[0]);
		
//		int max = arr[0];
//		for (int i = 1; i<arr.length; i++) {
////			//arr[0] arr[1]
////			//      ~
////			//arr[0] arr[4]
//			if (arr[i] > max )
//				max = arr[i];
//		}
//		System.out.println(max);

		//정렬해서 첫번째 인덱스, 마지막 인덱스 출력
		//2,6,7,4,5 -> 2,4,7,6,5 -> ...
		//인덱스 순으로 앞의 수와 큰지 작은지 비교
		
		//배열의 복사
		//배열 복사의 종류 : 얕은 복사, 깊은 복사
//		//얕은 복사 : 주소만 복사
//		int[] src = {1,2,3,4};
//		int[] dest = src;
//		
//		System.out.println(src);
//		System.out.println(Arrays.toString(src));
//		System.out.println(dest);
//		System.out.println(Arrays.toString(dest));
//		System.out.println("----------------------");
//		
//		src[1] = 20;
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
//		System.out.println("----------------------");
//		
//		dest[3] = 40;
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
		
		//깊은 복사 : 값을 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[5];
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
//		for (int i = 0 ; i < src.length ; i++) {
//			dest[i] = src[i];		
//		}
//		System.out.println("dest : " + Arrays.toString(dest));
		
		//값을 추가하려면 ?
		//공간을 다시 만들어야함.
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
//		for (int i = 0 ; i < src.length ; i++) {
//			dest[i] = src[i];		
//		}
//		dest[5] = 6;
//		System.out.println("dest : " + Arrays.toString(dest));
//		//src에 추가된 값을 넣을려면 ?
//		src = dest ;
//		System.out.println("src : " + Arrays.toString(src));
		
//		//프레임워크를 이용한 데이터 추가
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
		
//		//배열의 깊은 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = {0,0,0,0,0};
//		System.arraycopy(src, 2, dest, 0, 2);
//		System.out.println("src : " + Arrays.toString(src));
//		System.out.println("dest : " + Arrays.toString(dest));
		
		//연습문제
		//선택 정렬
		//{2,4,5,6,7}
		//{7,6,5,4,2}
//		int[] sortArr = {4,6,7,2,5};
//		
//		for (int j = 0 ; j<sortArr.length ; j++) {
//			int min = sortArr[j]; //0번 인덱스가 가장 작다고 생각하고 시작하기.
//			int minIndex=j; //가장 작은 값의 인덱스
//			for (int i = j+1 ; i < sortArr.length ; i++) {
//				if (sortArr[i] < min) {
//					min = sortArr[i];
//					minIndex = i ;
//				}
//			}
//			System.out.println(min);
//			System.out.println(minIndex);
//			//값을 구했으니 정렬해야하므로 두 수의 순서 바꾸기
//			sortArr[minIndex] = sortArr[j];
//			sortArr[j] = min;
//			System.out.println(Arrays.toString(sortArr));
//			//위 식들을 반복해야하므로 전체 식 위에 반복문 삽입
//		}
		
		//로또 번호 맞춘 갯수 출력
		// 방법 1) Math.random() * 100 +1;
		// 방법 2) Random() ;
		
		//int 범위 확인하기.
		System.out.println("MAX 값 :" + Integer.MAX_VALUE);
		System.out.println("MIN 값 :" + Integer.MIN_VALUE);
		
		int[] rT = new int[6]; //6개의 숫자를 뽑을꺼니까 6개의 저장공간 만들기.
		Random rd = new Random();
		
		
		for (int i = 0 ; i < rT.length ; i ++) {
			boolean b = false; //기존에 존재하지 않는다는 가정 하에 시작.
			int num =rd.nextInt(45)+1 ; //0을 빼기 위하여 +1
			for (int j = 0 ; j<i ; j++) {
				if (rT[j] == num) {
					i--; //continue하면 1번 인덱스를 건너뛰고 2번 인덱스에 채워지게 되니까.
					b = true ; //존재한다.
					break;
				}
			}
			if (b) continue;
			
			rT[i] = num;
		}	
		Arrays.sort(rT); //오름차순 정렬
		System.out.println(Arrays.toString(rT));
		//이렇게만 한다면 중복되는 숫자들이 발생
		//따라서 기존에 숫자가 등록되어있다면 break.
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
