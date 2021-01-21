package com.empapp.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empapp.model.entities.Employee;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer>{

}


