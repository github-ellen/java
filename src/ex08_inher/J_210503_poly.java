package ex08_inher;

//다형성


class Shape {
	
	private int height ;
	private int width ;
	
	//다형성(하나의 형을 여러가지 형으로 바꿀 수 있는 것)을 위하여 메소드 작성
	//다형성을 위한 베이스를 만들어 주는 것.
	//실제 실행되는 것은(run time 시) 자식 메소드가 실행됨.
	void printShape () {
		System.out.println("다각형");
		
	}
	
}

class Rectan extends Shape {
	
	@Override
	void printShape () {
		System.out.println("사각형");
	
	}
}

class Tri extends Shape {
	
	@Override
	void printShape () {
		System.out.println("삼각형");
	
	}
}

public class J_210503_poly {

	public static void main(String[] args) {
		
		Rectan r = new Rectan();
		//Shape r = new Rectan(); 이것도 가능 !! 이것이 가능한 이유는 오버라이딩 되어있기 때문에.
		//다형성을 이용하여 메소드를 실행할 경우 반드시 오버라이딩이 되어 있어야한다.
		r.printShape();
		
		
		
		Tri t = new Tri();
		//Shape t = new Tri();
		t.printShape();

	}

}
