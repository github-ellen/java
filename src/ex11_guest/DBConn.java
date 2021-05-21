package ex11_guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	// 목적 : 커넥션을 리턴하는 메소드
	// 싱글톤 패턴 : 인스턴스를 하나만 생성해서 재사용
	private static Connection conn = null; // static으로 만들지 않으면 getConn할 때마다 null값이 적용됨.
	// 지역 변수 밖에 선언해야함. 프로그램 종료할 때까지 유지.

	public static Connection getConn() {
		// 드라이브 로딩 -> 커넥션 객체 생성
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // @다음 내용(localhost) : 오라클이 설치되어있는 아이피 주소
		String user = "hr";
		String password = "hr";

		try {
			// 만약 커넥션 객체가 null이거나 커넥션이 끊어졌다면
			if (conn == null || conn.isClosed()) {
				// 드라이브 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 커넥션 객체 생성
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("db 연결 성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 객체 생성 실패");
			e.printStackTrace();
		}
		return conn;
	}

	// 접속 해제 메소드
	public static void dbClose() {
		try {
			if (conn != null || !conn.isClosed()) {
				conn.close();
				System.out.println("db 연결 해제");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
