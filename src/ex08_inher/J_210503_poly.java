package ex08_inher;

//������


class Shape {
	
	private int height ;
	private int width ;
	
	//������(�ϳ��� ���� �������� ������ �ٲ� �� �ִ� ��)�� ���Ͽ� �޼ҵ� �ۼ�
	//�������� ���� ���̽��� ����� �ִ� ��.
	//���� ����Ǵ� ����(run time ��) �ڽ� �޼ҵ尡 �����.
	void printShape () {
		System.out.println("�ٰ���");
		
	}
	
}

class Rectan extends Shape {
	
	@Override
	void printShape () {
		System.out.println("�簢��");
	
	}
}

class Tri extends Shape {
	
	@Override
	void printShape () {
		System.out.println("�ﰢ��");
	
	}
}

public class J_210503_poly {

	public static void main(String[] args) {
		
		Rectan r = new Rectan();
		//Shape r = new Rectan(); �̰͵� ���� !! �̰��� ������ ������ �������̵� �Ǿ��ֱ� ������.
		//�������� �̿��Ͽ� �޼ҵ带 ������ ��� �ݵ�� �������̵��� �Ǿ� �־���Ѵ�.
		r.printShape();
		
		
		
		Tri t = new Tri();
		//Shape t = new Tri();
		t.printShape();

	}

}
