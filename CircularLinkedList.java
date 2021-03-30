
public class CircularLinkedList {
	private ListNode last;
	private int length;
	
			public class ListNode 
			{
		       private ListNode Next;
		       private int data;
		       
			   public ListNode( int data) {
					this.data = data;
				}
		       
		       
			}

		public CircularLinkedList() 
		{
				last = null;
				length=0;
		}

		private void display() 
		{
			if(last==null)
			{
				return;
			}
			ListNode first=last.Next;
			while(first!=last)
			{
				System.out.print(first.data+"  ");
				first=first.Next;
			}
			System.out.println(first.data);
			
			
		}


		private void createCircularLinkedList() 
		{
			ListNode first=new ListNode(10);
			ListNode second=new ListNode(20);
			ListNode third=new ListNode(30);
			ListNode fourth=new ListNode(40);
			first.Next=second;
			second.Next=third;
			third.Next=fourth;
			fourth.Next=first;
			last=fourth;
			
		}
			
			
		public static void main(String[] args)
		{
			
			CircularLinkedList cll=new CircularLinkedList();
			cll.createCircularLinkedList();
			cll.display();
			boolean flag=cll.find(30);
			System.out.println(flag);
			
				
		}

		private boolean find(int i) 
		{

			if(last==null)
			{
				return false;
			}
			ListNode first=last.Next;
			while(first!=last)
			{
				
				first=first.Next;
				if(first.data==i)
					return true;
			}
			return false;
			
		}


			
}
