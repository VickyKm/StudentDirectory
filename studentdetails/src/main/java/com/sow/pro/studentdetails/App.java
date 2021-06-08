package com.sow.pro.studentdetails;

//import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws Exception, FileNotFoundException, IOException {

		String name, branch, city;
		int roll, age;

		Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Student Data Directory:: ");
		

		int choice;

		Loop:
		
		do {
			System.out.println("To Create Student Data, Enter value 1");
			System.out.println("To Display Student Data, Enter value 2");
			System.out.println("To Exit, Enter value 3");
			System.out.println("Menu, Enter value 4");

			System.out.println("Enter your choice::");

			

			choice = scan.nextInt();// accept user input

			switch (choice) {
			case 1:
				create(scan);

		
				break;
			case 2:
				display();
				break;
			case 3:
				System.out.println("Exiting the application");
				System.exit(0);
			case 4:

				
				continue Loop;
			}
		} while (choice != 3);
		scan.close();

		{

			Scanner sc = new Scanner(System.in);
			System.out.println("::Welcome to Student Data Directory::");

			// menu driven template
			// while(true){
			System.out.println("To Create Student Data, Enter value 1");
			System.out.println("To Display Student Data, Enter value 2");
			System.out.println("To Exit, Enter value 3");
			System.out.println("Menu, Enter value 4");

			System.out.println("Enter your choice::");

			choice = sc.nextInt();// accept user input*
			sc.close();
		}
	}

	private static void display() throws FileNotFoundException, IOException {
		System.out.println("Enter the student name whose details u want?");
		Scanner nr = new Scanner(System.in);
		String detail = nr.nextLine();
		FileReader reader = new FileReader("C:\\Development_Avecto\\httpclasses\\Details.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line;
		boolean flag = false;
		while ((line = bufferedReader.readLine()) != null) {

			if (line.contains(detail)) {
				System.out.println(line);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Details does not exist");
		}
		reader.close();
	}

	private static void create(Scanner scan) throws IOException {
		String name;
		String branch;
		String city;
		int roll;
		int age;
		System.out.println("Enter name :");
		name = scan.next();
		System.out.print("Enter Age: ");
		age = scan.nextInt();
		System.out.print("Enter Roll Number: ");
		roll = scan.nextInt();
		System.out.print("Enter Branch: ");
		branch = scan.next();

		System.out.print("Enter City: ");
		city = scan.next();
		File file = new File("Details.txt");
		FileWriter fr = new FileWriter(file, true);
		fr.write(name);
		fr.append(",");
		fr.write(age);
		fr.append(",");
		fr.write(roll);
		fr.append(",");
		fr.write(branch);
		fr.append(",");
		fr.write(city);
		fr.append(",");
		fr.append("\n");
		fr.close();
	}
}
