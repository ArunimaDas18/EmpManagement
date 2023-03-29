package com.EmpManagement.Arunima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmpManagement.Arunima.entity.EmpEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmpEntity,Integer> {

	EmpEntity findByName(String name);

}
