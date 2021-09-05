package com.te.Employee.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.stereotype.Component;
import com.te.Employee.DTO.EmployeeDTO;

//@Component
public interface JDBC_Class {
	
	public EmployeeDTO authEmp(int id, String name);

	public EmployeeDTO getEmp(int id);

	public boolean deleteEmp(int id);

	public boolean addEmp(EmployeeDTO edto);

	public boolean updateRec(EmployeeDTO edto);

	public List<EmployeeDTO> getAllEmp();
	
	
	
	
	
	
	
	
	
	
	
	
	//Insert Operation
	/*
	 * public void insertData(EmployeeDTO edto) { String dburl =
	 * "jdbc:mysql://localhost:3306/emp"; String uname = "root"; String pass =
	 * "root"; String query =
	 * "INSERT INTO emp_details(emp_id,first_name) VALUES(?,?)"; Connection con; try
	 * { Class.forName("com.mysql.jdbc.Driver"); con =
	 * DriverManager.getConnection(dburl,uname,pass); PreparedStatement pst =
	 * con.prepareStatement(query); pst.setString(1,edto.getId());
	 * pst.setString(2,edto.getName()); pst.executeUpdate(); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
	
	/*
	 * // Delete Operation public void deleteData(EmployeeDTO edto) { String dburl =
	 * "jdbc:mysql://localhost:3306/emp"; String uname = "root"; String pass =
	 * "root"; String query =
	 * "DELETE FROM emp_details WHERE emp_id=? AND first_name=?"; Connection con;
	 * try { Class.forName("com.mysql.jdbc.Driver"); con =
	 * DriverManager.getConnection(dburl,uname,pass); PreparedStatement pst =
	 * con.prepareStatement(query); pst.setString(1,edto.getId());
	 * pst.setString(2,edto.getName()); pst.executeUpdate(); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
	
	/*
	 * // Update Operation public void updateData(EmployeeDTO edto) { String dburl =
	 * "jdbc:mysql://localhost:3306/emp"; String uname = "root"; String pass =
	 * "root"; String query = "UPDATE emp_details SET first_name=? WHERE emp_id=?";
	 * Connection con; try { Class.forName("com.mysql.jdbc.Driver"); con =
	 * DriverManager.getConnection(dburl,uname,pass); PreparedStatement pst =
	 * con.prepareStatement(query); pst.setString(2,edto.getId());
	 * pst.setString(1,edto.getName()); pst.executeUpdate(); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
	
	/*
	 * // Rename Operation public void renameData(EmployeeDTO edto) { String dburl =
	 * "jdbc:mysql://localhost:3306/emp"; String uname = "root"; String pass =
	 * "root"; String query = "ALTER TABLE emp_details RENAME COLUMN emp_id TO ?;";
	 * Connection con; try { Class.forName("com.mysql.jdbc.Driver"); con =
	 * DriverManager.getConnection(dburl,uname,pass); PreparedStatement pst =
	 * con.prepareStatement(query); //pst.setString(2,edto.getId());
	 * pst.setString(1,edto.getName()); pst.executeUpdate(); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
	
	/*
	 * // Authentication Operation public String pass;
	 * 
	 * public boolean authData(EmployeeDTO edto) { boolean auth = false; String
	 * dburl = "jdbc:mysql://localhost:3306/emp"; String uname = "root"; String pass
	 * = "root"; String query =
	 * "SELECT password FROM employee_form WHERE username=?;"; Connection con; try {
	 * Class.forName("com.mysql.jdbc.Driver"); con =
	 * DriverManager.getConnection(dburl, uname, pass); PreparedStatement pst =
	 * con.prepareStatement(query); // pst.setString(2,edto.getId());
	 * pst.setString(1, edto.getName()); ResultSet rs = pst.executeQuery(); while
	 * (rs.next()) { pass = rs.getString(1); if (edto.getId().equals(pass)) { return
	 * auth = true; } } } catch (Exception e) { e.printStackTrace(); } return auth;
	 * }
	 */
}
