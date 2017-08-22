package fi.demo.softala.model;

public class Student {
	private String number;
	private String name;
	private String address;
	private String year;
	private String email;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String number, String name, String address, String year, String email) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.year = year;
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
