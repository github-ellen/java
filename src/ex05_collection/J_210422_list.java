package ex05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J_210422_list {

	public static void main(String[] args) {
		//list 프레임워크
		//List<E> / ArrayList,
		//특징 : 저장 순서가 있다(=인덱스가 있다), 데이터 중복 가능
		//1) ArrayList : 배열 구조
		//특징 : 검색이 빠르다. 추가, 삭제가 어렵다.
		
//		ArrayList arrlist = new ArrayList();
//		arrlist.add(10);
////		System.out.println(arrlist);
//		arrlist.add("자바");
//		System.out.println("object 형일 때 : "+ arrlist);		
////		arrlist.add("#$");
////		System.out.println(arrlist);
//		
//		ArrayList<Integer> arrlist1 = new ArrayList<>(); //정수만 받겠다!!!
//		arrlist1.add(10);
//		System.out.println("int형일 때 : " + arrlist1);
////		arrlist.add("자바"); 오류남!
//		
//		ArrayList<Boolean> arrlist2 = new ArrayList<>();
//		arrlist2.add(true);
////		arrlist2.add(apple); //오류남!
//		System.out.println("boolean 형일 때 : " + arrlist2);
		
		//반복문을 활용한다면 ?
//		ArrayList<Integer> arrlist = new ArrayList<>(); 
//		arrlist.add(10);
//		arrlist.add(20);
//		arrlist.add(30);
//		for (int i =0 ; i < arrlist.size() ; i++) {
//			System.out.println(arrlist.get(i)+100);
//		}
//		System.out.println("--------------------");
//		//for ~each 문은 ?
//		for (int a : arrlist) {
//			System.out.println(a+100);
//		}
//		
		//for문으로 초기화하기
//		arrlist.add(10);
//		arrlist.add(20);
//		arrlist.add(30);
//		System.out.println(arrlist.size());
//		for ( int i =0 ; i < 3 ; i++) { // i < arrlist.size() 불가 / 사이즈가 정해지지 않은 상태이기 때문에
//			arrlist.add(10*(i+1)) ;
//			System.out.println(arrlist.get(i));
//		}
//		
//		arrlist.remove(1);
//		System.out.println(arrlist);
//		
//		arrlist.add(1, 20); //1번 인덱스에 20을 넣겠다.
//		System.out.println(arrlist);
		
		//연습문제
		//사용자에게 입력받은 내용을 배열 만들기
		//몇 개를 입력받을지 몰라!!!!!!!!!!!
		Scanner sc = new Scanner(System.in); //Scanner() : 어디서부터 내용을 받아올 것인가.
											//System.in : 키보드로부터 내용을 받아올 것이다.
//		ArrayList<String> arrS = new ArrayList<>();
//		while (true) {
//			System.out.print("단어 입력 : ");
//			String s = sc.next();
//			arrS.add(s);
//			if (arrS.contains("종료")) {
//				arrS.remove("종료");
//				break;
//			}
//		}
//		System.out.println(arrS);
		
//		while (true) {
//			System.out.print("단어 입력 : ");
//			String s = sc.next();
//			if (s.equals("종료")) {
//				break;
//			}
//			arrS.add(s);
//		}
//		System.out.println("입력하신 내용들은 " + arrS + "입니다.");
////		arrS.set(1, "버블티"); //1번 인덱스의 내용을 "버블티"로 바꿔라.
////		System.out.println("수정하신 내용들은 " + arrS + "입니다.");
////		arrS.add("피자");
//		System.out.println("수정하신 내용들은 " + arrS + "입니다.");
//		for (int i = 0 ; i < arrS.size(); i++) {
//			System.out.println((i+1) +":"+ arrS.get(i));
//		}
		
		//중복 단어 삭제
		//방법 1안
//		arrS.add("홍"); arrS.add("폴"); arrS.add("안"); arrS.add("폴");
//		for(int i = 0 ; i < arrS.size() ; i ++) {
//			if (arrS.get(i).equals("폴"))
//				arrS.remove(i);
//		}
//		System.out.println(arrS);
		
//		//방법 2안(추천) : 인덱스가 없어도 됨
//		arrS.add("홍"); arrS.add("폴"); arrS.add("안"); arrS.add("폴");
//		System.out.println(arrS);
//		System.out.print("삭제할 이름은 ? ");
//		String name = sc.next();
//		//반복자 생성 = 객체 생성
//		Iterator<String> it = arrS.iterator() ;
//		while (it.hasNext()) { //다음 데이터가 있다면
//			String n = it.next();
//			if (name.equals(n)){
//				it.remove(); //내가 가리키는 곳의 데이터를 제거하세요.
//			}
//		}
//		System.out.println(arrS);
		
//		//연습문제
//		//선언과 동시에 초기화하는 방법
//		List<String> list = Arrays.asList("RED", "YELLOW", "BLUE");
//		Iterator<String> it = list.iterator() ;
//		System.out.println(it);
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		//연습문제
//		//학생들의 키를 입력받아 키의 평균값을 구하라
//		ArrayList<Double> studentList = new ArrayList<>();
//		List<String> stuName = Arrays.asList("홍길동","유재석","강호동");
//		double sum = 0 ;
//		for (int i = 0 ; i <stuName.size() ; i++) {
//			System.out.print(stuName.get(i)+" 학생의 키 : ");
//			double studentH = sc.nextDouble();
//			studentList.add(studentH);
//		}
//		for (int i = 0 ; i < studentList.size(); i++) {
//			sum += studentList.get(i);
//		}
//		System.out.println("------------------");
//		System.out.println("학생들 키의 합은 : " + sum);
//		double avg = sum / studentList.size();
//		System.out.println("학생들 키의 평균은 : " + (int)avg);
		
		//2) LinkedList : 리스트 기반 : 각 요소가 자신의 이전 요소의 주소와 다음 요소의 주소를 가지고 있다.
		//특징 : 검추가, 삭제가 쉽다. 검색 시 성능 저하.
//		LinkedList<String> llist = new LinkedList<>();
		List<String> llist = new LinkedList<>(); //이 표현이 더 일반적
		llist.add("java");
		llist.add("c++");
		System.out.println(llist);
		for (int i =0 ; i < llist.size() ; i++) {
			System.out.println(llist.get(i));
		}
		
		
		
		
		
		
		
		
		
	}

}
