package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.ApiRepo;
@Service
public class ApiService {
	 @Autowired
     ApiRepo r;
     public Employee saveDetails(Employee e) {
   	  return r.save(e);
     }
     public List<Employee> getDetails(){
   	  return r.findAll();
     }
     public Optional<Employee> getDetails(int id){
      	  return r.findById(id);
        }
	

}
