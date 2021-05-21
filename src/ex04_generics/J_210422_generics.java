package ex04_generics;

//���������� �������� �ٲ� �� ���� ������
//�������� �� �ٸ� Ŭ������ ��������
//�׷� ���� ���̱� ���� ��� -> Ÿ���� �����Ѵٴ� �ǹ��� ��, T(Type)�� ū �ǹ̾���.
//T ����Ͽ� A��, B��, C�� �� ��.
//���� ����ϴ� Ű���� : T(type), K(key), V(value), E(element)
//<> �ȿ� �� Ÿ�Կ� ���� �������شٴ� �ǹ�
//���׸� Ÿ�� : �ν��Ͻ� ���� ��, ���� ����. ������ �Ұ�! �����ϰ� �ʹٸ� �������..
class Rectangle<T>{
	private T w ;
	private T h ;
	private double a ;
	
	//Rectangle (){}
	Rectangle (T w, T h){
		this.w = w;
		this.h = h;
		a = getA(w, h);
	}

	public T getW() {
		return w;
	}
	public void setW(T w) {
		this.w = w;
	}
	public T getH() {
		return h;
	}
	public void setH(T h) {
		this.h = h;
	}
//	public T getA() {
//		return a;
//	}
	
	//�̰��� ���.
	public double getA(T w, T h) {
		double result = 0;
		if(w instanceof Integer) {
			result = (int) w * (int)h ;
		}else if (w instanceof Double)
			result = (double)w *(double)h;
		return result;
	}
	


	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + ", a=" + a + "]";
	}
}


public class J_210422_generics {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5.2, 10);
		Rectangle r2 = new Rectangle(5, 10);
		System.out.println(r1);
		System.out.println(r2);
		
		Rectangle<Integer> r3 = new Rectangle<Integer>(5, 7);
//		Rectangle<Integer> r3 = new Rectangle<>(5, 7); �����ڿ����� ���� ����
		//Rectangle<int> r3 = new Rectangle<int>(5, 7); �⺻������ �ۼ� �Ұ�
		System.out.println(r3);
		
		//���������� ����� �ʹٸ�
		Rectangle<Double> r4 = new Rectangle<Double>(5.7, 3.4);
//		Rectangle<Double> r4 = new Rectangle<>(5.7, 3.4);�����ڿ����� ���� ����
		System.out.println(r4);
		
		

	}

}
