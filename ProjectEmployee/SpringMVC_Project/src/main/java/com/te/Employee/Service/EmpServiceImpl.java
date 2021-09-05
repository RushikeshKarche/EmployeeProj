package com.te.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.te.Employee.DTO.EmployeeDTO;
import com.te.Employee.JDBC.JDBC_Class;

@Component
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	JDBC_Class jc;
	
	/*
	 * public boolean addData(EmployeeDTO edto) { //jc.insertData(edto);
	 * //jc.deleteData(edto); //jc.updateData(edto); // jc.renameData(edto); return
	 * jc.authData(edto); }
	 */

	public EmployeeDTO authEmp(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeDTO getEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addEmp(EmployeeDTO edto) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateRec(EmployeeDTO edto) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<EmployeeDTO> getAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}
}
