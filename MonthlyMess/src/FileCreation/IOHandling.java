package FileCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Customer_Package.Customer;

public class IOHandling {
	public static void writeObject(ArrayList<Customer> custs,String filename) throws IOException {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(custs);
		}
		System.out.println("Saved data");
	}
	public static ArrayList<Customer> readData(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
		ArrayList<Customer> custs=new ArrayList<>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filename))){
			custs=(ArrayList<Customer>)ois.readObject();
		}
		return custs;
	}

}
