package com.training.quest3;

public class JarCompressor implements FileCompressor{

	@Override
	public void compressFile(String... files) {
		for (String file : files) {
			System.out.println(file + " Compressed as JAR files");
		}	
	}
}