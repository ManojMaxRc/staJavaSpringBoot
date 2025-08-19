package com.shristi.java.OopsExample.abstraction.example;

public class Client {

	public static void main(String[] args) {
		
		Bank bank = new Branch1();
		bank.carLoan();
		bank.housingLoan();
		bank.educationLoan();
//		bank.adminDetails();
		
		Branch1 branch1 = (Branch1) bank;
		branch1.payDetails();
		
		bank = new SubBranch();
		bank.educationLoan();
		bank.housingLoan();
//		bank.carLoan();

		Branch2 branch2 = (Branch2) bank;
		branch2.loanTypes();
		branch2.adminDetails();
		
		SubBranch subBranch = (SubBranch) branch2;
		subBranch.carLoan();
		subBranch.depositTypes();
		
	}
}