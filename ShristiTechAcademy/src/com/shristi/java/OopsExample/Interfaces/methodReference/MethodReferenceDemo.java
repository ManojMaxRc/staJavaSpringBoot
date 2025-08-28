package com.shristi.java.OopsExample.Interfaces.methodReference;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
        Loan reference = new Loan();
		
        //Refer to non static or instance method of loan class
		Processor processor = reference :: checkDocuments;
		processor.showProcessor("Aadhar");
		
		//Refer to a static method of loan class
		processor = Loan :: printNames;
		processor.showProcessor("Manoj");
	}
}
