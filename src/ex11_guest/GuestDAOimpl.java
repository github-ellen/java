package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestDAOimpl implements GuestDAO {

	@Override
	public int insert(GuestBookDTO gdto) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement psmt = null;
		String sql = "INSERT INTO GUEST_BOOK (SEQ, NAME, MAIL, PW, CONTENT)\r\n"
				+ " VALUES (GUEST_SEQ.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, gdto.getName());
			psmt.setString(2, gdto.getMail());
			psmt.setString(3, gdto.getPw());
			psmt.setString(4, gdto.getContent());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 예외 발생");
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int update(GuestBookDTO gdto) { //PK를 제외한 나머지를 다 수정하는 것으로 설계하기
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement psmt = null;
		String sql = "UPDATE GUEST_BOOK "
			       + "SET NAME = ?, "
		           + "MAIL = ?, PW = ?, "
		           + "CONTENT  = ? WHERE SEQ= ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, gdto.getName());
			psmt.setString(2, gdto.getMail());
			psmt.setString(3, gdto.getPw());
			psmt.setString(4, gdto.getContent());
			psmt.setInt(5, gdto.getSeq());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement psmt = null;
		String sql = "DELETE FROM GUEST_BOOK\r\n"
				+ "WHERE SEQ = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, seq);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public GuestBookDTO selectOne(int seq) {
		ResultSet rs =null;
		GuestBookDTO gdto = null;
		Connection conn = DBConn.getConn();
		PreparedStatement psmt = null ;
		String sql = "SELECT * FROM GUEST_BOOK\r\n"
				+ "WHERE SEQ = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, seq);
			rs = psmt.executeQuery(); //GuestBookDTO 변수 만들어서 rs에 넣기
			if (rs.next()) {
				gdto = new GuestBookDTO();
				gdto.setSeq(seq);
				gdto.setName(rs.getString("name"));
				gdto.setMail(rs.getString("mail"));
				gdto.setContent(rs.getString("content"));
				gdto.setRegdate(rs.getString("regdate"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block b
			e.printStackTrace();
		}
		return gdto ; //반환형이 GuestBookDTO니까 변수 만들기.
	}

	@Override
	public List<GuestBookDTO> selectList() {
		ResultSet rs = null;
		List<GuestBookDTO> glist = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement psmt = null ;
		String sql = "SELECT * FROM GUEST_BOOK ORDER BY SEQ DESC";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				GuestBookDTO gdto = new GuestBookDTO();
				gdto.setSeq(rs.getInt("seq"));
				gdto.setName(rs.getString("name"));
				gdto.setMail(rs.getString("mail"));
				gdto.setContent(rs.getString("content"));
				gdto.setRegdate(rs.getString("regdate"));
				glist.add(gdto);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return glist;
	}


}
