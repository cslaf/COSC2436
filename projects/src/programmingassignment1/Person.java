package programmingassignment1;

public class Person {

	private String name, address, phoneNumber, email;
	
	public String toString() {
		return name;
	}
	
	
	public Person() {}
	
	public Person(String name, String address, String phoneNumber, String email){
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
