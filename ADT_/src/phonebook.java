import java.util.*;
public class phonebook<T> extends linkedlist<T> {
private linkedlist<Contact> LinkListConatact; 
private linkedlist<Event> LinkListEvent;
public Scanner input=new Scanner(System.in); //check
public phonebook() {}

public void addcontact() {
	 
	System.out.println("enter the contact name");
	System.out.println("enter the contact phone number");
	System.out.println("enter the contact email address");
	System.out.println("enter the contact addresss");
	System.out.println("enter the contact birthday");
	System.out.println("enter the contact notes for contact");
Contact c=new Contact(input.next(),input.nextInt(),input.next(),input.next(),input.nextInt(),input.next());
LinkListConatact.insert(c);
	
}

public void searchcontact() {
	System.out.println("Enter search criteria:\r\n"
			+ "1. Name\r\n"
			+ "2. Phone Number\r\n"
			+ "3. Email Address\r\n"
			+ "4. Address\r\n"
			+ "5. Birthday");
}


public void Mneu() {
	int select=0;
	do {
		System.out.println("Welcome to the Linked Tree Phonebook!\r\n"
				+ "Please choose an option:\r\n"
				+ "1. Add a contact\r\n"
				+ "2. Search for a contact\r\n"
				+ "3. Delete a contact\r\n"
				+ "4. Schedule an event\r\n"
				+ "5. Print event details\r\n"
				+ "6. Print contacts by first name\r\n"
				+ "7. Print all events alphabetically\r\n"
				+ "8. Exit\r\n");
		 
		select=input.nextInt();
		switch(select) {
		case 1: addcontact();
			
			
			break;
		case 2: 
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
	}}while(select!=8);
	System.out.println("goodbye!");
	}
	



@Override
public void insert(T e) {
	// TODO Auto-generated method stub
	super.insert(e);
}
public void printallcontact() {
	current=head;
	while(current!=null) {
		System.out.print(((Contact)current.data).getContactName());
		System.out.print(((Contact)current.data).getPhoneNumber());
		System.out.print(((Contact)current.data).getEmailAddress());
		System.out.print(((Contact)current.data).getAddress());
		System.out.print(((Contact)current.data).getBirthday());
		System.out.println(((Contact)current.data).getNote());

		current=current.next;
	}
}
}
