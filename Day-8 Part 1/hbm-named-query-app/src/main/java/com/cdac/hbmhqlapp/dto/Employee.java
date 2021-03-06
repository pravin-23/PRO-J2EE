package com.cdac.hbmhqlapp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emp")
@NamedQueries(@NamedQuery(name = "selAll",query = "from Employee"))
@NamedNativeQueries(@NamedNativeQuery(name = "selAll_1",query = "select * from emp",resultClass = Employee.class))
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_name")
	private String empName;
	private String dept;
	@Column(name = "basic_salary")
	private double basicSalary;
	@Column(name = "hire_date")
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String dept, double basicSalary, Date hireDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.basicSalary = basicSalary;
		this.hireDate = hireDate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return empId + " " + empName + " " + dept + " " + basicSalary+ " " + hireDate;
	}
	
	
	
}
