package ex01_class;
//���� ���α׷�


public class J_210421_calcul {
	//�� ���� �Ű������� �޾Ƽ� ���� �����ϴ� �޼ҵ�
	private boolean light;
	public static String brand = "���� ����";
	private double result ;
	public String color ;
	
	void lightToggle() {
		light = !light;
	}
	
	void getLight() {
		System.out.println(light);
	}
	
	

//	static double add(double a, double b) {
//		return a+b;
//	}
	static double add(double a, double b) {
//		result += (a+b); //result ���� static ���� ����Ǿ����.
						//static �޼ҵ� �ȿ����� static �ʵ常 ��� ������.
		return a+b;
	}
	double add(int a) {
		this.result +=a;
		return result;
	}
	
	J_210421_calcul(){}
	
	public static void main(String[] args) {
		J_210421_calcul c1 = new J_210421_calcul(); //�޼ҵ带 ����ϱ� ���� ù �ܰ�
		//System.out.println(c1.add(5, 10.2));
		
		//��ü�� �����ϱ� �ȴٸ� �޼ҵ忡 static ���̱�
		//J_210421_calcul c1 = new J_210421_calcul(); �ּ� ó���ϱ�
		//System.out.println(J_210421_calcul.add(1.2, 7));
		c1.lightToggle();
		c1.getLight();


	}

}
