package Validation_Package;
import java.util.List;
import java.util.regex.Pattern;
import Customer_Package.Customer;
import Enumm.MessPlan;
import Exception_Package.InvalidEmail;
import Exception_Package.InvalidPhoneNo;
import Exception_Package.InvalidPlan;
import Exception_Package.UserNotFound;
import Exception_Package.DuplicateEmail;


public class Validation {
	public static void validatePlan(String p) throws InvalidPlan{
		boolean flag = false;
		MessPlan[] arr=MessPlan.values();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].toString().equals(p));
			flag=true;
			break;
		}
		if(flag==false) {
			System.out.println("Invalid Plan Selected..!");
		}
	}
	
	public static void validateemail(String email)throws InvalidEmail{
		if(!(Pattern.matches("^[A-Z][0-9][a-z].*_%+-.*@gmail.com$",email)));
		throw new InvalidEmail("You Entered Invalid Email...!");
	}
	public static void DuplicateEmail(String email,List<Customer>Customers)throws DuplicateEmail,UserNotFound{
		if(Customers.contains(email)) {
			System.out.println("Duplicate Email You are not Account Holder...!");
		}
		
	}
	public static void validatePhoneno(String Phoneno)throws InvalidPhoneNo{
		
		if(!(Pattern.matches("^[0-9]",Phoneno) && Phoneno.length()==10));
		throw new InvalidPhoneNo("You Entered Invalid Phone Number..");
	}
	}

