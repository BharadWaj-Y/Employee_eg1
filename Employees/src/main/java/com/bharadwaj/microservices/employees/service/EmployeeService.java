package com.bharadwaj.microservices.employees.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bharadwaj.microservices.employees.VO.ResponseTemplate;
import com.bharadwaj.microservices.employees.entity.Employee;



@Service
public interface EmployeeService {
	Employee add(Employee emp);
	List<Employee> list();
	Employee searchById(long id);
	ResponseTemplate empWithDept(long empId);
	Employee assignDepartment(long empId, long deptId);
	List<Employee> getByDeptId(long dept_id);
	List<Employee> getEmployeeByDepartmentWithDescAge(long dept_id);
}
