package programmingassignment1;

import util.MyDate;

public class Employee extends Person {
	
	private String office;
	private Integer salary;
	private MyDate date;

	public Employee() {}
		
	public Employee(String name, String address, String phoneNumber, String email, String office, Integer salary, MyDate date) {
		super(name, address, phoneNumber, email);
		setOffice(office);
		setSalary(salary);
		setDate(date);
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	
}
