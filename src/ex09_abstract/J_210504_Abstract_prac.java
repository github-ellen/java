package ex09_abstract;

abstract class Pokemon{
	//�ڽ� Ŭ�������� �������ϴ� �޼ҵ�� �������.(�����ϴ� ���� ����)
	//���� ���߿� ����.
	//�ڽ� Ŭ�������� �޼ҵ带 ����ȭ
	//
	abstract void attack(); 
	abstract void sound(); 
	
//	void gameName() { //�߻� Ŭ���� �ȿ� �Ϲ� �޼ҵ带 ���� �� ����.
//		System.out.println("���ϸ� ����");
//	}
	
}

class Pikachu extends Pokemon {

	@Override
	void attack() {
		System.out.println("���� ����");
		
	}

	@Override
	void sound() {
		System.out.println("��ī ��ī");
		
	}

}

class Squirtle extends Pokemon {

	@Override
	void attack() {
		System.out.println("�� ����");
		
	}

	@Override
	void sound() {
		System.out.println("���� ����");
		
	}

}

//���� Ŭ����
class GamePlay {
	void attackPlay(Pokemon mon) { //Pokemon�� �������̽��� ������ �ϰ� �ִ� �ͻ�.
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
		
		System.out.println("��ī�� ����");
		gp.soundPlay(pika); //�Ǵ� gp.soundPlay(new Pikachu());
		gp.attackPlay(pika);
		
		System.out.println("--------------");
		System.out.println("���α� ����");
		gp.soundPlay(squ);
		gp.attackPlay(squ);
		
	}

}
