class circular
{	class Node
	{
		Node next;
		int data;
		Node(int d) { data=d; }}
	
	Node head;
	Node tail;	
	
	void insert(int d)
	{
	 Node new_node=new Node(d);
	 if(head==null)
	 {
	 	new_node.next=new_node;	
		tail=new_node;
	 }
	 else
	 {
	  new_node.next=head;
	  tail.next=new_node;	 
	 }	
		head=new_node;
	}
 	void r_insert(int d)
	{
	 Node new_node=new Node(d);
	 if(tail==null)
	 {
	 	new_node.next=tail;	
		tail=new_node;
		head=new_node;
	 }
	 else
	 {
	  tail.next=new_node;
	  new_node.next=head;
		tail=new_node;	
	  	 
	 }
		
		
	}
 
	void traversal()
	{
	Node temp=head;
	if (temp==null)
		System.out.println("Empty linklist" );
	while(temp!=tail)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
		System.out.println(tail.data);
	}
 
 void delete()
 {if (head==null)
		 System.out.println("Empty Linklist");
 	 else if(head==tail)
	 {System.out.println("Deleted item "+head.data);
	  head=null;
	  tail=null;
	 }
 	else
	{System.out.println("Deleted item "+head.data);
	 tail.next=head.next;
	 head=head.next;
	}
}
	
public static void main(String []args)
{

 circular ob=new circular();
	ob.insert(5);
	ob.insert(10);
	ob.insert(15);
	ob.insert(20);
	ob.insert(25);
	ob.insert(30);
	ob.r_insert(12);
	ob.r_insert(24);
	ob.delete();
	ob.r_insert(17);
	ob.traversal();
}
}