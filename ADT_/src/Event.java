
public class Event implements Comparable<Event>{
	private String Title;
	private String DateTime;
	private String Location;
	private Contact Contactinvolved;
	//linkedlist<Contact> linkcontact;
	
	
	
	public Event() {
		
	}
	public Event(String title, String date, String location, Contact contactinvolved) {
		Title = title;
		DateTime = date;
		Location = location;
		Contactinvolved = contactinvolved;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String date) {
		DateTime = date;
	}
	
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Contact getContactinvolved() {
		return Contactinvolved;
	}
	public void setContactinvolved(Contact contactinvolved) {
		Contactinvolved = contactinvolved;
	}
	public void display() {
		System.out.println("Event title:"+Title);
		System.out.println("Contact name:"+Contactinvolved.getContactName());
		System.out.println("Event date and time:"+DateTime);
		System.out.println("Event location:"+Location);
	
}
	public int compareTo(Event e) {
		
		return this.Title.compareTo(e.Title);

}}
