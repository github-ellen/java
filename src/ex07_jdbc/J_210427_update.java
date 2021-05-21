package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J_210427_update {

	public static void main(String[] args) {
		//수정 : update
		//첫번째
		Connection conn = DBConn.getConn();
		PreparedStatement preSt = null;
		//여섯번째
		String itemname = "칠성 사이다";
		String itemcode = "8801";
		//세번째
		String sql = "UPDATE ITEM\r\n"
				+ "SET ITEMNAME = ?\r\n"
				+ "WHERE ITEMCODE = ?";
		//네번째 - 체크 예외
		try {
			//두번째
			preSt = conn.prepareStatement(sql);
			//다섯번째 (아이템명을 입력받는 것으로)
			preSt.setString(1, itemname);
			preSt.setString(2, itemcode);
			
			//일곱번째
			int cnt = preSt.executeUpdate();
			System.out.println(cnt + "건 수정");
			
		} catch (SQLException e) {
			System.out.println("SQL 예외");
			e.printStackTrace();
		}

	}

}
