package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {
	ArrayList<Person> list = new ArrayList<>();
	private Scanner sc;

	public void addPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter frist name :");
		String fristName = sc.next();
		System.out.println("Enter last name :");
		String lastName = sc.next();
		System.out.println("Enter address :");
		String address = sc.next();
		System.out.println("Enter city :");
		String city = sc.next();
		System.out.println("Enter state :");
		String state = sc.next();
		System.out.println("Enter zip :");
		int zip = sc.nextInt();
		System.out.println("Enter phonNo :");
		long phonNo = sc.nextLong();
		System.out.println("Enter email :");
		String email = sc.next();
		list.add(new Person(fristName, lastName, address, city, state, zip, phonNo, email));
	}

	private void editPerson() {
		System.out.println("Enter person name to edit person");
		sc = null;
		String editPersonName = sc.next();
		Person person = getPerson(editPersonName);
		System.out.println(
				"Enter detail you want to edit :1-firstName\n2-lastName\n3-address\n4-city\n5-state\n6-zip\n7-phonNo\n8-email\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			editfristName(person);
		case 2:
			editlastName(person);
			break;
		case 3:
			editaddress(person);
			break;
		case 4:
			editcity(person);
			break;
		case 5:
			editstate(person);
			break;
		case 6:
			editzip(person);
			break;
		case 7:
			editphonNo(person);
			break;
		case 8:
			editemail(person);
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}

	private void editfristName(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		person.fristName = sc.next();
	}

	private void editlastName(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		person.fristName = sc.next();
	}

	private void editaddress(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter address");
		person.address = sc.next();
	}

	private void editcity(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		person.city = sc.next();
	}

	private void editstate(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter state name");
		person.state = sc.next();
	}

	private void editzip(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter zip code");
		person.zip = sc.nextInt();
	}

	private void editphonNo(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phonNo");
		person.phonNo = sc.nextLong();
	}

	private void editemail(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id");
		person.email = sc.next();

		sc.close();
	}

	private Person getPerson(String editPersonName) {
		Iterator itr = list.iterator();
		if (itr.hasNext()) {
			for (int i = 0; i < list.size(); i++) {
				Person person = (Person) itr.next();
				if (person.fristName.equalsIgnoreCase(editPersonName)) {
					return person;
				}
			}
		}
		return null;
	}

	private void deleteperson() {
		Scanner sc = new Scanner(System.in);
		String fristName = sc.next();
		Person person = getPerson(fristName);
		if (person == null) {
			System.out.println("details not found");
		} else {
			list.remove(person);
		}

	}

	private void searchperson() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("search city name");
		String city = sc.next();
		for (Person person : list) {
			if (person.city.equalsIgnoreCase(city)) {
				System.out.println(person);
				count++;

			}
		}
	}

	private void display() {
		System.out.println(list);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBookMain abm = new AddressBookMain();
		int choice = 0;
		while (choice != 10) {
			System.out.println(
					"Enter your choice :\n 1-addperson\n2-editperson\n3-deleteperson\n4-searchperson\n5-showperson\n6-Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				abm.addPerson();
				break;
			case 2:
				abm.editPerson();
			case 3:
				abm.deleteperson();
				break;
			case 4:
				abm.searchperson();
				break;
			case 5:
				abm.display();
				break;
			case 10:

				break;
			}
		}

	}
}