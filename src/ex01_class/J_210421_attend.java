package ex01_class;
//���� ��û Ŭ����

import java.util.Arrays;

//������ Ŭ����(dto)
class Attendee {
	private String name ;
	private int id ;
	private String subject ;
	
	
	public Attendee() {}
	public Attendee(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

	@Override
	public String toString() {
		return "Attendee [name=" + name + ", id=" + id + ", subject=" + subject + "]";
	}

	
	
	
	
	
}

//����� ����
class Lmanager {
	static final String insti = "���� �п�";
	int buildYear = 2001; //��ü�� ������ ��(new Lmanager ����)���� ������� ����.
	//Ŭ���� �ʵ�, Ŭ���� ���� / �������� ������ ����ϰڴ�.
	static String location = "������"; //��ü�� �������� �ʾƵ� Ŭ�������� ����ϸ� ��� ����.
										//Ŭ������ �޸𸮿� �ε��� �� ����.
	
	static int day ;
	//static int day =21 ;
	static { //static ���� �ʱ�ȭ
		int a = 21;
		day = a;
	}
	//static final int day; //������ ���� -> static final�� ����� ���ÿ� �ʱ�ȭ�� �ݵ�� �̷������.
	
	//���ȭ
//	static final String floor = "3��"; 
	static void enter(Attendee att) { //��ĥ�� �Խ��ߴ���.
		//this.day = day; ���� ����.
		System.out.println(day + "�� " + att.getSubject() + " "+ att.getName()+ "�� �Խ�");
	}

	//�л��� ������ a1�� ������ ����
	//��ü�� �ּҸ� �����ؾ��ϱ� ������ �Ű������� �Է�
	void in(Attendee att) {
		//�л��� ������ �Է��ؾߵ�! ��� �Է��ؾ��ұ�.

		System.out.println(att.getSubject()+" ���ǿ� " + att.getName() + " �л� �Խ� �Ϸ�");
	}
	//�޼ҵ忡�� static ���� �� ����
	static void out(Attendee att) {
		System.out.println(att.getSubject()+" ���ǿ� " + att.getName() + " �л� ��� �Ϸ�");
	}
	
	
}

public class J_210421_attend {

	public static void main(String[] args) {
//		System.out.println(ma.location);
		System.out.println(Lmanager.location); //Ŭ���� �̸����� �����ؼ�
												//�� �ȿ� �ִ� �޼ҵ带 ����� �� ����
//		System.out.println(Lmanager.floor);

		
		//�������� ���� ���� �����ϸ� �迭 �����ߵȴٴ� �� �����ϱ�
		//Attendee[] sArr = new Attendee[30];
		

		Attendee a1 = new Attendee();
		a1.setName("ȫ�浿");
		a1.setId(31011);
		a1.setSubject("��ȭ");
		
		System.out.println(a1);
		
		//ȫ�浿�� �Խ��ϼ̽��ϴ�.
		//�켱 ����� ���� Ŭ������ �����ؾ����� �޼ҵ� Ȱ�� ����
		Lmanager ma = new Lmanager();
		//System.out.println(ma.insti);
		System.out.println(ma.buildYear);
		Lmanager.enter(a1);

		ma.in(a1);

	}

}
