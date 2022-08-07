package com.nagen.microservice.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagen.microservice.department.entity.Department;
import com.nagen.microservice.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("******************************Inside saveDepartment()******************************");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentDetails(Long departmentId) {
		log.info("******************************Inside findDepartmentDetails()******************************");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
