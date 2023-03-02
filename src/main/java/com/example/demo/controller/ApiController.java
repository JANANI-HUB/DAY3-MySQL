package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
	 @Autowired
     ApiService s;
    
 	
 	@PostMapping("/post")
 	public Employee addInfo(@RequestBody Employee st) {
 		return s.saveDetails(st);
 	}
 	
 	@GetMapping("/get")
 	public List<Employee> fetchDetails(){
 		return s.getDetails();
 	}
 	@GetMapping("/get/{id}")
 	public Optional<Employee> fetchDetails(@PathVariable int id){
 		return s.getDetails(id);
 	}
}
