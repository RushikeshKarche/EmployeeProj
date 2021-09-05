package com.te.Employee.JDBC;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.te.Employee.DTO.EmployeeDTO;

public class JdbcImpl {
	private JdbcTemplate template;
	
	public void setTemp(JdbcTemplate template) {
		this.template=template;
	}

	public EmployeeDTO authEmp(int id, String name) {
		RowMapper<EmployeeDTO> rowMapper = new EmpRowMapper();
		String query="SELECT * FROM employee_form WHERE id =?";
		EmployeeDTO emp=template.queryForObject(query,rowMapper,id);
		return emp;
	}

	public EmployeeDTO getEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public int addEmp(EmployeeDTO edto) {
		String query = "INSERT INTO employee_form VALUES (?,?,?,?)";
		int result = template.update(query, edto.getId(), edto.getName());
		return result;
	}

	public boolean updateRec(EmployeeDTO edto) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<EmployeeDTO> getAllEmp() {
		RowMapper<EmployeeDTO> rowMapper = new EmpRowMapper();
		String query = "SELECT * FROM employee_form;";
		List<EmployeeDTO> empD = template.query(query, rowMapper);
		return empD;
	}
}
