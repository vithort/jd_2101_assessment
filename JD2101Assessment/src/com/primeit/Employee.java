package com.primeit;


import java.util.Date;

public class Employee {

	// Create Employee Class separately with three attributes Name, Id, Age, Salary,
	// Dept, Date OF Joining

	private String name;
	private int id;
	private int age;
	private float salary;
	private String dept;
	private Date dateOfJoin;

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public Employee(String name, int id, int age, float salary, String dept, Date dateOfJoin) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.dateOfJoin = dateOfJoin;
	}

}
