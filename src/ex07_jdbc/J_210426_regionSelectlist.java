package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J_210426_regionSelectlist {

	public static void main(String[] args) {
		//커넥션 객체 얻기
		Connection con = DBConn.getConn(); //DBConn 클래스를 사용하려면 객체 생성해야함.
											//하지만 공용으로 사용할 예정이기 때문에 static.
		List<RegionsDTO> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM REGIONS\r\n" //select 문을 사용하여 무엇을 실행할 것인가.
						+ "order by REGION_ID";
			Statement stmt = con.createStatement(); //자바와 오라클 간에 명령어를 주고 받을 수 있는 통로 생성
			ResultSet rs = stmt.executeQuery(sql); //query : select 문장을 사용하겠다.
													//resultSet : 행+열 값 반환
			while (rs.next()) {
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name");
				//받은 값들을 arraylist에 담으려면 arraylist 생성하기
				RegionsDTO rdto = new RegionsDTO();
				rdto.setRegion_id(region_id);
				rdto.setRegion_name(region_name);
				list.add(rdto);
			}
		} catch (SQLException e) {
			System.out.println("SQL 실행 실패");
			e.printStackTrace();
		}
		//System.out.println(list);
		for (RegionsDTO dto : list) {
			//System.out.println(dto);
			System.out.println(dto.getRegion_id() +" "+ dto.getRegion_name());
		}
		
		
		
		
		
	}

}
