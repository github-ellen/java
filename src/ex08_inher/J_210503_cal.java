package ex08_inher;


class Cal {
	
	int plus (int a, int b){
		int sum = a+b;
		return sum;
	}
	
	int minus(int a, int b) {
		int min = a-b;
		return min;
	}
	
	int times(int a, int b) {
		int times = a*b;
		return times;
	}
	
	double div(int a, int b) {
		double div = (double) a/b;
		return div;
	}
	
	private String color ;
	int reslut;

	String getColor() {
		return color;
	}
	protected int result;
	
	public void setColor(String color) {
		this.color = color;
	}
	//�θ� Ŭ������ �����ڸ� �ڽ� Ŭ�������� ����.
	Cal (String color){
		this.color = color;
	}

	public int getReslut() {
		return reslut;
	}

	public void setReslut(int reslut) {
		this.reslut = reslut;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
}

class NewCal extends Cal {

	private int result;
	
	NewCal(String color) { 
		super(color); //�θ� Ŭ������ ������ ����	
	}

	int plus (int a) {
		result =+ a;
		return result;
		
	}
	void remainder(int a, int b) {
		System.out.println(a%b);
	}
	
	void square(int a) {
		System.out.println(a*a);
	}
	
	
}




public class J_210503_cal {

	public static void main(String[] args) {
		
		Cal standCal = new Cal("����");
		System.out.println(standCal.getColor());
		
		standCal.plus(2, 5);
	
		
		standCal.div(6, 4);
		
		NewCal NewCal = new NewCal("�Ķ�");
		System.out.println(NewCal.getColor() +"�� ��� ���� " + NewCal.plus(4,7));
		
		NewCal.minus(5, 1);
		//newCal.square(5);
		//newCal.remainder(7, 4);
		
		System.out.println(NewCal.plus(4));
		System.out.println(NewCal.plus(4,3));
		
		
		

	}

}