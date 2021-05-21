package ex08_inher;


//Ŭ���� ����� ���� �ʹٸ�
//final class Bird
class Bird{
	
	private String name;
	
	//name�� ������ ������ �����
	Bird (String name){
		this.name = name;
	}
	
	void born() {
		System.out.println("���� ���´�.");
	}
	
	void fly() {
		System.out.println(name + "�� �� �ִ�.");
	}
	
}

//����
class Sparrow extends Bird{
	
	Sparrow(String name){
		super(name);//�θ��� �����ڿ� ���� �Ѱܼ� �����Ѵ�.
					//������ �Ű������� ���� ���� �θ� �����ڿ� �ѱ��.
	}

	
}

class Ostrich extends Bird{
	
	Ostrich(String name){
		super(name);
	}
	
	//�θ𿡼� ������ ������ �����ϰ� ���� ���� �κи� �ٲٱ�.
	//�������̵� : �θ� Ŭ������ �޼ҵ带 �������ϴ� ��.
	//�ڵ� �ϼ��ϰ� �ʹٸ� ������ ��ư Ŭ�� -> source -> override/implement Method.
	//������ �� �� ���� ���� �ʹٸ� �θ� Ŭ������ �޼ҵ忡 final ���̸� ��.
	@Override //�����ϴ� ���� ����. ������ ���� �� ����.
	void fly() {
		System.out.println("�� �� ����.");
	}

	
}

public class J_210503_bird {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow("����");
		
		sparrow.born();
		sparrow.fly();
		
		System.out.println("---------------");
		
		Ostrich ostrich = new Ostrich("Ÿ��");
		
		ostrich.born();
		//Ÿ���� �� �� ����. -> �������̵��ϱ�.
		ostrich.fly();
		
		//Bird b1 = new Ostrich("Ÿ��"); //��ĳ����(�ڵ����� ��)
		//Bird b2 = new Sparrow("����"); //��ĳ����(�ڵ����� ��)
		
		//1> Object b2 = new Sparrow("����");�� ���������� �޼ҵ� ����� ����. ���� ����ϰ� �ʹٸ�
		//2> Sparrow b3 = (Sparrow) b2; ((=�ٿ� ĳ����/����)
		//3> b3.fly(); ��� ��������.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	}
}
