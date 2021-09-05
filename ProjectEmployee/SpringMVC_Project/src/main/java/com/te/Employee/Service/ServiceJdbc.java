package com.te.Employee.Service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.te.Employee.DTO.EmployeeDTO;
import com.te.Employee.JDBC.JdbcImpl;

@Component
public class ServiceJdbc {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/te/Employee/Service/Config.xml");
	JdbcImpl impl = context.getBean("daoOprImpl",JdbcImpl.class);

	public int addEmp(EmployeeDTO edto) {
		return impl.addEmp(edto);
	}
	
	public EmployeeDTO authenticate(int id,String name) {
		//System.out.println(password);
		EmployeeDTO passkey= impl.authEmp(id, name);
		if(name.equals(passkey.getName())) {
			return passkey;
		}else return null;
	}
	
	public List<EmployeeDTO> getAllData(){
		return impl.getAllEmp();
	}
}
