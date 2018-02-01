package programmingassignment1;

import util.MyDate;

public class Staff extends Employee {
	
	private String title;
	
	public Staff() {}
	
	public Staff(String name, String address, String phoneNumber, String email, String office, Integer salary, MyDate date, String title) {
	super(name, address, phoneNumber, email, office, salary, date);
	setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
