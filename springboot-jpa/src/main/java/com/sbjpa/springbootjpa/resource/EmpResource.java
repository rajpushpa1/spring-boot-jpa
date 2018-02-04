package com.sbjpa.springbootjpa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbjpa.springbootjpa.model.Employee;
import com.sbjpa.springbootjpa.repository.EmpRepository;

@RestController
@RequestMapping(value = "/rest/emp")
public class EmpResource {

	@Autowired
	EmpRepository empRepository;

	@GetMapping(value = "/getAll")
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}
	
	@PostMapping(value = "/post")
	public List<Employee> persit(@RequestBody final Employee emp){
		empRepository.save(emp);
		return empRepository.findAll();
	}
	
	@GetMapping(value = "/byName/{name}")
	public List<Employee> byName(@PathVariable final String name){
		return (List<Employee>) empRepository.findByName(name);
		
		
		
	}

}
