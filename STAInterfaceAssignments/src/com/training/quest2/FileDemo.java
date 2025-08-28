package com.training.quest2;

import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the choice for extractor : Z - Zip, J - Jar, R - Rar");
		
		String choice = input.next().toUpperCase();
		
		switch (choice) {
		case "Z":
			Extractor extractor = new ZipExtractor();
			extractor.extractFiles("Examples.zip");
			break;
			
		case "J":
			Extractor extractor1 = new JarExtractor();
			extractor1.extractFiles("Examples.jar");
			break;

		case "R":
			Extractor extractor2 = new RarExtractor();
			extractor2.extractFiles("Examples.jar");
			break;
			
		default:
			System.out.println("Invalid extractor choice");
			break;
		}
	}
}