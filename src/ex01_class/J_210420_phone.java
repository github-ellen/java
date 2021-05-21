package ex01_class;
//핸드폰 클래스
class Phone {
	private String pName ;
	private int pCapacity ;
	private int pPixel ;
	//생성자
	public Phone() {} //기본 생성자 생성
	public Phone(String pName, int pCapacity, int pPixel) {
		this.pName = pName;
		this.pCapacity = pCapacity;
		//this(name, capacity); 라고 적으면 Phone(String pName, int pCapacity) 값을 호출한다는 의미.
		//this()는 반드시 첫번째 줄에 작성.
		
		setPixel(pPixel);
		System.out.println(this); //this = 나 자신의 주소값을 가지고 있다.
	}
	public Phone(String pName, int pCapacity) {
		this.pName = pName;
		this.pCapacity = pCapacity;
	}
	
	public Phone(String pName) {
		this.pName = pName;
	}
	//setter
	void setPname(String pName) {
		this.pName = pName ;
	}
	void setPcapacity(int pCapacity) {
		this.pCapacity = pCapacity ;
	}
	int setPixel(int pPixel) {
		if (pPixel < 0) {
			this.pPixel = 0;
		}
		else
			this.pPixel = pPixel ;
		
		return this.pPixel;
	}
	//getter
	String getPname() {
		return pName;
	}
	int getPcapacity() {
		return pCapacity;
	}
	int getPpixel() {
		return pPixel;
	}
	
	//toString
	@Override
	public String toString() {
		return "Phone [pName=" + pName + ", pCapacity=" + pCapacity + ", pPixel=" + pPixel + "]";
	}
	
}

public class J_210420_phone {

	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 512, -500);
		System.out.println(p1);
		p1.setPcapacity(256);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
