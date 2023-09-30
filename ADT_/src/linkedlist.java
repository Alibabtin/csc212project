
public class linkedlist <T> implements list <T>{
public Node<T> head;
public Node<T> current;
public linkedlist() {
	head=current=null;
}
@Override
public void findfirst() {
	current=head;
	
}
@Override
public void findnext() {
	current=current.next;
	
}
@Override
public T retreive() {
	
	return current.data;
}
@Override
public void update(T e) {
	current.data=e;
	
}
@Override
public void insert(T e) {
	Node<T> tmp;
	if(search(e)) {
		System.out.println("the contact is there");
		return ;}
	if(head==null)
		head=current=new Node<T>(e);
	else {
		tmp=current.next;
		current.next=new Node<T>(e);
		current=current.next;
		current.next=tmp;
		
	}
	
}
@Override
public void remove() {
	Node<T> tmp=head;
	if(head==current) {
		head=head.next;
	}else {
		while(tmp.next!=current) {
			tmp=tmp.next;
		}
		tmp.next=current.next;
	}
	if(current.next==null)
		current=head;
	else
		current=current.next;
}
@Override
public boolean full() {
	return false;
}
@Override
public boolean last() {
	return current.next==null;
}
@Override
public boolean empty() {
	return head==null;
}
public boolean search(T e) {
	Node<T> tmp=head;
	Node<T>ne= new Node<T>(e);
	while(tmp!=null) {
		if(((Contact)tmp.data).getContactName()==((Contact)ne.data).getContactName()) 
			return true;
		tmp=tmp.next;}
	return false;
}


}