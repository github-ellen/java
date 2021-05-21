package ex10_interface;

//인터페이스 : 구현부 없음. 다중상속 가능
//원하는 기능들만 추출하여 구현하기
interface Attack { //추상 메소드를 포함하고 있기에 인터페이스도 객체 생성 불가
	void attack(); // abstract 생략 가능
	default void gameTime() { //default가 붙으면 일반 메소드가 됨.
		System.out.println("24시간 공격 가능");
	}
	
	
	//필드 삽입 가능
	String name = "포켓몬 공격"; //name이 기울기가 생긴 이유 -> public static final 생략되어 있음.
}

interface Sound {
	void sound();
	
	String name = "포켓몬 소리";
}

class Pikachu implements Attack, Sound { // 다중 상속 가능

	@Override
	public void attack() { // 반드시 public으로 선언
		System.out.println("전기 공격");

	}

	@Override
	public void sound() {
		System.out.println("피카피카");

	}
}

class Squirtle implements Attack, Sound {

	@Override
	public void attack() {
		System.out.println("물 공격");

	}

	@Override
	public void sound() {
		System.out.println("꼬북꼬북");

	}
}

class GamePlay {
	void attack(Attack attack) {
		attack.attack();
	}

	void sound(Sound sound) {
		sound.sound();
	}

}

// class Squirtle extends Attack, Sound {} //추상 클래스는 다중 상속 불가

public class J_210504_Abstract_prac_interface {

	public static void main(String[] args) {
		// 다형성을 이용하여 객체 생성
		Pikachu pika = new Pikachu();
		Attack a = new Pikachu();
		Sound s = new Pikachu();
		pika.attack();
		pika.sound();
		a.attack();
		s.sound();
		System.out.println("공격 --> " + Attack.name); //static 이기 때문에 가능

		Squirtle squirtle = new Squirtle();
		squirtle.attack();
		squirtle.sound();
		
		GamePlay play = new GamePlay();
		play.attack(new Pikachu());
		
		pika.gameTime();
		

	}

}
