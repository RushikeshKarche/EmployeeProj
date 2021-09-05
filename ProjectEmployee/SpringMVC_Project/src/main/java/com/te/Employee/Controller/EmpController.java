package com.te.Employee.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.te.Employee.DTO.EmployeeDTO;
import com.te.Employee.Service.EmpServiceImpl;
import com.te.Employee.Service.ServiceJdbc;

@Controller
@SessionAttributes("test")
public class EmpController {

	@Autowired
	EmpServiceImpl service;

	@Autowired
	ServiceJdbc check;

	EmployeeDTO edto;

	@GetMapping("/emp_data_form")
	public String setData() {
		return "EmpDataForm";
	}

	/*
	 * @GetMapping("/md") public String getemp() { return "DisplayEmpData"; }
	 */

	// @PostMapping("/data_inserted")
	// public String getData(EmployeeDTO edto, ModelMap map, HttpServletRequest req)
	// {
	/*
	 * edto.setId(req.getParameter("id1")); edto.setName(req.getParameter("name1"));
	 */

	/*
	 * String name2 = (String) edto.getName(); String id2 = (String) edto.getId();
	 */

	// Crud and authentication operation
	/*
	 * boolean check = service.addData(edto); if (check) {
	 * 
	 * map.addAttribute("details", edto);
	 * 
	 * return "DisplayEmpData"; } else return "EmpDataForm"; }
	 */

	// Row mapper

	@GetMapping("/displayAll")
	public String getMapping(ModelMap map, EmployeeDTO edto) {
		List<EmployeeDTO> empList = check.getAllData();
		if (empList != null) {
			map.addAttribute("mapDis", empList);
		} else
			map.addAttribute("msg", "Oops Something Went Wrooonggg...");

		return "ListDisplay";
	}

	@PostMapping("/displayAll")
	public String authEmp(@RequestParam int id, @RequestParam String name, ModelMap map, HttpServletRequest request) {
		if (service.authEmp(id, name) != null) {
			HttpSession mySession = request.getSession();
			mySession.setAttribute("myDtoObject", service.authEmp(id, name));
			map.addAttribute("edto", name);
			map.addAttribute("msg", "Logged in successfully");
			return "DisplayEmpData";
		} else {
			map.addAttribute("msg", "Invalid credentials");
			return "EmpDataForm";
		}
	}
}
