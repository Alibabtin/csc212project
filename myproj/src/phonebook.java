
import java.util.*;
public class phonebook {
public linkedlist<Contact> LinkListConatact; 
public linkedlist<Event> LinkListEvent;
int emailcount;
int adresscount;
int birthcount;
public Scanner input=new Scanner(System.in); //check

public phonebook() {
	LinkListConatact = new linkedlist<>();
	LinkListEvent = new linkedlist<>();
}

public Contact addcontact() {
	 
	System.out.println("enter the contact name");
	System.out.println("enter the contact phone number");
	System.out.println("enter the contact email address");
	System.out.println("enter the contact addresss");
	System.out.println("enter the contact birthday");
	System.out.println("enter the contact notes for contact");
Contact c=new Contact(input.next(),input.nextInt(),input.next(),input.next(),input.next(),input.next());
return c;
	
}

public void searchcontact(phonebook pbb) {
	int select; // new integer for switch
	
	do {
	System.out.println("Enter search criteria:\r\n"
			+ "1. Name\r\n"
			+ "2. Phone Number\r\n"
			+ "3. Email Address\r\n"
			+ "4. Address\r\n"
			+ "5. Birthday");
	
	select = input.nextInt();
	switch(select) {
		case 1: System.out.println("enter contact's name");    //finished case 1 for name
			String currentname =  input.next();
			Contact contname =  pbb.searcbyname(currentname);
			if(contname != null) {
				System.out.println("Contact found!");
				System.out.println(contname.toString());
			}
			else
				System.out.print("cant find contact");
			break;
			
		case 2: System.out.println("enter contact's phone"); // finished case 2 which is similar to case 1
			int currentphone =  input.nextInt();
			Contact contphone = pbb.searchbyphone(currentphone);
			if(contphone != null) {
				System.out.println("Contact found!");
				System.out.println(contphone.toString());
			}
			else
				System.out.print("cant find contact");
			break;
			
		case 3: System.out.println("enter contact's email");
			String currentemail =  input.next();
			phonebook tmpbookemail = new phonebook();
			tmpbookemail.LinkListConatact = pbb.searchbyeamil(currentemail, emailcount);
			if(emailcount != 0) {
				System.out.println("Contacts found!");
				while(emailcount != 0) {
					System.out.println(tmpbookemail.LinkListConatact.retreive().toString());
					tmpbookemail.LinkListConatact.findnext();
					emailcount--;
				}
			}
			else
				System.out.print("cant find contact");
			break;
			
		case 4: System.out.println("enter contact's adress");
		String currentadress =  input.next();
		phonebook tmpbookadress = new phonebook();
		tmpbookadress.LinkListConatact = pbb.searchbyeamil(currentadress, adresscount);
		if(adresscount != 0) {
			System.out.println("Contacts found!");
			while(adresscount != 0) {
				System.out.println(tmpbookadress.LinkListConatact.retreive().toString());
				tmpbookadress.LinkListConatact.findnext();
				adresscount--;
			}
		}
		else
			System.out.print("cant find contact");
			break;
		case 5: System.out.println("enter contact's email");
		String currentbirth =  input.next();
		phonebook tmpbookbirth = new phonebook();
		tmpbookbirth.LinkListConatact = pbb.searchbyeamil(currentbirth, birthcount);
		if(birthcount != 0) {
			System.out.println("Contacts found!");
			while(birthcount != 0) {
				System.out.println(tmpbookbirth.LinkListConatact.retreive().toString());
				tmpbookbirth.LinkListConatact.findnext();
				birthcount--;
			}
		}
		else
			System.out.print("cant find contact");
			break;
		default:
			System.out.println("Sorry wrong number");
		}
	} while(select < 1 || select > 5); // when user inputs wrong number
}


public void menu() {
	int select=0;
	phonebook pb = new phonebook();
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
		case 1: pb.LinkListConatact.insert(addcontact());
			
			
			break;
		case 2: searchcontact(pb);
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
	




//public void printallcontact() {
	//current=head;
	//while(current!=null) {
		//System.out.print(((Contact)current.data).getContactName());
		//System.out.print(((Contact)current.data).getPhoneNumber());
//	System.out.print(((Contact)current.data).getEmailAddress());
//System.out.print(((Contact)current.data).getAddress());
//System.out.print(((Contact)current.data).getBirthday());
//System.out.println(((Contact)current.data).getNote());

//current=current.next;
//}
//}

public Contact searcbyname(String Searchdata) {// changed searchbyname to return Contact and to receive a string
	LinkListConatact.findfirst();
	while(LinkListConatact.current!=null) {
		if((LinkListConatact.retreive()).getContactName()==(Searchdata))
			return LinkListConatact.retreive();
		LinkListConatact.findnext();}
	return null;
}

public Contact searchbyphone(int Searchdata) { // changed searchbyphone to return Contact and to receive a int
	LinkListConatact.findfirst();
	while(LinkListConatact.current!=null) {
		if((LinkListConatact.retreive()).getPhoneNumber()==(Searchdata))
			return LinkListConatact.retreive();
		LinkListConatact.findnext();}
	return null;
}

public linkedlist<Contact> searchbyeamil(String Searchdata, int emailcount) { // changed search by email to return a list
	LinkListConatact.findfirst();
	linkedlist<Contact> emaillist = new linkedlist<>(); 
	while(LinkListConatact.current!=null) {
		if((LinkListConatact.retreive()).getEmailAddress()==(Searchdata)) {
			emaillist.insert(LinkListConatact.retreive());
			emailcount++;
		}
			LinkListConatact.findnext();}
	return emaillist;
}


public linkedlist<Contact> searchbyAdress(String Searchdata, int Adresscount) {
	LinkListConatact.findfirst();
	linkedlist<Contact> Adresslist = new linkedlist<>(); 
	while(LinkListConatact.current!=null) {
		if((LinkListConatact.retreive()).getAddress()==(Searchdata)) {
			Adresslist.insert(LinkListConatact.retreive());
			Adresscount++;
		}
			LinkListConatact.findnext();}
	return Adresslist;
}

public linkedlist<Contact> searchbyBirthday(String Searchdata, int Birthcount) {
	LinkListConatact.findfirst();
	linkedlist<Contact> Birthlist = new linkedlist<>(); 
	while(LinkListConatact.current!=null) {
		if((LinkListConatact.retreive()).getBirthday()==(Searchdata)) {
			Birthlist.insert(LinkListConatact.retreive());
			Birthcount++;
		}
			LinkListConatact.findnext();}
	return Birthlist;
}


}