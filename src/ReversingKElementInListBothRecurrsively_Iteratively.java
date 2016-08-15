package com.avinash.datastructure.list;

public class ReversingKElementInListBothRecurrsively_Iteratively {

	public static void main(String[] args) {
		ReversingKElementInListBothRecurrsively_Iteratively list = new ReversingKElementInListBothRecurrsively_Iteratively();
		ListNode head = new ListNode(1);
		head = head.insertNode(head, new ListNode(2), head.size()+1);
		head = head.insertNode(head, new ListNode(3), 3);
		head = head.insertNode(head, new ListNode(4), 4);
		head = head.insertNode(head, new ListNode(5), head.size());
		head = head.insertNode(head, new ListNode(6), head.size());
		head = head.insertNode(head, new ListNode(7), head.size());
		head = head.insertNode(head, new ListNode(8), head.size());
		head = head.insertNode(head, new ListNode(9), head.size());
		head = head.insertNode(head, new ListNode(10), head.size());
		head = head.insertNode(head, new ListNode(11), head.size());
		head = head.insertNode(head, new ListNode(12), head.size());
		head.displayList(head);
		System.out.println("After reversing");
		head = list.recurrsiveApproach(head,2);
		//head = list.reversingKthNode(head, 7);
		head.displayList(head);
	}
	 public ListNode reversingKthNode(ListNode head,int k){
		 
		 ListNode temp=null;
		 ListNode temp1=null;
		 ListNode curr=null;
		 ListNode curr1=null;
		 ListNode next=null;
	     curr = head; 
	     int times = 0;
		
		 while(curr!=null && hasKnode(curr,k-1)){
			 int i=0;
			 while(i<k){
				 next = curr.getNext(); 
				 curr.setNext(temp);
				 temp = curr;
				 curr = next;
				 i++;
			 }
			 if(times==0){
				 temp1 = head;
				 curr1 = curr;
				 head = temp;
				 temp = null;
				 times=1;
			 }
			 else if(times==1){
				 temp1.setNext(temp);
				 temp1=curr1;
				 curr1=curr;
				 temp=null;
				 times=1;
			 }
			 if(hasKnode(curr, k-1)==false){
				 temp1.setNext(curr1);
			 }
				 
		// head.displayList(head);
		 }
		 return head;
	 }
	
	 boolean hasKnode(ListNode head ,int k){
		 boolean isfound = false;
		 int i=0;
		 for(i = 0;head!=null&&(i<=k);i++,head=head.getNext()){
			 if(i==k)
				 isfound = true;
		 }
		 return isfound;
	 }
	 
	 public ListNode recurrsiveApproach(ListNode head,int k){
		 
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
			 head.setNext(recurrsiveApproach(next, k));
		 }
		 return pre;
	 }

}
