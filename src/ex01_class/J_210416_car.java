package ex01_class;
//�ڵ��� Ŭ����

class Car {
	String name = "�غ���";
	String color = "�Ķ�";
	boolean power ;
	int speed ;
	
	void powerToggle() { //�̰��� �����ϸ� power �� !power �� ����
		power = !power; //off -> on
	}
	void speedUp() { //�ӵ� 100 �ʰ� �Ұ�.
		speed++;
		if (speed > 99) {
			speed--;
		}
	}
	void speedDn() { //�ӵ� 50 �̸� �Ұ�.
		if (speed > 50) speed--; 
	}
}
public class J_210416_car {

	public static void main(String[] args) {
		Car c1 = new Car() ;
		//�ʱⰪ �˾ƺ���
		System.out.println("�Ŀ� : " +c1.power); //�Ŀ��� �����ִٰ� �����ϱ�.
		System.out.println("�ӷ� : " +c1.speed);
		c1.powerToggle();
		System.out.println(c1.power);
		c1.powerToggle();
		System.out.println(c1.power);
//		c1.speedUp(); //�޼ҵ带 ������ �Ŀ� �� ��ü�� ���¸� ����ϴ� ������ �����ϱ�
//		System.out.println(c1.speed);
		//�ӵ��� 100���� �ø���
		for (int i = 0 ; i < 100 ; i++) {
			c1.speedUp();
		}
		System.out.println("�ӵ� Up : " +c1.speed);
		//�ӵ� ������
		for (int i = 0 ; i < 100 ; i++) {
			c1.speedDn();
		}
		System.out.println("�ӵ� Down : " +c1.speed);
		
		//��ӵ��ο� ���� �ӵ������� �ɷ��ִٸ� ?
		//�ʵ� �������� �����ϱ�.
		for (int i = 0 ; i < 200 ; i++) {
			c1.speedUp();
		}
		System.out.println("�ӵ� Up : " +c1.speed);
		
		for (int i = 0 ; i < 100 ; i++) {
			c1.speedDn();
		}
		System.out.println("�ӵ� Down : " +c1.speed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
