package ex01_class;

import java.util.Arrays;

//�л� Ŭ����

class Student {
	//�ʵ�
	String group = "B";
	String name = "�浿��" ;
	int[] score = new int[3] ;
	int sum;
	
	//�޼ҵ�
	void sumCal(int a, int b, int c) {  //call by value
		sum = 0;
		score[0] = a; score[1] =b; score[2] = c;
		sum = a+b+c;
	}
	void sumCal(int[] score) { // int���� �迭�� �Է¹޾Ƽ� ����ϰڴ�.
						 	// call by reference
		sum = 0;
		this.score = score; //this �� ���̸� �ʵ带 ����Ű�� ��.
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
		
		s1.sumCal(new int[] {79,80,67}); //�迭�� ũ�� ����!
		System.out.println(Arrays.toString(s1.score));
		System.out.println(s1.sum);
		s1.avg(); //�迭�� ũ�� ����!
		System.out.printf("%.2f\n", s1.avg());
		
		s1.sumCal(new int[] {89,90,100}); 
		System.out.println(Arrays.toString(s1.score));
		System.out.println("�հ� : " + s1.sum);
		System.out.println("��� : " + s1.avg());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
