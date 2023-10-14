import java.util.Scanner;

public class Contact implements Comparable<Contact>{
private String ContactName;
private int PhoneNumber;
private String EmailAddress;
private String Address;
private int Birthday;
private String Note;




public int compareTo(Contact o) {
	return ContactName.compareTo(o.ContactName);
	
}

public Contact(String contactName, int phoneNumber, String emailAddress, String address, int birthday, String note) {
	ContactName = contactName;
	PhoneNumber = phoneNumber;
	EmailAddress = emailAddress;
	Address = address;
	Birthday = birthday;
	Note = note;
}


public Contact() {};



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
public int getBirthday() {
	return Birthday;
}
public void setBirthday(int birthday) {
	Birthday = birthday;
}
public int getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	PhoneNumber = phoneNumber;
}
public void print() {
	System.out.print("");

}


}