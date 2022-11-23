package com.bharadwaj.microservices.departments.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bharadwaj.microservices.departments.VO.RequestTemplate;
import com.bharadwaj.microservices.departments.entity.Department;



@Service
public interface DepartmentService {
	Department add(Department dept);
	List<Department> list();
	Department update(long id,String name);
	Department searchById(long id);
	List<RequestTemplate> listWithEmp();
	RequestTemplate specificDeptEmployee(long dept_id);
}
