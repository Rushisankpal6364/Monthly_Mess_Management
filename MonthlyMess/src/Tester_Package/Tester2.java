package Tester_Package;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import CustRepo_Package.CustRepo;
import Customer_Package.Customer;
import Enumm.MessPlan;
import Exception_Package.InvalidCredentials;
import Exception_Package.InvalidEmail;
import Exception_Package.InvalidPlan;
import FileCreation.IOHandling;


public class Tester2 {

	public static void main(String[] args) throws InvalidPlan,InvalidEmail,InvalidCredentials{
		String firstname;
		String lastname;
		String email;
		String password = null;
		String address;
		String phoneno;
		LocalDate regDate;
		LocalDate PlanEndDate;
        MessPlan plan = null;
		double final_amount;
		
		ArrayList<Customer> Customers=new ArrayList<>();
		Customers.add(new Customer(100,"rushikesh","sankpal","r@gmail.com","Rushi","Mumbai","1234", LocalDate.parse("2022-01-01"), LocalDate.parse("2022-02-02"),MessPlan.valueOf("MONTHLY"),2000));
		Customers.add(new Customer(101,"shubham","panwar","s@gmail.com","shubh","Akurdi","2345",LocalDate.parse("2022-02-02"),LocalDate.parse("2023-03-02"),MessPlan.valueOf("QUARTERLY"),11700));
		Customers.add(new Customer(102,"shadab","karim","sh@gmail.com","shadabbb","Bhilai","0987",LocalDate.parse("2022-02-15"),LocalDate.parse("2022-02-15"),MessPlan.valueOf("YEARLY"),32000));
		Customers.add(new Customer(103,"vaishnav","puram","v@gmail.com","Vaish","Nijamabad","7865",LocalDate.parse("2022-06-06"),LocalDate.parse("2022-07-07"),MessPlan.valueOf("HALFYEAR"),17500));
		Customers.add(new Customer(104,"gaurav","arudkar","g@gmail.com","gau","Chandrapur","9987",LocalDate.parse("2022-01-01"),LocalDate.parse("2022-02-02"),MessPlan.valueOf("MONTHLY"),2000));
		Customers.add(new Customer(105,"rajat","kuralkar","rajjo@gmail.com","raj","Amravati","7039",LocalDate.parse("2022-03-03"),LocalDate.parse("2022-04-04"),MessPlan.valueOf("HALFYEAR"),17500));
		Customers.add(new Customer(106,"nikhil","gaikwad","Nik@gmail.com","Nik","Akurdi","8897",LocalDate.parse("2023-03-03"),LocalDate.parse("2023-04-04"),MessPlan.valueOf("QUARTERLY"),17500));
		
		int n;
		Customer c;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.  SignUp Customer");
			System.out.println("2.  Sign in");
			System.out.println("3.  Change Password");
			System.out.println("4.  Sorting of Customer");
			System.out.println("5.  Unsubscribe Customer");
			System.out.println("6.  Display All Customers");
			System.out.println("7.  Modify All Customers");
			System.out.println("8.  Display Email Address of Customers");
			System.out.println("9.  Display count of Customers who have register for Plan Monthly");
			System.out.println("10. Search the Customer who lives in Akurdi");
			System.out.println("11. Give 20% Discount to the Customer who selected plan of 1 Year");
			System.out.println("12. Exit");
			n=sc.nextInt();
			
		try {
			String newPassword;
			switch(n) {
			case 1:
				
				System.out.println("Enter firstname :");
				firstname=sc.next();
				System.out.println("Enter lastname :");
				lastname=sc.next();
				System.out.println("Enter email :");
				email=sc.next();
				System.out.println("Enter Password :");
				password=sc.next();
				System.out.println("Enter Adress :");
				address=sc.next();
				System.out.println("Enter Phoneno :");
				phoneno=sc.next();
				System.out.println("Enter regDate :");
				regDate=LocalDate.parse(sc.next());
				System.out.println("Enter PlanEndDate :");
				PlanEndDate=LocalDate.parse(sc.next());
				System.out.println("Enter plan :");
				plan=MessPlan.valueOf(sc.next());
				System.out.println("Enter Final_amount :");
				final_amount=sc.nextDouble();				
				
				break;
				
			case 2:
				
				//SignIn
				
				System.out.println("Enter Email :");
				email=sc.next();
				CustRepo.findbyemail(email, Customers);
				System.out.println("Enter Password :");
				password=sc.next();
				Customer cust = CustRepo.InvalidCredentials(email, password, Customers);
				System.out.println("Login Successfull");
				System.out.println("Want to edit Your Plans ? (Y/N): ");
				char val=sc.next().charAt(0);
				if(val=='Y') {
					System.out.println("Enter new plan name :");
					String plan1=sc.next();
					cust.setPlan(MessPlan.valueOf(plan1));
					System.out.println("Plan Updated Successfully ..!");
				}
				else {
					System.out.println("You entered Invalid Plan..!");
				}
				break;
				
				
			case 3:
				
				//Change Password
				
			    System.out.println("Enter email :");
			    email=sc.next();
			    CustRepo.findbyemail(email, Customers);
			    System.out.println("Enter Old Password");
			    password=sc.next();
			    cust=CustRepo.InvalidCredentials(email, password, Customers);
			    System.out.println("Enter newPassword");
			    newPassword=sc.next();
			    cust.setPassword(newPassword);
			    System.out.println("Password Updated Successfully..!");
			    break;
			    
			    
			case 4:
				
				//Sorting of Customer
				
				System.out.println("Sort of Customer 1.firstname | 2.According to Plan | 3. According to the date of registration");
				switch(sc.nextInt()) {
//				
//				case 1:
//					
//				Customers.stream()
//					.sorted((c1, c2)->c1.getFirstname().compareTo(c2.getFirstname()))
//					.forEach(System.out::println);
//				
//					Customers.stream()
//					.sorted((c1,c2) -> c1.getFirstname().compareTo(c2.getFirstname()));
//					
//				break;
//				
//			   case 2:
//				
//				Customers.stream()
//				.sorted((p1,p2)-> p1.getPlan().compareTo(p2.getPlan()))
//				.forEach(System.out::println);
//				break;
//				
//			   case 3:
//				
//				 Customers.stream()
//				 .sorted(p1,p2)->p1.getregDate().compareTo(p2.getregDate()))
//				.forEach(System.out::println);
//				break;
//				
//				}
//				break;
				
				
			case 5:
				
				//Unsubscribe Customer
				
				System.out.println("Enter email :");
				email=sc.next();
				CustRepo.findbyemail(email, Customers);
				System.out.println("Enter Password :");
				password=sc.next();
				cust=CustRepo.InvalidCredentials(email, password, Customers);
				System.out.println("Login Successful");
				cust.setPlan(MessPlan.NONE);
				System.out.println("Unsubscribed...!");
				break;
			    
			case 6:
				
				//Display All Customers
				
				if(Customers.isEmpty()) {
					System.out.println("User Not Found..");
					break;	
				}
				for(Customer c1: Customers) {
					System.out.println(c1);
				}
				System.out.println("Enter file name:");
				String filename=sc.nextLine();
				ArrayList<Customer> custs=IOHandling.readData(filename);
				
				custs.stream().forEach(System.out::println);
				break;
			
			case 7:
				
				//Modify All Customers
				
				for(Customer c1 : Customers) {
					c1.setFirstname(c1.getFirstname().substring(0, 1).toUpperCase()+c1.getFirstname().substring(1));
					c1.setLastname(c1.getLastname().substring(0, 1).toUpperCase()+c1.getLastname().substring(1));
				}
				break;
				
				
			case 8:
				
				//Display Email Address of Customers
				
				for(Customer e: Customers) {
					System.out.println(e.getFirstname()+"---->"+e.getEmail());
				}
				break;
				
			case 9:
			
				//Display count of Customers who have register for Plan Monthly
				
				long l=Customers.stream().filter(p->p.getPlan() == MessPlan.MONTHLY).count();
				System.out.println(l);
				break;
				
				
			case 10:
				
			   //Search the Customer who lives in Akurdi
				
			Customers.stream().filter(p -> p.getAdress()=="Akurdi").forEach(System.out::println);
			break;
				
				
			
			case 11:
				
				//Give 20% Discount to the Customer who selected plan of 1 Year
				
				for(Customer c1:Customers) {
					if(c1.getPlan()==plan.YEARLY) {
						c1.setfinal_Amount(c1.getFinal_amount()*0.80);	
					}
				}
				System.out.println("Discount Applied...!");
				break;
				
				
			case 12:
				
				//Exit
				
				sc.nextLine();
				System.out.println("Enter file name to store changes :");
				filename=sc.nextLine();
				IOHandling.writeObject(Customers, filename);
				System.out.println("You choose exit....!");
				
				break;
			}
			
			
			}	
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		}while (n!=12);
	}
}


