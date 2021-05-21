package ex07_jdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J_210427_DDL_selectone {

	public static void main(String[] args) {
		//�� �Ǹ� ��ȸ
		
		//ù��°
		Connection conn = DBConn.getConn();
		PreparedStatement preSt = null;
		ResultSet rs = null;
		ItemDto idto = null;
		//�ټ���°
		String itemcode = "8807";
		//����°
		String sql = "SELECT * FROM ITEM\r\n"
				+ "WHERE ITEMCODE = ?";
		//�׹�°(try~catch)
		try {
			//�ι�°
			preSt = conn.prepareStatement(sql);
			//������°
			preSt.setString(1, itemcode);
			rs = preSt.executeQuery(); //select ���� ������ ���� ���!
			//�� �Ǹ� ó���ص� �Ǵ� ��Ȳ������ 8807�̶�� �ڵ尡 ���� ���� �����ϱ�
			if (rs.next()) { //�����Ͱ� �ִٸ�
				//������ ä���ֱ�
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
