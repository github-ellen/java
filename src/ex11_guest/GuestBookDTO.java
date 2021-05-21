package ex11_guest;

public class GuestBookDTO {
	// 데이터를 담아야하기에 테이블 구조와 동일하게 맞추기
	// 은닉화 : private 으로 생성
	private int seq;
	private String name;
	private String mail;
	private String pw;
	private String content;
	private String regdate;

	public GuestBookDTO() {
		super();
	}

	public GuestBookDTO(String name, String mail, String pw, String content) {
		super();
		this.name = name;
		this.mail = mail;
		this.pw = pw;
		this.content = content;
	}

	public GuestBookDTO(int seq, String name, String mail, String pw, String content) {
		super();
		this.seq = seq;
		this.name = name;
		this.mail = mail;
		this.pw = pw;
		this.content = content;
	}
	
	public GuestBookDTO(int seq, String name, String mail, String pw, String content, String regdate) {
		super();
		this.seq = seq;
		this.name = name;
		this.mail = mail;
		this.pw = pw;
		this.content = content;
		this.regdate = regdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "GuestBookDTO [seq=" + seq + ", name=" + name + ", mail=" + mail + ", pw=" + pw + ", content=" + content
				+ ", regdate=" + regdate + "]";
	}

}
