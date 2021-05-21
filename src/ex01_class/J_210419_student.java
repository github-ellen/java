package ex01_class;

import java.util.Arrays;

//학생 클래스

class Student {
	//필드
	String group = "B";
	String name = "길동이" ;
	int[] score = new int[3] ;
	int sum;
	
	//메소드
	void sumCal(int a, int b, int c) {  //call by value
		sum = 0;
		score[0] = a; score[1] =b; score[2] = c;
		sum = a+b+c;
	}
	void sumCal(int[] score) { // int형의 배열로 입력받아서 출력하겠다.
						 	// call by reference
		sum = 0;
		this.score = score; //this 를 붙이면 필드를 가리키는 것.
		for(int i = 0 ; i <score.length ; i++) { 
			sum += score[i];
		}
	}
	double avg() {
		double avg = (double)sum/score.length;
		return avg;
	}
}


public class J_210419_student {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.sumCal(new int[] {79,80,67}); //배열의 크기 생략!
		System.out.println(Arrays.toString(s1.score));
		System.out.println(s1.sum);
		s1.avg(); //배열의 크기 생략!
		System.out.printf("%.2f\n", s1.avg());
		
		s1.sumCal(new int[] {89,90,100}); 
		System.out.println(Arrays.toString(s1.score));
		System.out.println("합계 : " + s1.sum);
		System.out.println("평균 : " + s1.avg());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
