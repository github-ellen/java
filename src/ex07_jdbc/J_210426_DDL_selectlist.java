package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J_210426_DDL_selectlist {
	static Connection conn;
	public static void main(String[] args) {
		//����Ŭ DB ����
		//����Ŭ���� �����ϴ� Ŭ���� ����
		//Connection conn = null; //���� �����ν� �ݵ�� �ʱ�ȭ �ʿ�.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̺� �ε� ����"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); //����Ŭ�� �����ϱ� ���� ���
																									//@localhost�� �ٲ� �� ����.
			System.out.println("����Ŭ ���� ����"); //���ݺ��� SQL ��� ��� ����
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("����Ŭ ���� ����");
			e.printStackTrace();
		}
		if (conn ==null)
			return ;//Ŀ�ؼ� ���� ��, ����
		
		//DB ���� SELECT
		//������ ���̽��� ������ �� �� �ִ� Ŭ������ ����
		List<Countries> list = new ArrayList<> ();
		ResultSet resultS = null ;
		Statement stateM = null ;
		try {
			stateM = conn.createStatement();
			String sql = "SELECT * FROM COUNTRIES";
			resultS = stateM.executeQuery(sql); //���(��� ��)�� ��ü�� ����
			//System.out.println(resultS);
			//�ݺ����� �̿��Ͽ� �ϳ��� ����������
			while (resultS.next()) {
				String country_id = resultS.getNString("country_id");
				String country_name = resultS.getNString("country_name");
				int region_id = resultS.getInt("region_id");
				Countries cot = new Countries(country_id, country_name,region_id);
				list.add(cot);
			}
			
		} catch (SQLException e) {
			System.out.println("SQL�� ����");
			e.printStackTrace();
		} finally { //Ŀ�ؼ� �Ŀ� ���ܰ� �߻��ϴ��� �� �ϴ��� ������ ����.
			try {
				if (resultS != null) resultS.close();
				if (stateM != null) stateM.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		//�迭��Ų ���� ���
		//System.out.println(list);
//		for (int i = 0 ; i <list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
//		for (int i = 0 ; i <list.size() ; i++) {
//			Countries c = list.get(i);
//			System.out.println(c.getCountry_id() +" "+ c.getCountry_name()+" "+ c.getRegion_id());
//		}
		
		for (Countries c : list) {
			System.out.println(c.getCountry_id() +" "+ c.getCountry_name()+" "+ c.getRegion_id());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
