package com.te.Employee.Service;

import java.util.List;
import com.te.Employee.DTO.EmployeeDTO;

public interface EmpService {
	public EmployeeDTO authEmp(int id, String name);

	public EmployeeDTO getEmp(int id);

	public boolean deleteEmp(int id);

	public boolean addEmp(EmployeeDTO edto);

	public boolean updateRec(EmployeeDTO edto);

	public List<EmployeeDTO> getAllEmp();
}
