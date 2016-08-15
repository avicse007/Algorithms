package com.avinash.datastructure.list;

public class MovingAllTheZeroAtEndINLIST {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.insertNode(head,new ListNode(2),head.size()+1);
		head.insertNode(head,new ListNode(0),head.size());
		head.insertNode(head,new ListNode(0),head.size());
		head.insertNode(head,new ListNode(0),head.size());
		head.insertNode(head,new ListNode(3),head.size());
		head.insertNode(head,new ListNode(0),head.size());
		head.displayList(head);
		int size = head.size();
		ListNode curr = head;
		ListNode nonZero = head;
		for(int i=1;i<size;i++){
			if(curr.getData()!=0){
				nonZero.setData(curr.getData());
				nonZero=nonZero.getNext();
			}
			curr=curr.getNext();		
		}
		
		while(nonZero.getNext()!=null){
			nonZero = nonZero.getNext();
			nonZero.setData(0);
		}
		
		System.out.println("Moving all the zeros at the end");
		head.displayList(head);
		
	}

}
