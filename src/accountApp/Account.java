package accountApp;

public class Account {

	private int accountNumber;
	private String firstName;
	private String lastName;
	
	
	
	public Account (int accountNumber, String firstName, String lastName){
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		
	};
	
	
	public void setAccNo (int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	
	
	
	public int getAccNo() 
	{
		return accountNumber;	
	}
	
	
	
	public void setFirstName (String firstName) 
	{
		this.firstName = firstName;
	}
	
	
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	
	
	public void setLastName (String lastName)
	{
		this.lastName = lastName;
	}
	
	
	
	public String getLastName()
	{
		return lastName;
	}
	
}


