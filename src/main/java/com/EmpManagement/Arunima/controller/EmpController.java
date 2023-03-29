package com.EmpManagement.Arunima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmpManagement.Arunima.entity.EmpEntity;
import com.EmpManagement.Arunima.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmployeeService service;
	
	// Add a new employee
	@PostMapping("/addEmp")
	public EmpEntity addEmp(@RequestBody EmpEntity e)
	{
		return service.addEmp(e);
	}
	
	// Add more than one Employee
	
	@PostMapping("/addEmployees")
	public List<EmpEntity> addAllEmployees(@RequestBody List<EmpEntity> e)
	{
		return service.addAllEmployees(e);
	}
	
	
	//Get employee by Id
	@GetMapping("/getEmployeeByID/{id}")
	public EmpEntity getEmlpoyeeById(@PathVariable int id) {
		return service.getEmlpoyeeById(id);
		
	}

	//Get employee by name
	@GetMapping("/getEmployeeByID/{name}")
	public EmpEntity getEmlpoyeeByName(@PathVariable String name) {
		return service.getEmlpoyeeByName(name);
		
	}
	
	@PutMapping("/updateEmp")
	public EmpEntity updateEmployee (@RequestBody EmpEntity e) {
		return service.updateEmployee(e);
		
	}
	
	// Delete employee
    @DeleteMapping("/deleteEmployeeById/{id}")
    public void deleteEmployeeByID(@PathVariable int id) {
        service.deleteEmployeeByID(id);
    }
	

}
