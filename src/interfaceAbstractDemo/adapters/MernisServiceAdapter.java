package interfaceAbstractDemo.adapters;



import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService{
	
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException{
	    return client.TCKimlikNoDogrula(customer.nationalityId,customer.firstName.toUpperCase(),customer.lastName,customer.dateofBirth);
		
	}
	

	

}
