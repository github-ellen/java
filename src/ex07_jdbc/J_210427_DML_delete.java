package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J_210427_DML_delete {

	public static void main(String[] args) {
		//������ ���� : DELETE
		
		//ù��°
		Connection conn = DBConn.getConn();
		PreparedStatement preSt = null;
		//�ټ���° 
		String itemcode = "8801";
		//����°
		String sql = "DELETE FROM ITEM\r\n"
				+ "WHERE ITEMCODE = ?";
		//�׹�°
		try {
			//�ι�°
			preSt = conn.prepareStatement(sql);
			//������°
			preSt.setString(1, itemcode);
			int cnt = preSt.executeUpdate();
			System.out.println(cnt + "�� ����");
		} catch (SQLException e) {
			System.out.println("SQL ����");
			e.printStackTrace();
		}
		
		

	}

}
