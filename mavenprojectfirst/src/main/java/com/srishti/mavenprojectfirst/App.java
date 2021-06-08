package com.srishti.mavenprojectfirst;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintStream;
//import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Scanner sc = new Scanner(System.in);
	    int choice; 
	    loop:
	    do
	    {
	       System.out.print("Enter 1.Create, 2.Display, 3.Exit  4.Menu : ");
	       choice = sc.nextInt();
	       switch(choice){
	            case 1:
			create();
	
	               break;

	            case 2:
			display();
	               
	               break;
	             
	            case 3:
		               System.out.println("exited");
		               System.exit(0);
		               break;

	            case 4:
	               //System.out.println("Enter 1.Create, 2.Display, 3.Exit  4.Menu : ");
	               continue loop;
	          }
	         // System.out.println("Enter Create or Display or Exit or Menu :");
	     }while(choice!=3);
	     
	    
	    sc.close();
    }

	private static void display() throws FileNotFoundException, IOException {
		System.out.println("Enter the student name whose details u want?");
		Scanner nm = new Scanner(System.in);
		String disname = nm.nextLine();
		FileReader reader = new FileReader("studentData.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
   
		String line;
		boolean flag = false;
            while ((line = bufferedReader.readLine()) != null) {
//	            	   String[] words = line.split(",");
//	            	   System.out.println(words[0]);
		   if(line.contains(disname)) {
		   System.out.println(line);
		   flag=true;
		   break;
		   }
            }
            if(flag==false) {
		   System.out.println("Details does not exist");
            }
            reader.close();
	}

	private static void create() throws IOException {
		System.out.println("Enter student Name:");
		   Scanner sname = new Scanner(System.in);
		   String name =sname.nextLine();
		   System.out.println("Enter student Age:");
		   //Scanner sage = new Scanner(System.in);
		   String age =sname.nextLine();
		   System.out.println("Enter student Gender:");
		   Scanner sgender = new Scanner(System.in);
		   String gender =sgender.nextLine();
		   System.out.println("Enter student City:");
		   Scanner scity = new Scanner(System.in);
		   String city =scity.nextLine();
		   System.out.println("Enter student Email:");
		   Scanner semail = new Scanner(System.in);
		   String email =semail.nextLine();
		   System.out.println("Enter student Dept:");
		   Scanner sdept = new Scanner(System.in);
		   String dept =sdept.nextLine();
		   System.out.println("Enter student cgpa:");
		   Scanner scgpa = new Scanner(System.in);
		   String cgpa =scgpa.nextLine();
		   

		   File file = new File("studentData.txt");
		   FileWriter fr = new FileWriter(file, true);
		   fr.write(name);
		   fr.append(",");
		   fr.write(age);
		   fr.append(",");
		   fr.write(gender);
		   fr.append(",");
		   fr.write(city);
		   fr.append(",");
		   fr.write(email);
		   fr.append(",");
		   fr.write(dept);
		   fr.append(",");
		   fr.write(cgpa);
		   fr.append("\n");
		   fr.close();
	}
}
