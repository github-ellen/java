package ex01_class;
//ȸ�� Ŭ����
class Member {
	//����ȭ�ϴ� ������ �����ϱ�������
	private String id ;
	private String pw ; //��й�ȣ�� ������ �����̱� ������ �б� ����� ���ְ� �ʹٸ� getter ����
	private int birth ;
	private double height ;
	
	//������ : Ŭ������ �̸��� ����
	//�����ڴ� �� �� �̻� ���� �� �ִ�.
	//��ü�� ������ �� ����Ǵ� �޼ҵ�
	//�ݵ�� ��ü�� ������ �� �����ڰ� ����Ǿ���Ѵ�.
	
	//�⺻ ������ : �Ű������� ���� ��.
	//�����ڰ� ������ �����Ϸ��� �⺻ ������ ����.
	//�����ڰ� ������ �����Ϸ��� �⺻ ������ ���� X.
	
	
	Member(String id, String pw, int birth, double height){ //��ȯ�� ����, �Ű������� ���� ���� ���� ���� ����
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.height = height;
	}
	
	//setter : set+�ʵ��̸�(ù ���ڴ� �빮��)
	void setId(String id) {
		this.id = id ;
	}
	void setPw(String pw) {
		this.pw = pw ;
	}
	void setBirth(int birth) {
		this.birth = birth;
	}
	void setHeight(double height) {
		this.height = height;
	}
	//getter : get+�ʵ��̸�(ù ���ڴ� �빮��)
	String getId() { 
		return id;
	}
	String getPw() { //�� �ڸ��� �о �����ϰ� �ʹٸ�
		return pw.substring(0,2) + "**";
	}
	int getBirth() {
		return birth;
	}
	double getHeight() {
		return height;
	}
}

public class J_210419_Member {

	public static void main(String[] args) {
		Member health = new Member("fit","1004",9388,180); //�Ʒ� 4���� ���� �� �ٷ� ���� �� ����
//		health.setId("fit");
//		health.setPw("1004");
//		health.setBirth(9388);
//		health.setHeight(180);
		
		
		
		System.out.println("���̵� : " + health.getId());
		System.out.println("��й�ȣ : " + health.getPw());
		System.out.println("������� : " + health.getBirth());
		
//		System.out.println("0123456".substring(3));
//		System.out.println("0123456".substring(0,3));
//		System.out.println("0123456".substring(2,5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
