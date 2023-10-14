import java.util.Scanner;

public class Contact implements Comparable<Contact>{
private String ContactName;
private String PhoneNumber;
private String EmailAddress;
private String Address;
private String Birthday;
private String Note;
//linkedlist<Event> linkevent;




public int compareTo(Contact C2) {
	return ContactName.compareTo(C2.getContactName());
	
}

public Contact(String contactName, String phoneNumber, String emailAddress, String address, String birthday, String note) {
	ContactName = contactName;
	PhoneNumber = phoneNumber;
	EmailAddress = emailAddress;
	Address = address;
	Birthday = birthday;
	Note = note;
	//linkevent=new linkedlist<Event>();
}


public Contact() {
	ContactName = "";
	PhoneNumber = "";
	EmailAddress = "";
	Address = "";
	Birthday ="";
	Note = "";
	//linkevent=new linkedlist<Event>();
};



public String getContactName() {
	return ContactName;
}
public void setContactName(String contactName) {
	ContactName = contactName;
}
public String getNote() {
	return Note;
}
public void setNote(String note) {
	Note = note;
}
public String getEmailAddress() {
	return EmailAddress;
}
public void setEmailAddress(String emailAddress) {
	EmailAddress = emailAddress;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getBirthday() {
	return Birthday;
}
public void setBirthday(String birthday) {
	Birthday = birthday;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "Contact [ContactName=" + ContactName + ", PhoneNumber=" + PhoneNumber + ", EmailAddress=" + EmailAddress
			+ ", Address=" + Address + ", Birthday=" + Birthday + ", Note=" + Note + "]";
}


}
