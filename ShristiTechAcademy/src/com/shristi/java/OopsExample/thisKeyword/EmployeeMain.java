package com.shristi.java.OopsExample.thisKeyword;

public class EmployeeMain {

	public static void main(String[] args) {
	    Employee employee = new Employee();
	    employee.empName = "Manoj";
	    employee.empId = 1;
	    employee.salary = 30000;    
        employee.getDetails();
        System.out.println(employee.greet("Manoj"));
		System.out.println("*********************************");
	    
	    Employee employee1 = new Employee();
	    employee1.empName = "Moni";
	    employee1.empId = 2;
	    employee1.salary = 90000;
	    employee1.getDetails();
        System.out.println(employee1.greet("Moni"));
		System.out.println("*********************************");
	    
	    Employee employee2 = new Employee();
	    employee2.empName = "Vaisha";
	    employee2.empId = 3;
	    employee2.salary = 60000;
	    employee2.getDetails();
        System.out.println(employee2.greet("Vaisha"));
		System.out.println("*********************************");
	    
//	    Employee employee3 = employee2;
//	    System.out.println("Employee3 : " +employee3);
//	    employee2 = null;
//	    System.out.println("Employee2 : " + employee2);
		}

}
