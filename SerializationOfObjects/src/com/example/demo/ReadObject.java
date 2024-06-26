package com.example.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try (FileInputStream FIO = new FileInputStream("D:\\app.dat")) {
			try (ObjectInputStream obj = new ObjectInputStream(FIO)) {
				App a1 = (App) obj.readObject();
				App a2 = (App) obj.readObject();
				System.out.println("Object 1: "+a1);
				System.out.println("Object 1: "+a2);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
