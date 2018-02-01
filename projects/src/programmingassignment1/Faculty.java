package programmingassignment1;

import util.MyDate;
import java.util.ArrayList;
import programmingassignment1.Rank;

public class Faculty extends Employee {
	
	private Rank rank;
	private ArrayList<String> hours;
	Faculty() {}
	
	public Faculty(String name, String address, String phoneNumber, String email, String office, Integer salary, MyDate date, Rank rank, ArrayList<String> hours) {
	super(name, address, phoneNumber, email, office, salary, date);
	setRank(rank);
	setHours(hours);
	}

	public String getRank() {
		return rank.toString();
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public ArrayList<String> getHours() {
		return hours;
	}

	public void setHours(ArrayList<String> hours) {
		this.hours = hours;
	}	
}
