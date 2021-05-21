package ex04_generics;

//�α����� ���
class Member { //�Ϲ� ȸ��
	private String id;
	private String pw;
	
	public Member (){}
	public Member (String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
}
class Vip { //VIP ȸ��
	private String vid;
	private String vpw;
	private double discount = 0.2;
	
	Vip (){}
	Vip (String vid, String vpw){
		this.vid = vid;
		this.vpw = vpw;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVid() {
		return vid;
	}
	public void setVpw(String vpw) {
		this.vpw = vpw;
	}
	public String getVpw() {
		return vpw;
	}
	public double getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return "Vip [vid=" + vid + ", vpw=" + vpw + ", discount=" + discount + "]";
	}
}

//�α��� ���� Ŭ����
class LoginMan<T>{ //�̰� ���� �Ϲ� ȸ��, VIP ȸ��, �ǹ� ȸ�� ����� ����� ������
				//���׸� Ÿ�� ����
	//�޼ҵ带 ��������.
	//��¸� �� ���̱� ������ ��ȯ�� �ʿ����
	void login(T mem) { //���� �������� �ߴ��� �˾ƾ��ϱ� ������ �Ű����� !!
		System.out.println(mem);
		if (mem instanceof Member) {
			System.out.println(((Member)mem).getId()+"�� �α���");
		}else if (mem instanceof Vip) { //= ����� vip���,
			System.out.println(((Vip)mem).getVid()+"�� �α���");
		}
	}
//	void login(Vip vip) { 
//		System.out.println("VIP ȸ�� " + vip.getVid()+"���� �����ϼ̽��ϴ�.");
//	}
//	
}

public class J_210422_member {

	public static void main(String[] args) {
		Member m1 = new Member("���缮", "y1234");
//		System.out.println(m1);
		Vip v1 = new Vip("��ȣ��", "k4567");
//		System.out.println(v1);
		
		//�α��� ���� Ŭ������ ����ϱ� ���ؼ��� ��ü ����!
		LoginMan<Member> member = new LoginMan<>();
		LoginMan<Vip> vip = new LoginMan<>();
		member.login(m1); //login �޼ҵ�� ��ȯ���� ���� ������ sys.out.println���� ���� �Ұ�
		vip.login(v1);

	}

}
