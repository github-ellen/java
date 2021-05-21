package ex01_class;

class Cal {
	//필드
	String maker = "국제 계산기";
	String color = "블랙" ;
	
	//메소드
	int add(int a, int b) {
		//System.out.println(a+b); //main 함수 내에서 적은 c1.add는 여기에서 출력되는 값임.(좋은 방법은 아님)
		//더한 값을 메인 함수 내에서 리턴받고 싶다면 void -> int
		int r = a+b;
		return r;
	}
	int min(int a, int b) {
		int mR = a - b;
		return mR ;
	}
	int times(int a, int b) {
		return a * b;
	}
	double div(int a, int b) {
		return (double)a / b; //a의 값을 더블형으로 바꾸겠다.
	}
}



public class J_210419_cal {

	public static void main(String[] args) {
		Cal c1 = new Cal(); // 객체를 생성해야지만 필드 소환 가능
		int a = 20, b = 3;
		c1.add(a, b);
		int r = c1.add(a, b);
		System.out.println(c1.add(a, b));
		System.out.println(r);
		int mR = c1.min(a, b);
		System.out.println(mR); //메소드의 리턴값으로 출력하려면 메소드를 소환하여 값에 대입하는 식 필요
		System.out.println(c1.min(a, b));
		System.out.println(c1.times(a, b));
		System.out.println(c1.div(a, b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
