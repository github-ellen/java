package ex08_inher;

class MyCar {
	static final String myCarName = "제네시스 g90"; //내 이름을 어디서나 공유할 수 있도록 static.
													//이름 바꾸지마! final.	
}

//타이어 부품
class Tire extends MyCar {
	private String tireCom ;
	public Tire(String tireCom) {
		this.tireCom = tireCom;
	}
	@Override
	public String toString() {
		return "타이어 회사 => " + tireCom;
	}
}

//거울 부품
class Mirror extends MyCar {
	private String mCom;
	public Mirror(String mCom) {
		this.mCom = mCom;
	}
	@Override
	public String toString() {
		return "거울 회사 => " + mCom;
	}
	
}

//수리 업체
class RepairCom { 
//	void exchangePart(Tire t) { //타이어를 매개변수로 받아야지 타이어 교체가 이루어진다.
//		System.out.println(t + "교체 완료");
//	}
//	void exchangePart(Mirror r) {
//		System.out.println(r + "교체 완료");
//	}
	
	//다형성을 이용하면 하나로 여러가지 부품을 교체할 수 있는 메소드가 만들어짐.
	void exchangePart(MyCar mc) { //내 자식형으로 들어오는 클래스가 무엇이던지 처리해주겠다.
								  //자식 클래스만 만들어서 뿌려주면 됨.
		System.out.println(mc + "교체 완료"); 
	}
	
	
}




public class J_210504_car {

	public static void main(String[] args) {
		System.out.println(MyCar.myCarName);
		
		Tire tire1 = new Tire("한국 타이어");
		//System.out.println(tire1.toString());
		
		Mirror m1 = new Mirror("한국 거울");
		//System.out.println(m1.toString() );
		
		RepairCom r1 = new RepairCom();
		r1.exchangePart(tire1); //오버로딩 기법
		r1.exchangePart(m1); //오버로딩 기법
		
		
	}

}
