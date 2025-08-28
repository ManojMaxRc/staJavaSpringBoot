package com.training.quest2;

public class ZipExtractor implements Extractor {

	
	@Override
	public void extractFiles(String filename) {
		System.out.println("Extracting from zip  => files as .txt, as jpeg, as .doc files");
	}
}