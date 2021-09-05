package com.te.Employee.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.te.Employee.DTO.EmployeeDTO;

public class EmpRowMapper implements RowMapper<EmployeeDTO>{

	public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDTO edto = new EmployeeDTO();
		edto.setId(rs.getString(1));
		edto.setName(rs.getString(2));
		return edto;
	}
}
