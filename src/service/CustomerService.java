package service;

import java.util.List;
import java.util.Map;

import domain.CustomerDTO;
import proxy.Proxy;

public interface CustomerService {
	public void registCustomer(CustomerDTO cust);
	public List<CustomerDTO> bringCustomerList(Proxy pxy);
	public List<CustomerDTO> retrieveCustomers(Proxy pxy);
	public CustomerDTO retrieveCustomer(CustomerDTO cust);
	public int countCustomers(Proxy pxy);
	public boolean existsCustomerID(CustomerDTO cust);
	public void modifyCustomer(CustomerDTO cust);
	public Map<String, Object> fileUpload(Proxy pxy);
	public void removeCustomer(CustomerDTO cust);
	public Map<String,Object> retrievePhone(Proxy pxy);
}
