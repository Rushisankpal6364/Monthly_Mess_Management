package CustRepo_Package;
import java.util.List;
import Customer_Package.Customer;
import Exception_Package.InvalidEmail;
import Exception_Package.UserNotFound;
import Exception_Package.InvalidCredentials;



public class CustRepo {
	
	public static Customer findbyemail(String email, List<Customer>Customers)throws UserNotFound{
		Customer c=new Customer(email);
		int i=Customers.indexOf(c);
		if(i==-1) {
			throw new UserNotFound("User Not Found......!");
		}
		return Customers.get(i);
		
	}
	
	
	public static Customer InvalidCredentials(String email,String Password,List<Customer>Customers)throws InvalidCredentials{
		boolean flag=false;
		Customer c=null;
		for(Customer c1:Customers) {
			if(c1.getEmail().equals(email) && c1.getPassword().equals(Password));
			flag=true;
			c=c1;
			break;
		}
		if(!flag) {
			throw new InvalidCredentials("Invalid Credentials");
		}
		return c;
		
	}

}
