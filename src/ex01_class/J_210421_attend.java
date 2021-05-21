package ex01_class;
//수강 신청 클래스

import java.util.Arrays;

//수강생 클래스(dto)
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

//입퇴실 관리
class Lmanager {
	static final String insti = "국제 학원";
	int buildYear = 2001; //객체가 생성될 때(new Lmanager 선언)까지 사용하지 못함.
	//클래스 필드, 클래스 변수 / 언제든지 꺼내서 사용하겠다.
	static String location = "강서구"; //객체가 생성되지 않아도 클래스명을 사용하면 사용 가능.
										//클래스가 메모리에 로딩될 때 생성.
	
	static int day ;
	//static int day =21 ;
	static { //static 변수 초기화
		int a = 21;
		day = a;
	}
	//static final int day; //오류가 생김 -> static final은 선언과 동시에 초기화가 반드시 이루어져함.
	
	//상수화
//	static final String floor = "3층"; 
	static void enter(Attendee att) { //며칠에 입실했는지.
		//this.day = day; 오류 생김.
		System.out.println(day + "일 " + att.getSubject() + " "+ att.getName()+ "님 입실");
	}

	//학생의 정보는 a1이 가지고 있음
	//객체의 주소를 저장해야하기 때문에 매개변수에 입력
	void in(Attendee att) {
		//학생의 정보를 입력해야됨! 어떻게 입력해야할까.

		System.out.println(att.getSubject()+" 강의에 " + att.getName() + " 학생 입실 완료");
	}
	//메소드에도 static 붙일 수 있음
	static void out(Attendee att) {
		System.out.println(att.getSubject()+" 강의에 " + att.getName() + " 학생 퇴실 완료");
	}
	
	
}

public class J_210421_attend {

	public static void main(String[] args) {
//		System.out.println(ma.location);
		System.out.println(Lmanager.location); //클래스 이름으로 접근해서
												//그 안에 있는 메소드를 사용할 수 있음
//		System.out.println(Lmanager.floor);

		
		//수강생이 많을 것을 생각하면 배열 만들어야된다는 것 생각하기
		//Attendee[] sArr = new Attendee[30];
		

		Attendee a1 = new Attendee();
		a1.setName("홍길동");
		a1.setId(31011);
		a1.setSubject("수화");
		
		System.out.println(a1);
		
		//홍길동이 입실하셨습니다.
		//우선 입퇴실 관리 클래스를 생성해야지만 메소드 활용 가능
		Lmanager ma = new Lmanager();
		//System.out.println(ma.insti);
		System.out.println(ma.buildYear);
		Lmanager.enter(a1);

		ma.in(a1);

	}

}
