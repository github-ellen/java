package ex01_class;
//계산기 프로그램


public class J_210421_calcul {
	//두 수를 매개변수로 받아서 합을 리턴하는 메소드
	private boolean light;
	public static String brand = "국제 계산기";
	private double result ;
	public String color ;
	
	void lightToggle() {
		light = !light;
	}
	
	void getLight() {
		System.out.println(light);
	}
	
	

//	static double add(double a, double b) {
//		return a+b;
//	}
	static double add(double a, double b) {
//		result += (a+b); //result 또한 static 으로 선언되어야함.
						//static 메소드 안에서는 static 필드만 사용 가능함.
		return a+b;
	}
	double add(int a) {
		this.result +=a;
		return result;
	}
	
	J_210421_calcul(){}
	
	public static void main(String[] args) {
		J_210421_calcul c1 = new J_210421_calcul(); //메소드를 사용하기 위한 첫 단계
		//System.out.println(c1.add(5, 10.2));
		
		//객체를 생성하기 싫다면 메소드에 static 붙이기
		//J_210421_calcul c1 = new J_210421_calcul(); 주석 처리하기
		//System.out.println(J_210421_calcul.add(1.2, 7));
		c1.lightToggle();
		c1.getLight();


	}

}
