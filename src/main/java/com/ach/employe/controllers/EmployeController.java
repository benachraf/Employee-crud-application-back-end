package com.ach.employe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ach.employe.dao.EmployeRepository;
import com.ach.employe.entities.Employe;
import com.ach.employe.exceptions.RessourceNotFoundException;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/employees")
public class EmployeController {
	@Autowired
	private EmployeRepository employeRepository;
	
	@GetMapping("/")
	public List<Employe> getAllEmployes(){
		return this.employeRepository.findAll();
	}
	
	@PostMapping("/")@ResponseStatus(value = HttpStatus.CREATED)
	public Employe addEmploye(@RequestBody Employe emp) {
		return this.employeRepository.save(emp);
	}
	
	@GetMapping("/{id}")
	public Employe getEmploye(@PathVariable(name = "id") String id) throws RessourceNotFoundException {
		
		try {
			return employeRepository.findEmployeById(Long.parseLong(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RessourceNotFoundException("employee not found"); 
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employe> updateEmploye(@PathVariable(name="id") String id, @RequestBody Employe emp) throws Exception {
		long idd= Long.parseLong(id);
		Employe e = this.employeRepository.findById(idd).orElseThrow(
				() -> new RessourceNotFoundException("ressource not found")
				);
		e.setId(idd);
		
		return ResponseEntity.ok(this.employeRepository.save(e));
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteEmploye(@PathVariable(name="id") String id) throws RessourceNotFoundException {
		try {
			this.employeRepository.deleteById(Long.parseLong(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RessourceNotFoundException("employee not found");
		}
	}

}
