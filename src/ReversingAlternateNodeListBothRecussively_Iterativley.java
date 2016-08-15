package com.avinash.datastructure.list;

public class ReversingAlternateNodeListBothRecussively_Iterativley {

	public static void main(String[] args) {
		ReversingAlternateNodeListBothRecussively_Iterativley list = new ReversingAlternateNodeListBothRecussively_Iterativley();
		ListNode head = new ListNode(1);
		head = head.insertNode(head, new ListNode(2), head.size()+1);
		head = head.insertNode(head, new ListNode(3), 3);
		head = head.insertNode(head, new ListNode(4), 4);
		head = head.insertNode(head, new ListNode(5), head.size());
		head = head.insertNode(head, new ListNode(6), head.size());
		head = head.insertNode(head, new ListNode(7), head.size());
		head = head.insertNode(head, new ListNode(8), head.size());
		head.displayList(head);
		System.out.println("After reversing");
		 //head=list.reverseAlternate(head);
		 head=list.reverseAlternateRecurrsive(head);
		head.displayList(head);

	}
	
	public ListNode reverseAlternate(ListNode head){
		ListNode temp1 = head;
		ListNode temp2 = null;
		ListNode temp3 = null;
		
		int i =0;
		while(temp1!=null && temp1.getNext()!=null){
			temp2 = temp1.getNext();
			temp3 = temp2.getNext();
			temp2.setNext(temp1);
			temp1.setNext(temp3);
			
			if(i==0){
				head = temp2;
				i++;
			}
			else{
				temp2.setNext(temp3.getNext());
				temp3.setNext(temp2);
				temp1 = temp2;
			}
			head.displayList(head);
		}
		return head;
	}	
	int call=0;
	public ListNode reverseAlternateRecurrsive(ListNode head){
			 int k=2;
			 ListNode current=head;
			 ListNode next=null;
			 ListNode pre=null;
			 int count =0;
			 while(count<k && current != null){
				 next = current.getNext();
				 current.setNext(pre);
				 pre = current;
				 current = next;
				 count++;
			 }
			 if(next!=null){
				 head.setNext(reverseAlternateRecurrsive(next));
			 }
			 return pre;
		 }
	
}
