package com.sbjpa.springbootjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbjpa.springbootjpa.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);

}
