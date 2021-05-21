package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.DBConn;

public class SalesDAO {
	Map<String, Object> map;// Object�� ���� ������ String�� �� ���� �ְ� int�� �� ���� �ֱ� ������.
							// ���� �� ���� �����͸� ������ �� �ִ� ����.
	ResultSet rs = null;
	// �������� map���� ����Ʈ���� �����ϱ�
	List<Map<String, Object>> list = new ArrayList<>();

	// ���� ��ǰ �Ǹ� ����Ʈ
	List<Map<String, Object>> dayItemSalesList() {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALESDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT ");
		sb.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) ");
		sb.append("ORDER BY S.SALESDATE, S.SEQ ");

		try {
			pstmt = conn.prepareStatement(sb.toString()); // sb�� �ּҰ� �������. ������ toString ó��
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// sb�� ���� �ʵ�� Ȯ���ϸ� ������ ����
				String salesdate = rs.getString("salesdate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				// System.out.println(salesdate + "\t" + seq +"\t"+ itemcode +"\t"+ itemname
				// +"\t"+ qty +"\t"+ amount);
				map = new HashMap<>();
				map.put("salesdate", salesdate); // Ű���� String(���� �̸�)�� ��.
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				// �������� ����Ʈ�� �� �ֱ�
				list.add(map);
				// System.out.println(list);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list; // return ���� list�� �Ǿ����Ƿ� �޼ҵ��� ��ȯ�� �ٲ��ֱ�(void -> List)
	}

	List<Map<String, Object>> prodSales() {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALESDATE, S.ITEMCODE, MAX(I.ITEMNAME)ITEMNAME, SUM(s.QTY)QTY, SUM(S.AMOUNT) ");
		sb.append("AMOUNT FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) ");
		sb.append("GROUP BY S.SALESDATE, S.ITEMCODE HAVING SUM(s.QTY) >= 2 ");
		sb.append("ORDER BY S.SALESDATE, ITEMCODE ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String salesdate = rs.getString("salesdate");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				map = new HashMap<>();
				map.put("salesdate", salesdate);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	List<Map<String, Object>> dayItemSalesTotal(String salesdate) { //�ش� ��¥�� �ش�Ǵ� �Ǹ� ����Ʈ
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(I.NOTE, ' ') NOTE, ");
		sb.append("NVL(S.AMOUNT, 0) AMOUNT, I.REGDATE ");
		sb.append("FROM ITEM I LEFT JOIN ");
		sb.append("(SELECT ITEMCODE, SUM(AMOUNT)AMOUNT ");
		sb.append("FROM SALES WHERE SALESDATE = ? GROUP BY ITEMCODE) S "); //��¥�� ����ڿ��� �Է¹������ϱ�.
		sb.append("ON I.ITEMCODE = S.ITEMCODE ORDER BY ITEMCODE ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, salesdate);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				map = new HashMap<>();
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getInt("price"));
				map.put("note", rs.getString("note"));
				map.put("amount", rs.getInt("amount"));
				map.put("regdate", rs.getString("regdate"));
				list.add(map); //������� ��ü�� �ּҸ� list�� �ִ� ����.

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	List<Map<String, Object>> useView(String salesdate) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM SAMPLE_VIEW WHERE SALESDATE = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, salesdate);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				map = new HashMap<>();
				map.put("salesdate", rs.getString("salesdate"));
				map.put("itemname", rs.getString("itemname"));
				map.put("itemcode", rs.getString("itemcode"));
				map.put("qty", rs.getString("qty"));
				map.put("qty_avg", rs.getString("qty_avg"));
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	
}
