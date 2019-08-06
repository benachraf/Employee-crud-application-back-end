package com.ach.employe;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ach.employe.dao.EmployeRepository;
import com.ach.employe.entities.Employe;

@SpringBootApplication
public class EmployeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeApplication.class, args);
	}

	@Autowired
	private EmployeRepository employeApplication;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Employe> e = new ArrayList<Employe>(); e.add(new Employe(0,
		 * "Benkerri", "Achraf", "benkerriachraf@gmail.com")); e.add(new Employe(0,
		 * "Herbadji", "Anis", "herbadjianis@gmail.com")); e.add(new Employe(0,
		 * "Mahrougui", "Djamel", "mahrouguidjamel@gmail.com")); e.stream().forEach(
		 * (emp) -> { this.employeApplication.save(emp); System.out.println(emp+
		 * "          saved"); });
		 */
	}

}
