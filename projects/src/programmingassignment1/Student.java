package programmingassignment1;

import programmingassignment1.Status;

public class Student extends Person {
	
	private Status classification;
	
	public Student() {}

	public Student(String name, String address, String phoneNumber, String email, Status status) {
		super(name, address, phoneNumber, email);
		setClassification(status);
	}

	public String getClassification() {
		return classification.toString();
	}

	public void setClassification(Status classification) {
		this.classification = classification;
	}

}
