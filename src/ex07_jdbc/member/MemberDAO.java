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
	
	//��ü ��ȸ : selectList
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
				//�� ������ ��Ƴ��� dto �����ϱ�
				MemberDTO mdto = new MemberDTO(userid, birth, regdate);
				mList.add(mdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//pstmt ����, conn ����
			//���ʴ�� �����ֱ�
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return mList; //mList : new ArrayList�� �ּҸ� ������ ����
	}
	
	//�� �� ��ȸ : PK ��� ! ���� â���� ������ ��ȸ�ش޶�� �Է¹��� ����
	MemberDTO selectOne(String userid){ //PK�� userid�ϱ� �Ű������� �ֱ�
		MemberDTO mdto = null; //��ȯ�� ������ �������� ����.
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
			//��ɹ��� �������ּ���!
			//pstmt.executeQuery();
			//��ɹ��� ������ �� ������� �޾ƿ� ���� �����
			rs = pstmt.executeQuery();
			if (rs.next()) {
				//������� rs�� ����Ǿ������ϱ�
				String birth = rs.getString("birth");
				String pw = rs.getString("pw");
				Date regdate = rs.getDate("regdate");
				mdto = new MemberDTO(userid, pw, birth, regdate);
				//System.out.println("ID : "+userid +", ���� : "+birth+ ", ���� ���� : "+ regdate);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			//pstmt ����, conn ����
			//���ʴ�� �����ֱ�
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
	
	//�߰�
	//insert(String userid, String pw, int birth){ //���̵�, �н�����, ������ �Է¹޾ƾ���.
	int insert(MemberDTO mdto){
		int cnt = 0;
		//1�ܰ� : DB ����
		//DBConn�� �ٸ� ��Ű���� ������ ����� �� �ִ� ������ public Ŭ�����̱� ������.
		//����, getConn�� �ۺ��� �ƴ϶�� ����� �� ����. public�̱� ������ ��� ����.
		Connection conn = DBConn.getConn();
		
		//5�ܰ�
		PreparedStatement pstmt = null;
		
		//3�ܰ� : sql�� �ۼ�
		String sql = "INSERT INTO MEMBER (USERID,PW,BIRTH)VALUES(?, ?, ?)";
		
		//4�ܰ� : try ~ catch
		try {
			//2�ܰ�
			pstmt = conn.prepareStatement(sql);
			//6�ܰ�
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPw());
			pstmt.setString(3, mdto.getBirth()); //������� �ϸ� sql ���� �ϼ�
			//pstmt.executeUpdate(); //sql �������ּ���.
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "�� ��� �Ϸ�");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			//pstmt ����, conn ����
			//���ʴ�� �����ֱ�
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				//e.printStackTrace();
			}
		}
		return cnt;
	}
	
	//����
	int update(MemberDTO mdto) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt =null;
//		String sql = "UPDATE MEMBER \r\n"
//				+ "SET PW = ?, BIRTH = ?\r\n"
//				+ "WHERE USERID = ?";
		
		//�ӵ���� up
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE MEMBER ");
		sql.append("SET PW = ?, ");
		sql.append("BIRTH = ? ");
		sql.append("WHERE USERID = ? ");
		
		System.out.println(sql); //�ڵ� toString ��� ����
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			//prepareStatement�� �ڵ����� toString ����� ���� ������. toString�� �����ؼ� �־��ְڴ�.
			pstmt.setString(1, mdto.getPw()); //�����Ͱ� ����� �� �����ϱ�!!!
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
	
	//����
	int delete(String userid) { //userid�� �˾ƾ߸� ���� �����ϱ� ������ �Ű������� userid �ֱ�.
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null ; //��� �Ŀ� finally�� close�� �� �����Ű�� ���� null �ʱ�ȭ
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
