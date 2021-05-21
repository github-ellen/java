package ex01_class;
//결과값이 저장되는 계산기
class NewCar {
	//필드
	String maker = "국제 계산기";
	double result ;
	
	//메소드
	//결과값을 더하는 기능
	void add(double a) {
		result += a ;
	}
	double add(double a, double b) { //매개변수의 갯수나 형이 다르면 메소드 이름이 동일해도 상관없음.(오버로딩)
		return result + a+b;
	}
	void sub(double a) {
		result -= a ;
	}
	void times(double a) {
		result *= a ;
	}
	void div(double a) {
		result /= a ;
	}
	
	
}

public class J_210419_newCal {
	public static void main(String[] args) {
		NewCar c1 = new NewCar();
//		System.out.printf("%.1f\n", c1.result);
		c1.add(10.4);
		System.out.printf("%.1f\n", c1.result);
//		c1.times(5.7);
//		System.out.printf("%.1f\n", c1.result);
//		c1.div(2.3);
//		System.out.printf("%.1f\n", c1.result);
//		c1.sub(4.5);
//		System.out.printf("%.1f\n", c1.result);
		
		System.out.println(c1.add(20,10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
