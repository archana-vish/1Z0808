package com.oca.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
	
	private String name;
	private double salary;
	private int rating;
	
	Employee(String name, double salary, int rating) {
		this.name = name;
		this.salary = salary;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getRating() {
		return rating;
	}
	
	public String toString() {
		return (name + " :: salary :: " + salary + " :: rating :: " + rating);
	}
	
	public static void main(String...strings ) {
		
		Employee e1 = new Employee("Chase", 9999.00, 5);
		Employee e2 = new Employee("Skye", 10000.00, 4);
		Employee e3 = new Employee("Zuma", 5555.00, 3);
		Employee e4 = new Employee("Rocky", 99999.00, 5);
		
		List<Employee> allEmployees = new ArrayList<>();
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		allEmployees.add(e4);
		
		//testEmployees(allEmployees, new EmployeeCheckerClass());
		
		testEmployeesWithPredicate(allEmployees, emp -> emp.getSalary() > 2000);
		
		allEmployees.removeIf(emp -> emp.getName().startsWith("Z"));
		
		System.out.println(allEmployees);
		
		
	}
	
	public static void testEmployees(List<Employee> employees, EmployeeChecker ec) {
		for (Employee employee : employees) {
			if (ec.check(employee)) {
				System.out.println(employee);
			}
		}
	}
	
	public static void testEmployeesWithPredicate(List<Employee> employees, Predicate<Employee> ec) {
		for (Employee employee : employees) {
			if (ec.test(employee)) {
				System.out.println(employee);
			}
		}
	}

}
