package com.te.Employee.DTO;

import java.io.Serializable;
//import lombok.Data;

public class EmployeeDTO implements Serializable {
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
