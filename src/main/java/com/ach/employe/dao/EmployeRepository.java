package com.ach.employe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ach.employe.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{
	public Employe findEmployeById(long id);
	
	public void deleteEmployeById(long id);
}
