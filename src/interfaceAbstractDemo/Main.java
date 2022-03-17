package interfaceAbstractDemo;


import java.rmi.RemoteException;
import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.concretes.CustomerCheckManager;
import interfaceAbstractDemo.concretes.NeroCustomerManager;
import interfaceAbstractDemo.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
       
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(new Customer(1,"Simge","Manav",1995,"12345678912"));
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(new Customer(2,"Sıla","Yagmur",1995,"12345678989"));
	
	}

}
