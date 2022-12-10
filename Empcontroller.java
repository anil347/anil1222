package com.ssd.empmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.empmanagement.entity.Employee;
import com.ssd.empmanagement.model.Employeedto;
import com.ssd.empmanagement.serviceinter.Empserviceinter;

@RestController
@RequestMapping("/emp")
public class Empcontroller {

	@Autowired
	private Empserviceinter empinter;
	
	@PostMapping("/")
	public  Employeedto saveemployee(Employeedto emp) {
		Employeedto edd=	empinter.saveemployee(emp);
		return edd;
	
	
	}
	@GetMapping("/get")
	public List  <Employeedto> getallemploye (){
		List<Employeedto> ccc=	empinter.getallemploye();
		return ccc;
	}
	@GetMapping("/pet{id}")
	public Employeedto findbyid(Long id) {
		Employeedto  nn =	empinter.findbyid(id);
		return nn;
		
	}
}
