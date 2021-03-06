package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import domain.CustomerDTO;
import service.CustomerServiceImpl;

public class PhoneBook {
	public static void main(String[] args) {
		HashMap<String,Object> map = 
				(HashMap<String, Object>) CustomerServiceImpl
					.getInstance().retrievePhone(null);
		Set<Entry<String, Object>> set = map.entrySet();
		Iterator<Entry<String, Object>> it = set.iterator();
		while(it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry ent = (Entry) it.next();
			@SuppressWarnings("unused")
			String id = (String) ent.getKey();
			CustomerDTO cust = (CustomerDTO) ent.getValue();
			System.out.print(
					cust.getCustomerName()+" : "+cust.getPhone()+"\n");
		}
		
	}
}
