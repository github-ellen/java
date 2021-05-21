package ex07_jdbc;

import java.util.Date;

public class EmployeesDTO {
	//DTO : 데이터를 담아서 옮기는 목적
	//아이디, 성, 월급 조회
	private int employee_id;
	private String first_name;
	private Date hire_date;
	private String last_name;
	private int Salary;
	
	public EmployeesDTO () {}
	
	public EmployeesDTO(int employee_id, String first_name, Date hire_date, int salary) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.hire_date = hire_date;
		this.Salary = salary;
	}


	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	@Override
	public String toString() {
		return "EmployeesDTO [employee_id=" + employee_id + ", first_name=" + first_name + ", hire_date=" + hire_date
				+ ", Salary=" + Salary + "]";
	}

	

	
	
	
	
	
	
	
}
