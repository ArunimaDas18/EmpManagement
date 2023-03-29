package com.EmpManagement.Arunima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmpManagement.Arunima.entity.EmpEntity;
import com.EmpManagement.Arunima.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	

	public EmpEntity addEmp(EmpEntity e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	public List<EmpEntity> addAllEmployees(List<EmpEntity> e) {
		// TODO Auto-generated method stub
		return repo.saveAll(e);
	}

	public EmpEntity getEmlpoyeeById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public EmpEntity getEmlpoyeeByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	public EmpEntity updateEmployee(EmpEntity e) {
		// TODO Auto-generated method stub
		
		return repo.save(e);
	}

	public void deleteEmployeeByID(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);;
		
		
	}

	
	

}
