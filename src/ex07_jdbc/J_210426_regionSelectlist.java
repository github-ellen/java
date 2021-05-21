package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J_210426_regionSelectlist {

	public static void main(String[] args) {
		//Ŀ�ؼ� ��ü ���
		Connection con = DBConn.getConn(); //DBConn Ŭ������ ����Ϸ��� ��ü �����ؾ���.
											//������ �������� ����� �����̱� ������ static.
		List<RegionsDTO> list = new ArrayList<>();
		try {
			String sql = "SELECT * FROM REGIONS\r\n" //select ���� ����Ͽ� ������ ������ ���ΰ�.
						+ "order by REGION_ID";
			Statement stmt = con.createStatement(); //�ڹٿ� ����Ŭ ���� ��ɾ �ְ� ���� �� �ִ� ��� ����
			ResultSet rs = stmt.executeQuery(sql); //query : select ������ ����ϰڴ�.
													//resultSet : ��+�� �� ��ȯ
			while (rs.next()) {
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name");
				//���� ������ arraylist�� �������� arraylist �����ϱ�
				RegionsDTO rdto = new RegionsDTO();
				rdto.setRegion_id(region_id);
				rdto.setRegion_name(region_name);
				list.add(rdto);
			}
		} catch (SQLException e) {
			System.out.println("SQL ���� ����");
			e.printStackTrace();
		}
		//System.out.println(list);
		for (RegionsDTO dto : list) {
			//System.out.println(dto);
			System.out.println(dto.getRegion_id() +" "+ dto.getRegion_name());
		}
		
		
		
		
		
	}

}
