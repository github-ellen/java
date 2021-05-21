package ex11_guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	// ���� : Ŀ�ؼ��� �����ϴ� �޼ҵ�
	// �̱��� ���� : �ν��Ͻ��� �ϳ��� �����ؼ� ����
	private static Connection conn = null; // static���� ������ ������ getConn�� ������ null���� �����.
	// ���� ���� �ۿ� �����ؾ���. ���α׷� ������ ������ ����.

	public static Connection getConn() {
		// ����̺� �ε� -> Ŀ�ؼ� ��ü ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // @���� ����(localhost) : ����Ŭ�� ��ġ�Ǿ��ִ� ������ �ּ�
		String user = "hr";
		String password = "hr";

		try {
			// ���� Ŀ�ؼ� ��ü�� null�̰ų� Ŀ�ؼ��� �������ٸ�
			if (conn == null || conn.isClosed()) {
				// ����̺� �ε�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// Ŀ�ؼ� ��ü ����
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("db ���� ����");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̺� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ��ü ���� ����");
			e.printStackTrace();
		}
		return conn;
	}

	// ���� ���� �޼ҵ�
	public static void dbClose() {
		try {
			if (conn != null || !conn.isClosed()) {
				conn.close();
				System.out.println("db ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
