package Customer_Package;
import java.io.Serializable;
import java.time.LocalDate;
import Enumm.MessPlan;

public class Customer implements Comparable <Customer> ,Serializable{
	
	private static final String Customer = null;
 
	private int CustomerId;
	private String firstname;
	private String lastname;
	private String email;
	private String Password;
	private String Adress;
	private String phoneno;
	private LocalDate regDate;
	private LocalDate PlanEndDate;
	private MessPlan plan;
	private double final_amount;
	
	public Customer(int CustomerId, String firstname, String lastname, String email, String Password, String Adress,String phoneno,LocalDate regDate,
			LocalDate PlanEndDate,MessPlan plan,double final_amount){
		
	this.CustomerId=CustomerId;
	this.firstname=firstname;
	this.lastname=lastname;
	this.email=email;
	this.Password=Password;
	this.Adress=Adress;
	this.phoneno=phoneno;
	this.regDate=regDate;
	this.PlanEndDate=PlanEndDate;
	this.plan=plan;
	this.final_amount=final_amount;
	this.regDate=LocalDate.now();
	
	}
	
	
	public int getCustomerId() {
		return CustomerId;
	}

	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return Password;
	}

	public String getAdress() {
		return Adress;
	}
	
	public String getPhoneno() {
		return phoneno=phoneno;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public LocalDate getPlanEndDate() {
		return PlanEndDate;
	}
	

	public MessPlan getPlan() {
		return plan;
	}


	public double getFinal_amount() {
		return final_amount;
	}
	
	public Customer(String email) {
		super();
		this.email=email;
	}
    
	

	
	

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", Password=" + Password + ", Adress=" + Adress + ", phoneno=" + phoneno + ", regDate="
				+ regDate + ", PlanEndDate=" + PlanEndDate + ", plan=" + plan + ", final_amount=" + final_amount + "]";
	}


	@Override
	public boolean equals(Object anotherobj) {
		System.out.println("in Custimer eq");
		if(anotherobj instanceof Customer)
		return this.email.equals(((Customer)anotherobj).email);
		return false;
	}
	
	@Override
	public int compareTo(Customer anotherCustomer) {
		System.out.println("in Compares to");
		return this.email.compareTo(anotherCustomer.email);
		
	}


	public void setPlan(MessPlan valueOf) {
		
		this.plan=valueOf;
		
	}


	public void setPassword(String newPassword) {
		
		this.Password=newPassword;
	}


	public void setFirstname(String firstname) {
		
		this.firstname=firstname;
	}


	public void setLastname(String lastname) {
		this.lastname=lastname;
		
	}


	public void setfinal_Amount(double final_amount) {
		this.final_amount=final_amount;
		
	}

	
	}

