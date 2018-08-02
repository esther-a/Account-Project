package account_app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Service j = new Service();
		Account a = new Account(123, "A", "John");
		j.addAcc(a);
		System.out.println(j.JObj());
		System.out.println(j.accountToJson(a));
	
		
		
	}

}
