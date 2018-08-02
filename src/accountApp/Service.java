package accountApp;

import java.util.HashMap;
import org.json.JSONObject;

public class Service {

	private HashMap<Integer, Account> map = new HashMap<>();
	

	public void addAcc(Account acc) {
	map.put(acc.getAccNo(), acc); 
	}	
		
	public Account getAcc (int accountNumber) {
		
		return map.get(accountNumber);
	}
	
	
	
	
	public JSONObject JObj()
	{
		return new JSONObject(map);	
		
	}
	
	
	
	public JSONObject accountToJson(Account c)
	{
		JSONObject Json2 = new JSONObject();
		Json2.put("firstname", c.getFirstName());
		Json2.put("lastname", c.getLastName());
		Json2.put("accountnumber", c.getAccNo());
		return Json2;
}
}
