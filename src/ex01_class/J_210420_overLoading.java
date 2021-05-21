package ex01_class;

import java.util.Arrays;

//합계를 구하는 메소드 만들기
class Sum {
	//오버로딩 기법
	
	//두 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b) {
		return a+b;
	}
	
	//세 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b, int c) {
		return a+b+c;
	}
	//매개변수를 하나의 배열로 받아서 합을 리턴하는 메소드(second)
	int add(int[] arr) {
		int sum = 0;
		for (int i = 0 ; i <arr.length-1 ; i++) {
			sum += arr[i];
		}
		arr[arr.length-1] = sum;
		return sum;
	}
	
	int addVarargs(int ...arr) { //매개변수를 배열로 만들어서 다음 문장을 실행하겠다. (가변인자)
		int sum = 0;
		for (int i = 0 ; i <arr.length ; i++) {
			sum += arr[i];
		}
		return sum;
	}
	//문자열을 가변인자로 받아서 출력하기
	void word(String...arr) { //반환값이 없기 때문에 메인 함수 내에서 사용 불가.
		for(String i : arr) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}

public class J_210420_overLoading {

	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.add(50, 90));
		System.out.println(s.add(10, 50, 90));
		
		int[] arr = {10 ,50, 90, 50, 0}; //배열을 생성 후에 메소드 만들기(first)
		System.out.println("배열의 합은 " + s.add(arr));
		System.out.println(Arrays.toString(arr));
		
		System.out.println("배열의 합은 " + s.addVarargs(10,20,30,40, 50)+"\n");
	
		s.word("길동", "2반", "B");
	}

}
