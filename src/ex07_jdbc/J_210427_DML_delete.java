package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J_210427_DML_delete {

	public static void main(String[] args) {
		//데이터 삭제 : DELETE
		
		//첫번째
		Connection conn = DBConn.getConn();
		PreparedStatement preSt = null;
		//다섯번째 
		String itemcode = "8801";
		//세번째
		String sql = "DELETE FROM ITEM\r\n"
				+ "WHERE ITEMCODE = ?";
		//네번째
		try {
			//두번째
			preSt = conn.prepareStatement(sql);
			//여섯번째
			preSt.setString(1, itemcode);
			int cnt = preSt.executeUpdate();
			System.out.println(cnt + "건 삭제");
		} catch (SQLException e) {
			System.out.println("SQL 예외");
			e.printStackTrace();
		}
		
		

	}

}
