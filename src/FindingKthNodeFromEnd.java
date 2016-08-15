package com.avinash.datastructure.list;

public class FindingKthNodeFromEnd {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(0);
		head = head.insertNode(head, new ListNode(1), head.size()+1);
		head = head.insertNode(head, new ListNode(2), 3);
		head = head.insertNode(head, new ListNode(3), 4);
		head = head.insertNode(head, new ListNode(4), head.size());
		head = head.insertNode(head, new ListNode(5), head.size());
		head = head.insertNode(head, new ListNode(6), head.size());
		head = head.insertNode(head, new ListNode(7), head.size());
		head.displayList(head);
		System.out.println("Display the Kthnode ");
		FindingKthNodeFromEnd obj = new FindingKthNodeFromEnd();
		System.out.println(obj.findKFromEnd(head, 9).getData());

	}
	
	public ListNode findKFromEnd(ListNode head,int k){
		ListNode curr=head;
		ListNode KthNode = head;
		int count=0;
		if(k<1||k>head.size()){
			System.out.println("Invalid position");
			return null;
		}
		while(curr!=null){
			curr=curr.getNext();
			count++;
			if(count>k)
				KthNode = KthNode.getNext();
		}
		return KthNode;
		
	}

}
