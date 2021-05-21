package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class J_210427_employees {

	public static void main(String[] args) {
		//��� ���̺��� ������ 1�� �̻��� �����
		//���̵�, ��, ����, �Ի� ���� ��ȸ
		//���� ���� �������� ����
		//ù��° �۾�
		Connection conn = DBConn.getConn();
		List<EmployeesDTO> empList = new ArrayList<> ();
		try {
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, SALARY\r\n"
					+ "FROM EMPLOYEES\r\n"
					+ "WHERE SALARY >= 10000\r\n"
					+ "ORDER BY SALARY DESC";
			Statement staM = conn.createStatement();
			ResultSet rs = staM.executeQuery(sql);
			while (rs.next()) {
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				//String hire_date = rs.getString("hire_date");
				Date hire_date = rs.getDate("hire_date");
				int salary = rs.getInt("salary");
				//������ EmployeesDTO�� �ִ� �۾� �ʿ�
				//�� �Ŀ� EmployeesDTO�� ����Ʈ �۾��ϱ�
				//EmployeesDTO ��ü ����
				EmployeesDTO emp = new EmployeesDTO(employee_id,first_name,hire_date,salary);
				//emp�� ����Ʈ�� �����ϱ�
				empList.add(emp);
			}
		} catch (SQLException e) {
			System.out.println("SQL ���� �߻�");
			e.printStackTrace();
		}
		
		//�Ϸ�
		System.out.println(empList);
		for (EmployeesDTO edto : empList) {
			System.out.println(edto.getEmployee_id() +" "+edto.getFirst_name()
								+"    " + edto.getHire_date()+" " +edto.getSalary());
		}
		
		
		
	}

}
