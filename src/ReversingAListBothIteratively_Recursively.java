package com.avinash.datastructure.list;

public class ReversingAListBothIteratively_Recursively {

	public static void main(String[] args) {
		ReversingAListBothIteratively_Recursively list = new ReversingAListBothIteratively_Recursively();
		ListNode head = new ListNode(0);
		head = head.insertNode(head, new ListNode(1), head.size()+1);
		head = head.insertNode(head, new ListNode(2), 3);
		head = head.insertNode(head, new ListNode(3), 4);
		head = head.insertNode(head, new ListNode(4), head.size());
		head = head.insertNode(head, new ListNode(5), head.size());
		head = head.insertNode(head, new ListNode(6), head.size());
		head = head.insertNode(head, new ListNode(7), head.size());
		head.displayList(head);
		System.out.println("After reversing");
		//head = list.reverseList(head);
		head = list.reverseListRecurrsive(head);
		head.displayList(head);
	}
	
	/*
	 * Start with 1->2->3->4->Null
	 * then null<-1<-2<-3<-4
	 * 
	 */
	
	public ListNode reverseList(ListNode head){
		ListNode temp = null;
		ListNode nextNode =null;
		while(head!=null){
			nextNode = head.getNext();
			head.setNext(temp);
			temp = head;
			head = nextNode;
		}
		return temp;
	}
	
	public ListNode reverseListRecurrsive(ListNode head){
		ListNode second=null;
		ListNode curr=head;
		ListNode next = null;
		if(head.getNext() == null){
			head.setNext(next);
			return head;
			}
		else{
			second = curr.getNext();
			curr.setNext(null);
			ListNode prev=reverseListRecurrsive(second);
			second.setNext(head);
			return prev;
		}
	}
}
