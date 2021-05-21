package ex08_inher;


//클래스 상속을 막고 싶다면
//final class Bird
class Bird{
	
	private String name;
	
	//name을 세팅할 생성자 만들기
	Bird (String name){
		this.name = name;
	}
	
	void born() {
		System.out.println("알을 낳는다.");
	}
	
	void fly() {
		System.out.println(name + "날 수 있다.");
	}
	
}

//참새
class Sparrow extends Bird{
	
	Sparrow(String name){
		super(name);//부모의 생성자에 값을 넘겨서 실행한다.
					//참새의 매개변수로 받은 값을 부모 생성자에 넘기기.
	}

	
}

class Ostrich extends Bird{
	
	Ostrich(String name){
		super(name);
	}
	
	//부모에서 정의한 내용을 동일하게 적되 수정 부분만 바꾸기.
	//오버라이딩 : 부모 클래스의 메소드를 재정의하는 것.
	//자동 완성하고 싶다면 오른쪽 버튼 클릭 -> source -> override/implement Method.
	//재정의 할 수 없게 막고 싶다면 부모 클래스의 메소드에 final 붙이면 됨.
	@Override //기입하는 것이 좋음. 에러를 줄일 수 있음.
	void fly() {
		System.out.println("날 수 없다.");
	}

	
}

public class J_210503_bird {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow("참새");
		
		sparrow.born();
		sparrow.fly();
		
		System.out.println("---------------");
		
		Ostrich ostrich = new Ostrich("타조");
		
		ostrich.born();
		//타조는 날 수 없다. -> 오버라이딩하기.
		ostrich.fly();
		
		//Bird b1 = new Ostrich("타조"); //업캐스팅(자동으로 됨)
		//Bird b2 = new Sparrow("참새"); //업캐스팅(자동으로 됨)
		
		//1> Object b2 = new Sparrow("참새");도 가능하지만 메소드 기능이 없음. 굳이 사용하고 싶다면
		//2> Sparrow b3 = (Sparrow) b2; ((=다운 캐스팅/수동)
		//3> b3.fly(); 사용 가능해짐.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	}
}
