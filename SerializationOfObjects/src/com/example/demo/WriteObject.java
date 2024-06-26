package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		App a1 = new App(1, "One", "check");
		App a2 = new App(2, "Two", "check");
		
		try(FileOutputStream fos = new FileOutputStream("D:\\app.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(a1);
				obj.writeObject(a2);
				System.out.println("Object written onto the file");
			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}

	}

}