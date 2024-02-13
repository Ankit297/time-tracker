package com.cetpa.admin.repository;

import java.util.List;

import com.cetpa.entity.Employee;

public interface EmployeeRespository 
{
	void saveEmployee(Employee employee);
	Employee getEmployee(int eid);
	void deleteEmployee(Employee employee);
	void updateEmployee(Employee empold, Employee empnew);
	List<Employee> getList();
}
