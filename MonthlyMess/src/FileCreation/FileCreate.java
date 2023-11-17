package FileCreation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Customer_Package.Customer;




public class FileCreate {
	
	public static void main(String[] args) {
	
	//Create a new file
	
		File myFile=new File("Customer.txt");
		try {
			myFile.createNewFile();
		}catch(IOException e) {
			System.out.println("Unable to create a file...!");
			e.printStackTrace();
		}
	
		
		//Write file
		
		try {
			FileWriter fileWriter=new FileWriter("Customer.txt");
			fileWriter.write("This is the first file for Customers");
			fileWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		//Reading a file
		
		File myfile=new File("Customer.txt");
		try {
			Scanner sc=new Scanner(myFile);
			while(sc.hasNext()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
