package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex07_jdbc.DBConn;

public class MemberDAO {
	
	//전체 조회 : selectList
	List<MemberDTO> selectList(){
		List<MemberDTO> mList = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBER";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String userid = rs.getString("userid");
				String birth = rs.getString("birth");
				Date regdate = rs.getDate("regdate");
				//위 값들을 모아놓을 dto 생성하기
				MemberDTO mdto = new MemberDTO(userid, birth, regdate);
				mList.add(mdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//pstmt 생성, conn 생성
			//차례대로 끊어주기
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return mList; //mList : new ArrayList의 주소를 가지고 있음
	}
	
	//한 건 조회 : PK 사용 ! 메인 창에서 누구를 조회해달라고 입력받을 예정
	MemberDTO selectOne(String userid){ //PK가 userid니까 매개변수에 넣기
		MemberDTO mdto = null; //반환할 것으로 만들어놓은 변수.
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int cnt = 0;
		String sql = "SELECT * FROM MEMBER\r\n"
				+ "WHERE USERID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			cnt = pstmt.executeUpdate();
			//명령문을 실행해주세요!
			//pstmt.executeQuery();
			//명령문을 실행한 뒤 결과값을 받아올 변수 만들기
			rs = pstmt.executeQuery();
			if (rs.next()) {
				//결과값이 rs에 저장되어있으니까
				String birth = rs.getString("birth");
				String pw = rs.getString("pw");
				Date regdate = rs.getDate("regdate");
				mdto = new MemberDTO(userid, pw, birth, regdate);
				//System.out.println("ID : "+userid +", 생일 : "+birth+ ", 가입 일자 : "+ regdate);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			//pstmt 생성, conn 생성
			//차례대로 끊어주기
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mdto;
		
		
	}
	
	//추가
	//insert(String userid, String pw, int birth){ //아이디, 패스워드, 생일을 입력받아야함.
	int insert(MemberDTO mdto){
		int cnt = 0;
		//1단계 : DB 접속
		//DBConn가 다른 패키지에 있지만 사용할 수 있는 이유는 public 클래스이기 때문에.
		//만약, getConn이 퍼블릭이 아니라면 사용할 수 없음. public이기 때문에 사용 가능.
		Connection conn = DBConn.getConn();
		
		//5단계
		PreparedStatement pstmt = null;
		
		//3단계 : sql문 작성
		String sql = "INSERT INTO MEMBER (USERID,PW,BIRTH)VALUES(?, ?, ?)";
		
		//4단계 : try ~ catch
		try {
			//2단계
			pstmt = conn.prepareStatement(sql);
			//6단계
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPw());
			pstmt.setString(3, mdto.getBirth()); //여기까지 하면 sql 문장 완성
			//pstmt.executeUpdate(); //sql 실행해주세요.
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건 등록 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			//pstmt 생성, conn 생성
			//차례대로 끊어주기
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				//e.printStackTrace();
			}
		}
		return cnt;
	}
	
	//수정
	int update(MemberDTO mdto) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt =null;
//		String sql = "UPDATE MEMBER \r\n"
//				+ "SET PW = ?, BIRTH = ?\r\n"
//				+ "WHERE USERID = ?";
		
		//속도향상 up
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE MEMBER ");
		sql.append("SET PW = ?, ");
		sql.append("BIRTH = ? ");
		sql.append("WHERE USERID = ? ");
		
		System.out.println(sql); //자동 toString 기능 내재
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			//prepareStatement는 자동으로 toString 기능이 없기 때문에. toString을 실행해서 넣어주겠다.
			pstmt.setString(1, mdto.getPw()); //데이터가 저장된 곳 생각하기!!!
			pstmt.setString(2, mdto.getBirth());
			pstmt.setString(3, mdto.getUserid());
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			//e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				//e.printStackTrace();
			}
		}
		return cnt;
	}
	
	//삭제
	int delete(String userid) { //userid를 알아야만 삭제 가능하기 때문에 매개변수에 userid 넣기.
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null ; //사용 후에 finally로 close할 때 적용시키기 위해 null 초기화
		String sql = "DELETE FROM MEMBER\r\n"
				+ "WHERE USERID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			//e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				//e.printStackTrace();
			}
		}
		return cnt;
	}
	
	
	
	
	
	
	
	
	
}
