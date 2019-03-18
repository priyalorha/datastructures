class Doubly
{
	class Node
	{
	Node prev;
	Node next;
	int data;
	
	
	Node(int d) { data=d; }}
	
	Node head;
	Node tail;
	
	
	
	
	
	
	void append(int d)
	{
		Node nw=new Node(d);
		
		if(head==null)
		{head=nw;
		 tail=nw;
		}
		else
		{
			nw.next=head;
			head.prev=nw;
			
			head=nw;
		}
			
		
	}
	
	
	void append_tail(int d)
	{
		Node nw=new Node(d);
		
		if(tail==null)
		{head=nw;
		 tail=nw;
		}
		else
		{
			nw.prev=tail;
			tail.next=nw;
			
			tail=nw;
		}
			
		
	}
	
	
	void delete()
	{
		System.out.println("------------------------------------");
		if(head==null)
			System.out.println("---------LinkedList empty--------");
		
		else
		{	System.out.println("Deleted item from head"+head.data);
			head=head.next;
			head.prev=null;
			
		}
		
		
	}
	
	void delete_tail()
	{
		System.out.println("------------------------------------");
		if(head==null)
			System.out.println("---------LinkedList empty--------");
		
		else
		{	System.out.println("Deleted item from tail"+tail.data);
			tail=tail.prev;
			tail.next=null;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	void traversal()
	{
	System.out.println("---------------Head to Tail Traversal------------------");
	Node temp=head;
	
	if(temp==null)
		System.out.println("--------LinkList empty----------");
	
	while(temp!=null)
	{
	
		System.out.println(temp.data);
		temp=temp.next;
	
	
	}
	
	}
	void  rev_traversal()
	{
		System.out.println("----------------Tail to Head Traversal-------------------");
		Node temp=tail;
	
	if(temp==null)
		System.out.println("--------LinkList empty----------");
		
	while(temp!=null)
	{
	
		System.out.println(temp.data);
		temp=temp.prev;
	
	
	}
		
	}
	void node_reversal()
		
	{
		System.out.println("-------------------Node Reversal----------------------");
	Node temp=null,cur=head,sup;
		
		temp=head;
		
		if(temp==null)
			System.out.println("-----Empty linklist---------");
		
		while(cur!=null)
		{
			
			temp=cur.prev;			
			cur.prev=cur.next;
			cur.next=temp;
			
			cur=cur.prev;
			
			
			
			
			
			
			
			
			
			
		}
		
		temp=head;
		head=tail;
		tail=temp;
			
		
		
	}
public static void main(String []args)
	
{
	Doubly ob=new Doubly();
	
	
	ob.append(20);
	ob.append(30);
	ob.append(40);
	ob.append(50);
	ob.append(90);
	ob.append_tail(5);
	ob.append_tail(70);
	ob.append_tail(18);
	
	ob.rev_traversal();
	ob.traversal();
	
	ob.delete();
	ob.delete();
	ob.rev_traversal();
	ob.traversal();

	ob.rev_traversal();
	ob.traversal();
	
	ob.delete_tail();
	ob.delete_tail();
	ob.rev_traversal();
	ob.traversal();
	ob.node_reversal();
	ob.rev_traversal();
	ob.traversal();
	
	
	
}

}