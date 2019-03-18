class linklist
{
	static class Node
	{
		
		int data;
		Node next;
		
		Node (int n)
		{
			data=n;
			next=null;
		}
		
	}
	
	Node head=null;
	// adding nodes at the start
	 void add(int n)
	{
		Node new_node =new Node(n);
		if(head==null)
			head=new_node;
		 else
			 new_node.next=head;
		 
		 head=new_node;
	}
	
	//adding nodes at the end /tail/rear
	void add_end(int n)
	{
	Node new_node=new Node(n);
		
	if (head==null)
	{
		head=new_node;
	}
		
	else
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new_node;
		
	}
	}
	//find count of nodes
	
	int count()
	{
	Node temp=head;
		int counter=0;
		
		
		while(temp!=null)
		{
			++counter;
			temp=temp.next;
		}
		return counter;
	}
	
	//traversal of the node
	void traversal()
	{
	
		Node new_head=head;
		if(new_head==null)
			System.out.println("Empty linklist");
		else
		{
		while(new_head!=null)
		{
		System.out.println(new_head.data);
			new_head=new_head.next;
		}
		}
	}
	//adding linklist a a particular position
	void add_at_pos(int data,int pos)
	{if(pos==0)
			{  
		    add(data);
		}
	 	else if(pos <=count())
		{
			
			Node new_head=head;
			Node new_node=new Node(data);
			Node tail=null;
			Node prev=null;
			while(pos!=0)
			{   prev=new_head;
				pos--;
				tail=new_head.next;
			    new_head=new_head.next;
			}
			new_node.next=tail;
			prev.next=new_node;
			
	

		}
		else
			
		{
			
			System.out.println(" Link list is off a shorter length");
		}
	}
	
	
	void delete_from_head()
	{
	System.out.println(" Deleted head node " + head.data);
		head=head.next;
	}
	void delete_from_tail()
	{
		
		Node temp=head;
		Node prev=null;
		
		while(temp.next.next!=null)
		{
			prev=temp;
			temp=temp.next;
			
		}
		System.out.println("Deleted tail node " + temp.next.data);
		temp.next=null;
	}
	
	void delete_from_pos(int n)
	{ if(n>count() ||n<1)
		System.out.println("link list is of shorter node");
	 
	 else if(n==1)
		 delete_from_head();
	 else 
	 {	Node temp=head;
	  	Node prev=null;
		 while(n>1&&temp.next!=null)
		 {	prev=temp;
			 temp=temp.next;
			 n--;
			 
		 }
		 
		System.out.println("Deleted node " +temp.data);
	  prev.next=temp.next;
	}
	}
	
	void reverse_traverse(Node temp)
	{
		if(temp!=null)
		
		{reverse_traverse(temp.next);
		System.out.println(temp.data);
		}
		
		
	}
	
	void reverse_linklist()
	{
		Node prev=null,curr=head,next=null;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		head=prev;
		
	}
	
	void search(int search_element)
	{
		Node temp =head;
		int status=-1;
		int pos=-1;
		
		while(temp!=null)
			
		{	++pos;
			if(temp.data==search_element)
			{
				status=1;
				break;
			}
		 else 
			 temp=temp.next;
		}
		
		if(status==1&& pos!=-1)
			System.out.println("Search element found at position :"+(pos+1));
		else
			System.out.println("Search element not found");
	}
	
	void find_middle()
	{
	Node fast=head,slow=head;
		
		while(fast.next!=null)
			
		{
			slow=slow.next;
			fast=fast.next.next;
		}
			System.out.println("middle element :"+slow.data);
	}
	
	void move_last_to_first()
	{
		Node temp=head,last=null;
		
		while(temp.next.next!=null)
		{	temp=temp.next;
	}
	last=temp.next;
	temp.next=null;
	
	last.next=head;
	head=last;
}
	void move_first_to_last()
	{
		
	Node temp=head,last=head.next;
	head=head.next;
		
	traversal();
		
	temp.next=null;
		
	
	
		
	while(1==1)
	{
		if(last.next==null)
		{last.next=temp;
		 break;}
		else
			last=last.next;
		
		
		
	}
	}
	
		
	
		
	
		
	
	public static void main(String []args)
	{
		
		linklist ob=new linklist();	
		ob.add(5);
		ob.add(10);
		ob.add(15);
		ob.add_end(100);
		//ob.traversal();
		ob.add_at_pos(2001,10);
		ob.add_at_pos(200,0);
		ob.add_at_pos(2001,55);
		ob.add_at_pos(569,3);
		ob.add_at_pos(123,6);
		/*ob.traversal();
		
		
		ob.delete_from_head();
		ob.traversal();
		
		ob.delete_from_tail();
		System.out.println("Link list count"+ob.count());
		ob.traversal();
		ob.delete_from_pos(10);
		System.out.println("Link list count"+ob.count());
		ob.delete_from_pos(-1);
		System.out.println("Link list count"+ob.count());
		ob.traversal();
		ob.delete_from_pos(0);
		ob.traversal();
		System.out.println("Link list count"+ob.count());
		ob.delete_from_pos(4);
		ob.traversal();
		System.out.println("Link list count"+ob.count());
		ob.delete_from_pos(4);
		System.out.println("Number of nodes : " +ob.count());
		ob.traversal();
		
		System.out.println("-------------Reverse node----------------");
		ob.reverse_traverse(ob.head);
		System.out.println("------reverse_linklist()---------");
		ob.reverse_linklist(ob.head);
		
		System.out.println("Link list count"+ob.count());
		ob.traversal();
		
		ob.search(569);
		ob.search(1000);
		
		ob.find_middle();
		System.out.println("Link list count"+ob.count());
		ob.traversal();*/
		ob.traversal();
		
		ob.move_last_to_first();
		System.out.println("Link list count"+ob.count());
		ob.traversal();
		
		
		System.out.println("Link list count"+ob.count());
		
		
		ob.move_first_to_last();
		ob.traversal();
		
	}
		
}