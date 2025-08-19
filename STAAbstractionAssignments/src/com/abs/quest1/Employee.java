package com.abs.quest1;

public abstract class Employee {

	 String empName;
	 double salary;
	 int empId;
	 final String COMPANYNAME = "STA Tech Academy";
	 
	 public Employee(String empName, double salary, int empId) {
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	 }
	 
	 void printDetails() {
		 System.out.println("Employee Name : " + empName + " Salary : " + salary + " Employee ID : " +
	 empId + " Company name : " + COMPANYNAME);
	 }
	 
	 abstract  void calcBonus(double amount);
	 
	 abstract  void showProjects();
	 
	 final void showRules(){
	      officeHours();
	      System.out.println("Leave policies");
	      System.out.println("OD policies");
	} 
	 
	 private void officeHours(){
	  System.out.println("14 hours per day");
	 }
	 
	 String[] showCourses(){
		 return new String[] {"Java", "Python", "Springboot"};
	 }
}
