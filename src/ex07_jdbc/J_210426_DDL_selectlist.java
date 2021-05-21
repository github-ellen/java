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
		//오라클 DB 연결
		//오라클에서 제공하는 클래스 파일
		//Connection conn = null; //지역 변수로써 반드시 초기화 필요.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); //오라클로 접속하기 위한 경로
																									//@localhost는 바뀔 수 있음.
			System.out.println("오라클 접속 성공"); //지금부터 SQL 언어 사용 가능
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
		if (conn ==null)
			return ;//커넥션 실패 시, 종료
		
		//DB 정보 SELECT
		//데이터 베이스를 가지고 올 수 있는 클래스가 있음
		List<Countries> list = new ArrayList<> ();
		ResultSet resultS = null ;
		Statement stateM = null ;
		try {
			stateM = conn.createStatement();
			String sql = "SELECT * FROM COUNTRIES";
			resultS = stateM.executeQuery(sql); //결과(행과 열)를 객체에 저장
			//System.out.println(resultS);
			//반복문을 이용하여 하나씩 출력해줘야함
			while (resultS.next()) {
				String country_id = resultS.getNString("country_id");
				String country_name = resultS.getNString("country_name");
				int region_id = resultS.getInt("region_id");
				Countries cot = new Countries(country_id, country_name,region_id);
				list.add(cot);
			}
			
		} catch (SQLException e) {
			System.out.println("SQL문 예외");
			e.printStackTrace();
		} finally { //커넥션 후에 예외가 발생하던지 안 하던지 무조건 끊기.
			try {
				if (resultS != null) resultS.close();
				if (stateM != null) stateM.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		//배열시킨 내용 출력
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
