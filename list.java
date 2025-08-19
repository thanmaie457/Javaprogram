public class linked {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	private Node head;
	public linked(){
		head=null;
	}
	public void insertAtBegin(int data){
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	public void displayList(){
		Node temp=this.head;
		System.out.print("Linked list:");
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
	    }
		System.out.println("NULL");
	}
	public static void main(String[] args) { 
	    linked l=new linked();
	    l.insertAtBegin(10);
	    l.insertAtBegin(20);
	    l.insertAtBegin(30);
	    l.displayList();
	}
}