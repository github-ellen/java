package ex07_jdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J_210427_DDL_selectone {

	public static void main(String[] args) {
		//한 건만 조회
		
		//첫번째
		Connection conn = DBConn.getConn();
		PreparedStatement preSt = null;
		ResultSet rs = null;
		ItemDto idto = null;
		//다섯번째
		String itemcode = "8807";
		//세번째
		String sql = "SELECT * FROM ITEM\r\n"
				+ "WHERE ITEMCODE = ?";
		//네번째(try~catch)
		try {
			//두번째
			preSt = conn.prepareStatement(sql);
			//여섯번째
			preSt.setString(1, itemcode);
			rs = preSt.executeQuery(); //select 문은 무조건 쿼리 사용!
			//한 건만 처리해도 되는 상황이지만 8807이라는 코드가 없을 수도 있으니까
			if (rs.next()) { //데이터가 있다면
				//데이터 채워넣기
				String itemname = rs.getString("itemname");
				int price = rs.getInt("price");
				String note = rs.getString("note");
				Date regdate = rs.getDate("regdate");
				
				idto = new ItemDto(itemcode, itemname, price, note, regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(idto);
		
	}

}
