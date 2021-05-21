package ex02_access;

import ex01_class.Bank;

public class J_210421_package {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.getA());
		
		
		//다른 패키지에 있는 클래스를 사용하려면 ?
		//ex01_class.Bank b1 = new ex01_class.Bank("국제통장 ", "11-22-3");
		Bank b1 = new Bank("국제통장 ", "11-22-3"); //import 했기 때문에 가능
		//Bank 클래스 앞에 public이 붙어야함.
		//pubilc : 모든 클래스가 접근 가능
		//private : 자신의 클래스 내부에서만 접근 가능
		//default(접근 제어자가 없음) : 같은 패키지만 접근 가능.
	}

}
