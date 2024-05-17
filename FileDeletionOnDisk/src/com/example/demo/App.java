package com.example.demo;

import java.io.File;
import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\CandidateDir\\CandidateSelected.txt");
		if(file.delete()){
			System.out.println("Deletion is successful");
		}else{
			System.out.println("Error while deleting");
		}
	}

}
