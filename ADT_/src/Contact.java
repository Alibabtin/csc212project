import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Contact <T>  {
private String ContactName;
private int PhoneNumber;
private String EmailAddress;
private String Address;
private int Birthday;
private String Note;

public void add(T e) {
	
	
	
}
public int compareTo(Contact<T> o) {
	int x=ContactName.length();
	int z;
	int y=o.getContactName().length();
	
	int compare=0;
	if(x>y)
		compare=x;
	else
		compare=y;
	try {
	for(int i=0;i<compare;i++) {
		z=o.ContactName.charAt(i)-ContactName.charAt(i);
			if(z>0)
				return z;
			else if(z<0)
				 return z;}
					}catch (StringIndexOutOfBoundsException e) {
				 
						if(x>y) { 
					 System.out.println("the firist one is bigger");}
				 else {
					 System.out.println("secend one is bigger");
					 }
				 
					}return 0;
	
	
}
public Contact(String contactName, int phoneNumber, String emailAddress, String address, int birthday, String note) {
	ContactName = contactName;
	PhoneNumber = phoneNumber;
	EmailAddress = emailAddress;
	Address = address;
	Birthday = birthday;
	Note = note;
}




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


}
