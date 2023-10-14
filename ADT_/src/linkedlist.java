
public class linkedlist <T>  {
public Node<T> head;
public Node<T> current;
public linkedlist() {
	head=current=null;
}

public void findfirst() {
	current=head;
	
}

public void findnext() {
	current=current.next;
	
}

public T retreive() {
	
	return current.data;
}

public void update(T e) {
	current.data=e;
	
}

public void InsertC(Contact ndata) {//here
	Node<T> tmp=new Node(ndata);
	if(head==null)head=current=tmp;
	if(((Contact)tmp.getData()).compareTo(((Contact)head.getData()))>0) {
		tmp.setNext(head);
		head=tmp;return;}
	else {
		
			Node<T> pre=head;
			current=head.next;
			while(current!=null) {
				if(((Contact)tmp.getData()).compareTo(((Contact)head.getData()))<0) {
				tmp.setNext(current);
				pre.setNext(tmp);
				current=tmp;return;}
				
				pre=current;
				current=current.next;
				
			}if(current==null) {
				pre.setNext(tmp);
				current=tmp;
			}return;
		
		
	
}}
public void InsertE(Event ndata) {//here
	Node<T> tmp=new Node(ndata);
	if(head==null)head=current=tmp;
	if(((Event)tmp.getData()).compareTo(((Event)head.getData()))>0) {
		tmp.setNext(head);
		head=tmp;return;}
	else {
		
			Node<T> pre=head;
			current=head.next;
			while(current!=null) {
				if(((Event)tmp.getData()).compareTo(((Event)head.getData()))<0) {
				tmp.setNext(current);
				pre.setNext(tmp);
				current=tmp;return;}
				
				pre=current;
				current=current.next;
				
			}if(current==null) {
				pre.setNext(tmp);
				current=tmp;
			}return;
		
		
	
}}


public void remove() {
	if(empty())
		return;
	if(head==current) {
		head=head.next;
	}else {
		Node tmp=head;
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

public boolean full() {
	return false;
	
}



public boolean last() {
	return current.next==null;
}

public boolean empty() {
	return head==null;
}


public boolean searchC(T C) {
	Node<T> tmp=head;
	Node<T>Searchdata= new Node<T>(C);
	if(head==null) {
		return false;
	}
	while(tmp!=null) {
		if((((Contact)Searchdata.getData()).getContactName()).compareTo(((Contact)tmp.getData()).getContactName())==0)
			return true;
		tmp=tmp.next;}
	return false;
}

public boolean searchE(T C) {
	Node<T> tmp=head;
	Node<T>Searchdata= new Node<T>(C);
	if(head==null) {
		return false;
	}
	while(tmp!=null) {
		if((((Event)Searchdata.getData()).getTitle()).compareTo(((Event)tmp.getData()).getTitle())==0)
			return true;
		tmp=tmp.next;}
	return false;
}

public void display() {
	Node d=head;
	while(d.next!=null) {
		System.out.println(d.data+"_______");
		d=d.next;
	}
}



}
