package ex08_inher;

//�������� �̿��Ͽ� ó���ϱ�.

//����
//�Ҵ�
//�⸰
//���

class Animal{ //���⼭�� �θ� Ŭ������ Ư���� ����� ����.
	
}

class Lion extends Animal {
	@Override
	public String toString() {
		return "����";
	}
	
}

class Panda extends Animal{

	@Override
	public String toString() {
		return "�Ǵ�";
	}
	
}

class Rabbit extends Animal {
	@Override
	public String toString() {
		return "�䳢";
	}
	
}




class AnimalCare {
	//�����ֱ� �޼ҵ�
//	void feed(){
//		System.out.println(animal + "���� ���̸� �־����ϴ�.");
//	} �� �Ϸ��� �������� �ʿ���.
	void feed(Animal name){
	System.out.println(name + "���� ���̸� �־����ϴ�.");
	}
	
	//����Ű��
	void take_Bath(Animal name) {
		System.out.println(name + "�� �����׽��ϴ�.");
	}
	
	
}


public class J_210504_zoo {

	public static void main(String[] args) {
		AnimalCare care = new AnimalCare();
		Lion lion = new Lion();		
		Panda panda = new Panda();
		care.feed(lion); //LionŬ������ toString�� �ؾ����� �� �� ����.
		care.feed(panda);
		care.take_Bath(panda);
		care.take_Bath(new Rabbit());
		

	}

}
