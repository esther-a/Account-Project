package accountApp;

import java.util.HashMap;
import java.util.Map;

public class Service {

	private HashMap<Integer, Account> map = new HashMap<>();
	

	public void addAcc(Account acc) {
	map.put(acc.getAccNo(), acc);  
	}	
		
	public Account getAcc (int accountNumber) {
		
		return map.get(accountNumber);
	}
}
