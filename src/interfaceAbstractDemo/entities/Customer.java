package interfaceAbstractDemo.entities;

public class Customer {
	public int id;
	public String firstName;
	public String lastName;
	public int dateofBirth;
	public String nationalityId;
	
	public Customer() {
	}

	public Customer(int id, String firstName, String lastName, int dateofBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(int dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
	
	
	

}
