package ex01_class;
//자동차 클래스

class Car {
	String name = "붕붕이";
	String color = "파랑";
	boolean power ;
	int speed ;
	
	void powerToggle() { //이것을 실행하면 power 가 !power 로 변경
		power = !power; //off -> on
	}
	void speedUp() { //속도 100 초과 불가.
		speed++;
		if (speed > 99) {
			speed--;
		}
	}
	void speedDn() { //속도 50 미만 불가.
		if (speed > 50) speed--; 
	}
}
public class J_210416_car {

	public static void main(String[] args) {
		Car c1 = new Car() ;
		//초기값 알아보기
		System.out.println("파워 : " +c1.power); //파워가 꺼져있다고 생각하기.
		System.out.println("속력 : " +c1.speed);
		c1.powerToggle();
		System.out.println(c1.power);
		c1.powerToggle();
		System.out.println(c1.power);
//		c1.speedUp(); //메소드를 실행한 후에 현 객체의 상태를 출력하는 것으로 이해하기
//		System.out.println(c1.speed);
		//속도를 100까지 올리기
		for (int i = 0 ; i < 100 ; i++) {
			c1.speedUp();
		}
		System.out.println("속도 Up : " +c1.speed);
		//속도 내리기
		for (int i = 0 ; i < 100 ; i++) {
			c1.speedDn();
		}
		System.out.println("속도 Down : " +c1.speed);
		
		//고속도로와 같은 속도제한이 걸려있다면 ?
		//필드 생성에서 수정하기.
		for (int i = 0 ; i < 200 ; i++) {
			c1.speedUp();
		}
		System.out.println("속도 Up : " +c1.speed);
		
		for (int i = 0 ; i < 100 ; i++) {
			c1.speedDn();
		}
		System.out.println("속도 Down : " +c1.speed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
