package ex01_class;

class Cal {
	//�ʵ�
	String maker = "���� ����";
	String color = "��" ;
	
	//�޼ҵ�
	int add(int a, int b) {
		//System.out.println(a+b); //main �Լ� ������ ���� c1.add�� ���⿡�� ��µǴ� ����.(���� ����� �ƴ�)
		//���� ���� ���� �Լ� ������ ���Ϲް� �ʹٸ� void -> int
		int r = a+b;
		return r;
	}
	int min(int a, int b) {
		int mR = a - b;
		return mR ;
	}
	int times(int a, int b) {
		return a * b;
	}
	double div(int a, int b) {
		return (double)a / b; //a�� ���� ���������� �ٲٰڴ�.
	}
}



public class J_210419_cal {

	public static void main(String[] args) {
		Cal c1 = new Cal(); // ��ü�� �����ؾ����� �ʵ� ��ȯ ����
		int a = 20, b = 3;
		c1.add(a, b);
		int r = c1.add(a, b);
		System.out.println(c1.add(a, b));
		System.out.println(r);
		int mR = c1.min(a, b);
		System.out.println(mR); //�޼ҵ��� ���ϰ����� ����Ϸ��� �޼ҵ带 ��ȯ�Ͽ� ���� �����ϴ� �� �ʿ�
		System.out.println(c1.min(a, b));
		System.out.println(c1.times(a, b));
		System.out.println(c1.div(a, b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
