package com.example.demo;

import java.io.File;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
		File file = new File("CandidateSelected.txt");
		file.createNewFile();
		System.out.println("File created");
	}

}
