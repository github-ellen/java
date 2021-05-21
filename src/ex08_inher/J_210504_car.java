package ex08_inher;

class MyCar {
	static final String myCarName = "���׽ý� g90"; //�� �̸��� ��𼭳� ������ �� �ֵ��� static.
													//�̸� �ٲ�����! final.	
}

//Ÿ�̾� ��ǰ
class Tire extends MyCar {
	private String tireCom ;
	public Tire(String tireCom) {
		this.tireCom = tireCom;
	}
	@Override
	public String toString() {
		return "Ÿ�̾� ȸ�� => " + tireCom;
	}
}

//�ſ� ��ǰ
class Mirror extends MyCar {
	private String mCom;
	public Mirror(String mCom) {
		this.mCom = mCom;
	}
	@Override
	public String toString() {
		return "�ſ� ȸ�� => " + mCom;
	}
	
}

//���� ��ü
class RepairCom { 
//	void exchangePart(Tire t) { //Ÿ�̾ �Ű������� �޾ƾ��� Ÿ�̾� ��ü�� �̷������.
//		System.out.println(t + "��ü �Ϸ�");
//	}
//	void exchangePart(Mirror r) {
//		System.out.println(r + "��ü �Ϸ�");
//	}
	
	//�������� �̿��ϸ� �ϳ��� �������� ��ǰ�� ��ü�� �� �ִ� �޼ҵ尡 �������.
	void exchangePart(MyCar mc) { //�� �ڽ������� ������ Ŭ������ �����̴��� ó�����ְڴ�.
								  //�ڽ� Ŭ������ ���� �ѷ��ָ� ��.
		System.out.println(mc + "��ü �Ϸ�"); 
	}
	
	
}




public class J_210504_car {

	public static void main(String[] args) {
		System.out.println(MyCar.myCarName);
		
		Tire tire1 = new Tire("�ѱ� Ÿ�̾�");
		//System.out.println(tire1.toString());
		
		Mirror m1 = new Mirror("�ѱ� �ſ�");
		//System.out.println(m1.toString() );
		
		RepairCom r1 = new RepairCom();
		r1.exchangePart(tire1); //�����ε� ���
		r1.exchangePart(m1); //�����ε� ���
		
		
	}

}
