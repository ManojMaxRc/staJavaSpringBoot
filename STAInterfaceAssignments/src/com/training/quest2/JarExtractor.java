package com.training.quest2;

public class JarExtractor implements Extractor {

	@Override
	public void extractFiles(String filename) {
		System.out.println("Extracting from jar => files as .class files");
	}
}