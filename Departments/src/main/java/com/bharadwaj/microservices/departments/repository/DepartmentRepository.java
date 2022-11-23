package com.bharadwaj.microservices.departments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bharadwaj.microservices.departments.entity.Department;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	Department findById(long id);
}
