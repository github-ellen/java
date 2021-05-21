package ex01_class;
//회원 클래스
class Member {
	//은닉화하는 이유는 무엇일까요오오옹
	private String id ;
	private String pw ; //비밀번호는 사적인 내용이기 때문에 읽기 기능을 없애고 싶다면 getter 삭제
	private int birth ;
	private double height ;
	
	//생성자 : 클래스의 이름과 같음
	//생성자는 두 개 이상 만들 수 있담.
	//객체가 생성될 때 실행되는 메소드
	//반드시 객체가 생성될 때 생성자가 실행되어야한다.
	
	//기본 생성자 : 매개변수가 없는 것.
	//생성자가 없으면 컴파일러가 기본 생성자 생성.
	//생성자가 있으면 컴파일러가 기본 생성자 생성 X.
	
	
	Member(String id, String pw, int birth, double height){ //반환값 없음, 매개변수는 있을 수도 없을 수도 있음
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.height = height;
	}
	
	//setter : set+필드이름(첫 글자는 대문자)
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
	//getter : get+필드이름(첫 글자는 대문자)
	String getId() { 
		return id;
	}
	String getPw() { //두 자리만 읽어서 리턴하고 싶다면
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
		Member health = new Member("fit","1004",9388,180); //아래 4개의 줄을 한 줄로 줄일 수 있음
//		health.setId("fit");
//		health.setPw("1004");
//		health.setBirth(9388);
//		health.setHeight(180);
		
		
		
		System.out.println("아이디 : " + health.getId());
		System.out.println("비밀번호 : " + health.getPw());
		System.out.println("생년월일 : " + health.getBirth());
		
//		System.out.println("0123456".substring(3));
//		System.out.println("0123456".substring(0,3));
//		System.out.println("0123456".substring(2,5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
