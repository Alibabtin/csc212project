
public class phonebook<T> extends linkedlist<T> {

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
