package ex01_class;
//�ڵ��� Ŭ����
class Phone {
	private String pName ;
	private int pCapacity ;
	private int pPixel ;
	//������
	public Phone() {} //�⺻ ������ ����
	public Phone(String pName, int pCapacity, int pPixel) {
		this.pName = pName;
		this.pCapacity = pCapacity;
		//this(name, capacity); ��� ������ Phone(String pName, int pCapacity) ���� ȣ���Ѵٴ� �ǹ�.
		//this()�� �ݵ�� ù��° �ٿ� �ۼ�.
		
		setPixel(pPixel);
		System.out.println(this); //this = �� �ڽ��� �ּҰ��� ������ �ִ�.
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
		Phone p1 = new Phone("������", 512, -500);
		System.out.println(p1);
		p1.setPcapacity(256);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
