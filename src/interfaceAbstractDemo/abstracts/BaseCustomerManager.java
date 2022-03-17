package interfaceAbstractDemo.abstracts;

import java.rmi.RemoteException;

import interfaceAbstractDemo.entities.Customer;

public class BaseCustomerManager implements CustomerService{
	
	@Override
	public void save(Customer customer) throws RemoteException {
      System.out.println("The user name: "+ customer.getFirstName());		
	}

}
