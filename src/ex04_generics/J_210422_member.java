package ex04_generics;

//로그인한 멤버
class Member { //일반 회원
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
class Vip { //VIP 회원
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

//로그인 관리 클래스
class LoginMan<T>{ //이것 또한 일반 회원, VIP 회원, 실버 회원 등등이 생기기 때문에
				//제네릭 타입 형성
	//메소드를 만들어야함.
	//출력만 할 것이기 때문에 반환값 필요없음
	void login(T mem) { //누가 입퇴장을 했는지 알아야하기 때문에 매개변수 !!
		System.out.println(mem);
		if (mem instanceof Member) {
			System.out.println(((Member)mem).getId()+"님 로그인");
		}else if (mem instanceof Vip) { //= 멤버가 vip라면,
			System.out.println(((Vip)mem).getVid()+"님 로그인");
		}
	}
//	void login(Vip vip) { 
//		System.out.println("VIP 회원 " + vip.getVid()+"님이 입장하셨습니다.");
//	}
//	
}

public class J_210422_member {

	public static void main(String[] args) {
		Member m1 = new Member("유재석", "y1234");
//		System.out.println(m1);
		Vip v1 = new Vip("강호동", "k4567");
//		System.out.println(v1);
		
		//로그인 관리 클래스를 사용하기 위해서는 객체 생성!
		LoginMan<Member> member = new LoginMan<>();
		LoginMan<Vip> vip = new LoginMan<>();
		member.login(m1); //login 메소드는 반환값이 없기 때문에 sys.out.println으로 실행 불가
		vip.login(v1);

	}

}
