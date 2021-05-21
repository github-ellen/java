package ex01_class;
//원의 넓이 클래스
class Circle{
	private double r;
	private double area;

	Circle(){};
	Circle(double r) {
		this.r=r;
		areaCal(r); //생성자도 메소드처럼 사용할 수 있다 / 생성자에서 메소드 실행
	}
	//오버로딩
	double areaCal(double r) {
		this.area = r*r*Math.PI;
		return area;
	}
	double areaCal(int r) {
		this.area = r*r*Math.PI;
		return area;
	}
	double areaCal(double r, double pi) {
		area = r*r*pi;
		return area;
	}
	double areaCal(int r, double pi) {
		area = r*r*pi;
		return area;
	}
	double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + "]";
	}
	
}
public class J_210420_Area {

	public static void main(String[] args) {
		Circle c1 = new Circle(2.2) ;
		System.out.println(c1);
		
		System.out.println(c1.areaCal(10.3));
		System.out.println(c1.areaCal(10.3, 3.14));
		System.out.println(c1.areaCal(3, 3.14));
		
		
		
		
	}

}
