package com.bridgelabz;

public class Person {
	String fristName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	long phonNo;
	String email;

	public Person(String fristName, String lastName, String address, String city, String state, int zip, long phonNo,
			String email) {
	}

	void AddressBookMain(String fristName, String lastName, String address, String city, String state, int zip,
		long phonNo, String email) {
		fristName = this.fristName;
		lastName = this.lastName;
		address = this.address;
		city = this.city;
		state = this.state;
		zip = this.zip;
		phonNo = this.phonNo;
		email = this.email;

	}

	@Override
	public String toString() {
		return "Person{" + "fristName='" + fristName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address
				+ '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zip=" + zip + ", phonNo=" + phonNo
				+ ", email='" + email + '\'' + '}';
	}
}
