package com.thevarungupta.ProjectHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_emp")
public class Employee {
	@Id
	private int id;
	@Column(name = "first_name")
	private String name;
	private String email;
	private int age;
	private int salary;
	
	public Employee() {}

	public Employee(int id, String name, String email, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

}
