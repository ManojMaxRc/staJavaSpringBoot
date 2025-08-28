package com.training.quest3;

public class CompressorMain {

	public static void main(String[] args) {
		
		FileCompressor fileCompressor = new ZipCompressor();
		fileCompressor.compressFile("Java", "Spring");
		
		FileCompressor fileCompressor1 = new JarCompressor();
		fileCompressor1.compressFile("Python", "React");
		
		FileCompressor fileCompressor2 = new RarCompressor();
		fileCompressor2.compressFile("SQL", "PostMan");
	}
}