package com.example.demo;

import java.io.File;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
		File directory = new File("D:\\CandidateDir");
		directory.mkdirs();
		System.out.println("directory created");
		File file = new File("D:\\CandidateDir\\CandidateSelected.txt");
		file.createNewFile();
		System.out.println("File created");
	}

}
