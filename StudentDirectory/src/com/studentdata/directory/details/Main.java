package com.studentdata.directory.details;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main {

	public static void main(String[] args) throws Exception,IOException,FileNotFoundException{
  
		String name, dept, email;	
	    String age;
		String reg; 
	
	Scanner data= new Scanner(System.in);
     System.out.println("STUDENT DATA DIRECTORY: ");
     
     int option;
     
     Loop:
    	 
    	 do {
    		 System.out.println("1 => Create Student Details");
    		 System.out.println("2 => Display Student Details");
    		 System.out.println("3 => Exit");
    		 System.out.println("4 => Menu");
    	
    		 System.out.println("Enter your Option:");
    		 option = data.nextInt();
    		 
    		
    		 
    		 switch(option) {
    		 case 1:
    			 create(data);
    			break;
    			
    		 case 2:
    			 display();
    				 /*}catch(FileNotFoundException e) {
    				 System.out.println("Student doesn't exist");
    				 e.printStackTrace();
    			 }*/
    			
    			/* File fo = new File("Student Directory.txt");
    			 Scanner reader = new Scanner(fo);
    			 while(reader.hasNextLine()) {
    				 String filedata = reader.nextLine();
    				 System.out.println(filedata);
    			 }*/
    			 break;
    			 
    		 case 3:
    			 System.out.println("Exit the application");
    			 System.exit(0);
    			break;
    			 
    		 case 4:
    			 continue Loop;
    			 
    			
    		 }
    		 
    	 }while(option!=3);
    		 data.close();
    	 }

	private static void create(Scanner data) throws IOException {
		String name;
		String dept;
		String email;
		String age;
		String reg;
		System.out.println("Name:  ");
		 name= data.next();
		 System.out.println("Reg no: ");
		 reg=data.next();
		 System.out.println("Age:");
		 age=data.next();
		 System.out.println("Dept:");
		 dept = data.next();
		 System.out.println("e-Mail:");
		 email = data.next();
		 
		 
		File file = new File("Student Directory.txt");
		FileWriter fw = new FileWriter(file,true);
		fw.write(name);
		fw.append(",");
		fw.write(reg);
		fw.append(",");
		fw.write(age);
		fw.append(",");
		fw.write(dept);
		fw.append(",");
		fw.write(email);
		fw.append("\n");
		fw.close();
	}

	private static void display() throws FileNotFoundException, IOException {
		System.out.println("Enter the Name of the Student:");
		// try {
			 Scanner rn = new Scanner(System.in);
			 String givenname = rn.nextLine();
			 FileReader reader = new FileReader("Student Directory.txt");
			 BufferedReader objreader = new BufferedReader(reader);
			 
			 String Currentline;
			 boolean flag =false;
			 
			 while((Currentline = objreader.readLine())!=null) {
				 if(Currentline.contains(givenname)) {
				 System.out.println(Currentline);
				 flag=true;
				 break;
			 }
			 }
				 if(flag==false){
				 System.out.println("Student doesn't exist");
			
			 }
			 reader.close();
	}
     
	}


