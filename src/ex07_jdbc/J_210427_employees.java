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
		//사원 테이블에서 월급이 1만 이상인 사원의
		//아이디, 성, 월급, 입사 일자 조회
		//월급 기준 내림차순 정렬
		//첫번째 작업
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
				//내용을 EmployeesDTO에 넣는 작업 필요
				//그 후에 EmployeesDTO를 리스트 작업하기
				//EmployeesDTO 객체 생성
				EmployeesDTO emp = new EmployeesDTO(employee_id,first_name,hire_date,salary);
				//emp를 리스트로 정리하기
				empList.add(emp);
			}
		} catch (SQLException e) {
			System.out.println("SQL 예외 발생");
			e.printStackTrace();
		}
		
		//완료
		System.out.println(empList);
		for (EmployeesDTO edto : empList) {
			System.out.println(edto.getEmployee_id() +" "+edto.getFirst_name()
								+"    " + edto.getHire_date()+" " +edto.getSalary());
		}
		
		
		
	}

}
