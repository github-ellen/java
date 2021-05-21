package ex09_abstract;

abstract class Pokemon{
	//자식 클래스들이 가져야하는 메소드들 적어놓기.(구현하는 것이 목적)
	//빠른 개발에 도움.
	//자식 클래스들의 메소드를 강제화
	//
	abstract void attack(); 
	abstract void sound(); 
	
//	void gameName() { //추상 클래스 안에 일반 메소드를 가질 수 있음.
//		System.out.println("포켓몬 게임");
//	}
	
}

class Pikachu extends Pokemon {

	@Override
	void attack() {
		System.out.println("전기 공격");
		
	}

	@Override
	void sound() {
		System.out.println("피카 피카");
		
	}

}

class Squirtle extends Pokemon {

	@Override
	void attack() {
		System.out.println("물 공격");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북");
		
	}

}

//게임 클래스
class GamePlay {
	void attackPlay(Pokemon mon) { //Pokemon은 인터페이스의 역할을 하고 있는 것뿐.
		mon.attack();
	}
	void soundPlay(Pokemon mon) {
		//mon.gameName();
		mon.sound();
	}
}


public class J_210504_Abstract_prac {

	public static void main(String[] args) {
		GamePlay gp = new GamePlay();
		Pikachu pika = new Pikachu();
		Squirtle squ = new Squirtle();
		
		System.out.println("피카츄 등장");
		gp.soundPlay(pika); //또는 gp.soundPlay(new Pikachu());
		gp.attackPlay(pika);
		
		System.out.println("--------------");
		System.out.println("꼬부기 등장");
		gp.soundPlay(squ);
		gp.attackPlay(squ);
		
	}

}
