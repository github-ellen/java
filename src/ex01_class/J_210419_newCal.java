package ex01_class;
//������� ����Ǵ� ����
class NewCar {
	//�ʵ�
	String maker = "���� ����";
	double result ;
	
	//�޼ҵ�
	//������� ���ϴ� ���
	void add(double a) {
		result += a ;
	}
	double add(double a, double b) { //�Ű������� ������ ���� �ٸ��� �޼ҵ� �̸��� �����ص� �������.(�����ε�)
		return result + a+b;
	}
	void sub(double a) {
		result -= a ;
	}
	void times(double a) {
		result *= a ;
	}
	void div(double a) {
		result /= a ;
	}
	
	
}

public class J_210419_newCal {
	public static void main(String[] args) {
		NewCar c1 = new NewCar();
//		System.out.printf("%.1f\n", c1.result);
		c1.add(10.4);
		System.out.printf("%.1f\n", c1.result);
//		c1.times(5.7);
//		System.out.printf("%.1f\n", c1.result);
//		c1.div(2.3);
//		System.out.printf("%.1f\n", c1.result);
//		c1.sub(4.5);
//		System.out.printf("%.1f\n", c1.result);
		
		System.out.println(c1.add(20,10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
