package generic_s;

public class Generics_Linked_List <T>{

	Node<T>head;
	
	public class Node<T> {
		T data;
		Node next;
		public Node(T data) {
			
			this.data = data;
			next = null;
			
		}
	}
	
	public void display() {
		Node <T> myNode = head;
		while(myNode!=null) {
			System.out.println(myNode.data);
			myNode = myNode.next;
		}
	}
	public boolean isempty() {
		if(head==null) return true;
		else return false;
	}
	public void instantiate(T newData) {
		System.out.println("List Instantiate With: " + newData);
		head = new Node<T>(newData);
		head.next = null;
	}
	public void addnewData(T newData) {
		if(isempty()) {
			instantiate(newData);
			return;
		}
		System.out.println(newData + " Inserted.");
		Node<T> myNode = head;
		Node<T>  newNode = new Node<T>(newData);
		while(myNode.next!=null) {
			myNode = myNode.next;
		}
		myNode.next = newNode;
	}
	public void remove() {
		if(isempty()) {
			System.out.println("List is Empty: ");
		}
		System.out.println(head.data + " Remove From The list");
		head = head.next;
	}
	public void middleelements() {
		
		Node<T> slow = head;
		Node<T> fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
		
	}
}
