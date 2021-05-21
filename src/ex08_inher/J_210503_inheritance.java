package ex08_inher;

//�θ� Ŭ����
class Person {
	
	//protected : �ڽ� Ŭ���� ���� ���
	protected String name;
	//private String name;
	void setName(String name) {
		this.name = name;
	}
	
	void breath() {
		System.out.println(name + "�� ������.");
	}
	
	void eat() {
		System.out.println(name + "�� �Դ�.");
	}
	
}

//�ڽ� Ŭ����
class Student extends Person {
	
	private String name = "�л�";
	Student (){
		//super.name = this.name; �θ� Ŭ�������� name �ʵ尡 private �̱� ������ ��� �Ұ�.
		//super.setName(name);
		super.name = this.name;
	}
	
	void learn() {
		System.out.println(name +"�� ����");
	}
}
	
class Teacher extends Person {
	
	private String name = "������";
	Teacher (){
		super.name = this.name;
	}
;	
	void teach() {
		System.out.println(name + "�� ����ġ��");
	}
}
	


public class J_210503_inheritance {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.breath();
		stu.eat();
		stu.learn();
		
		System.out.println("----------------");
		
		Teacher sam = new Teacher ();
		sam.breath();
		sam.eat();
		sam.teach();

	}

}
