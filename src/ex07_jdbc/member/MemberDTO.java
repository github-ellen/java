package ex07_jdbc.member;

import java.util.Date;

public class MemberDTO {
	private String userid ;
	private String pw;
	private String birth;
	private Date regdate;
	
	public MemberDTO() {}
	
	public MemberDTO(String userid, String pw, String birth) {
		super();
		this.userid = userid;
		this.pw = pw;
		this.birth = birth;
	}

	public MemberDTO(String userid, String pw, String birth, Date regdate) {
		super();
		this.userid = userid;
		this.pw = pw;
		this.birth = birth;
		this.regdate = regdate;
	}
	public MemberDTO(String userid, String birth, Date regdate) {
		super();
		this.userid = userid;
		this.birth = birth;
		this.regdate = regdate;
	}
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", pw=" + pw + ", birth=" + birth + ", regdate=" + regdate + "]";
	}
	
	
	
	
	
}
