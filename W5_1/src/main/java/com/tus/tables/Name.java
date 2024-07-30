package com.tus.tables;

public class Name {
	private String firstName;
	private String dep;
	private int age;
	private double salary;
	boolean canEdit;

	public Name(String firstName, String dep, int age, double salary) {
		this.firstName = firstName;
		this.dep = dep;
		this.age = age;
		this.salary = salary;
	}

	public boolean isCanEdit() {
		return canEdit;
	}

	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



}
