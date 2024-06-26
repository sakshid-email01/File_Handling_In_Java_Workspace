package com.example.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// writing and then reading operation
		new App().writingIntoFile();

		try {
			Scanner sc = new Scanner(new File("D:\\CandidateDir\\CandidateSelected.txt"));
			String line;
			while(sc.hasNext()){
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading file");
		}

	}

	void writingIntoFile() {
		File directory = new File("D:\\CandidateDir");
		directory.mkdirs();
		System.out.println("directory created");
		File file = new File("D:\\CandidateDir\\CandidateSelected.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("error occured, while creating the file");
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write("One");
			bw.newLine();
			bw.write("Two");
			bw.newLine();
			bw.write("Three");
			bw.newLine();
			bw.write("Four");
			System.out.println("Wrting onto the file completed");
			bw.close();
		} catch (IOException e) {
			System.out.println("error occured, while creating writing onto file");
		}

	}
}
