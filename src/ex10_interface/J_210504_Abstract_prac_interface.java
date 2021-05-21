package ex10_interface;

//�������̽� : ������ ����. ���߻�� ����
//���ϴ� ��ɵ鸸 �����Ͽ� �����ϱ�
interface Attack { //�߻� �޼ҵ带 �����ϰ� �ֱ⿡ �������̽��� ��ü ���� �Ұ�
	void attack(); // abstract ���� ����
	default void gameTime() { //default�� ������ �Ϲ� �޼ҵ尡 ��.
		System.out.println("24�ð� ���� ����");
	}
	
	
	//�ʵ� ���� ����
	String name = "���ϸ� ����"; //name�� ���Ⱑ ���� ���� -> public static final �����Ǿ� ����.
}

interface Sound {
	void sound();
	
	String name = "���ϸ� �Ҹ�";
}

class Pikachu implements Attack, Sound { // ���� ��� ����

	@Override
	public void attack() { // �ݵ�� public���� ����
		System.out.println("���� ����");

	}

	@Override
	public void sound() {
		System.out.println("��ī��ī");

	}
}

class Squirtle implements Attack, Sound {

	@Override
	public void attack() {
		System.out.println("�� ����");

	}

	@Override
	public void sound() {
		System.out.println("���ϲ���");

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

// class Squirtle extends Attack, Sound {} //�߻� Ŭ������ ���� ��� �Ұ�

public class J_210504_Abstract_prac_interface {

	public static void main(String[] args) {
		// �������� �̿��Ͽ� ��ü ����
		Pikachu pika = new Pikachu();
		Attack a = new Pikachu();
		Sound s = new Pikachu();
		pika.attack();
		pika.sound();
		a.attack();
		s.sound();
		System.out.println("���� --> " + Attack.name); //static �̱� ������ ����

		Squirtle squirtle = new Squirtle();
		squirtle.attack();
		squirtle.sound();
		
		GamePlay play = new GamePlay();
		play.attack(new Pikachu());
		
		pika.gameTime();
		

	}

}
