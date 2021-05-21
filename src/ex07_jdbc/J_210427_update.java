package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J_210427_update {

	public static void main(String[] args) {
		//���� : update
		//ù��°
		Connection conn = DBConn.getConn();
		PreparedStatement preSt = null;
		//������°
		String itemname = "ĥ�� ���̴�";
		String itemcode = "8801";
		//����°
		String sql = "UPDATE ITEM\r\n"
				+ "SET ITEMNAME = ?\r\n"
				+ "WHERE ITEMCODE = ?";
		//�׹�° - üũ ����
		try {
			//�ι�°
			preSt = conn.prepareStatement(sql);
			//�ټ���° (�����۸��� �Է¹޴� ������)
			preSt.setString(1, itemname);
			preSt.setString(2, itemcode);
			
			//�ϰ���°
			int cnt = preSt.executeUpdate();
			System.out.println(cnt + "�� ����");
			
		} catch (SQLException e) {
			System.out.println("SQL ����");
			e.printStackTrace();
		}

	}

}
