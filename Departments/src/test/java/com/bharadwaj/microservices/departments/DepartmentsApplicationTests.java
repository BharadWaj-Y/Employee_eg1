package com.bharadwaj.microservices.departments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bharadwaj.microservices.departments.entity.Department;
import com.bharadwaj.microservices.departments.repository.DepartmentRepository;

@SpringBootTest
class DepartmentsApplicationTests {
	 
	@Autowired
	DepartmentRepository dptRepo;
	
	private Dept_cal c = new Dept_cal();

	@Test
	void contextLoads() {
	}

	@Test
	void checkSum() {
		int expected = 15;
		int given = c.dosum(5,2 , 8);
		
		assertThat(given).isEqualTo(expected);
	}
	  
	@Test
	public void DptCreateTest() {
		
		Department  dpt = new Department();
	    dpt.setId(4);
	    dpt.setName("BA");
	    dpt.setNoOfEmp(5);
	    dptRepo.save(dpt);
	    
	    assertNotNull(dptRepo.findById(4).getId());
		
	}
	@Test
	public void testReadall() {
		List<Department> list= dptRepo.findAll();
		
		int exp2 =  4;
		assertThat(list).size().isEqualTo(exp2);
		
	}
	
	@Test
	public void testSingle() {
		
		long single = dptRepo.findById(3).getId();
		
		
	}
	
	
	
	@Test 
	public void testUpdate() {
		
		
		
	}
	
}
