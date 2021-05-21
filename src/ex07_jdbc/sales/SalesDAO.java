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
	Map<String, Object> map;// Object로 넣은 이유는 String이 들어갈 때가 있고 int가 들어갈 때가 있기 때문에.
							// 매출 한 건의 데이터를 저장할 수 있는 공간.
	ResultSet rs = null;
	// 만들어놓은 map형을 리스트형을 정리하기
	List<Map<String, Object>> list = new ArrayList<>();

	// 일일 상품 판매 리스트
	List<Map<String, Object>> dayItemSalesList() {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALESDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT ");
		sb.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) ");
		sb.append("ORDER BY S.SALESDATE, S.SEQ ");

		try {
			pstmt = conn.prepareStatement(sb.toString()); // sb는 주소가 들어있음. 때문에 toString 처리
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// sb에 적은 필드명 확인하며 적으면 쉽쥬
				String salesdate = rs.getString("salesdate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				// System.out.println(salesdate + "\t" + seq +"\t"+ itemcode +"\t"+ itemname
				// +"\t"+ qty +"\t"+ amount);
				map = new HashMap<>();
				map.put("salesdate", salesdate); // 키에는 String(열의 이름)이 들어감.
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				// 만들어놓은 리스트에 값 넣기
				list.add(map);
				// System.out.println(list);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list; // return 값이 list가 되었으므로 메소드의 반환값 바꿔주기(void -> List)
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

	List<Map<String, Object>> dayItemSalesTotal(String salesdate) { //해당 날짜에 해당되는 판매 리스트
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(I.NOTE, ' ') NOTE, ");
		sb.append("NVL(S.AMOUNT, 0) AMOUNT, I.REGDATE ");
		sb.append("FROM ITEM I LEFT JOIN ");
		sb.append("(SELECT ITEMCODE, SUM(AMOUNT)AMOUNT ");
		sb.append("FROM SALES WHERE SALESDATE = ? GROUP BY ITEMCODE) S "); //날짜는 사용자에게 입력받을꺼니까.
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
				list.add(map); //만들어진 객체의 주소를 list에 넣는 개념.

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
