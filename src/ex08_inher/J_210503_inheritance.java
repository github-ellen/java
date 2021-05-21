package ex08_inher;

//부모 클래스
class Person {
	
	//protected : 자식 클래스 접근 허용
	protected String name;
	//private String name;
	void setName(String name) {
		this.name = name;
	}
	
	void breath() {
		System.out.println(name + "이 숨쉬다.");
	}
	
	void eat() {
		System.out.println(name + "이 먹다.");
	}
	
}

//자식 클래스
class Student extends Person {
	
	private String name = "학생";
	Student (){
		//super.name = this.name; 부모 클래스에서 name 필드가 private 이기 때문에 사용 불가.
		//super.setName(name);
		super.name = this.name;
	}
	
	void learn() {
		System.out.println(name +"이 배우다");
	}
}
	
class Teacher extends Person {
	
	private String name = "선생님";
	Teacher (){
		super.name = this.name;
	}
;	
	void teach() {
		System.out.println(name + "이 가르치다");
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
