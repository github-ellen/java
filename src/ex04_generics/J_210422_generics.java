package ex04_generics;

//정수형에서 더블형을 바꿀 수 없기 때문에
//더블형의 또 다른 클래스를 만들어야함
//그런 일을 줄이기 위한 방안 -> 타입을 지정한다는 의미일 뿐, T(Type)에 큰 의미없음.
//T 대신하여 A도, B도, C도 다 됨.
//자주 사용하는 키워드 : T(type), K(key), V(value), E(element)
//<> 안에 들어간 타입에 따라서 변형해준다는 의미
//제네릭 타입 : 인스턴스 생성 시, 형을 결정. 연산은 불가! 연산하고 싶다면 편법으로..
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
	
	//이것이 편법.
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
//		Rectangle<Integer> r3 = new Rectangle<>(5, 7); 생성자에서는 생략 가능
		//Rectangle<int> r3 = new Rectangle<int>(5, 7); 기본형으로 작성 불가
		System.out.println(r3);
		
		//더블형으로 만들고 싶다면
		Rectangle<Double> r4 = new Rectangle<Double>(5.7, 3.4);
//		Rectangle<Double> r4 = new Rectangle<>(5.7, 3.4);생성자에서는 생략 가능
		System.out.println(r4);
		
		

	}

}
