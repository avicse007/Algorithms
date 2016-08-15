package com.avinash.datastructure.list;

public class CircularListDivide {
	
	public static void main(String[] args) {
		ClNode head = new ClNode(1);
		head.insert(head,new ClNode(2));
		head.insert(head,new ClNode(3));
		head.insert(head,new ClNode(4));
		head.insert(head,new ClNode(5));
		head.insert(head,new ClNode(6));
		head.insert(head,new ClNode(7));
		head.insert(head,new ClNode(8));
		head.insert(head,new ClNode(9));
		head.display(head);
		ClNode mid = head.getMidNode(head);
		System.out.println("Mid element "+mid.data);
		head.splitCirculrList(head);
	}

}

class ClNode{
	public ClNode next;
	public int data;
	public int size;
	ClNode(int data){
		this.data = data;
		this.next = this;
		size++;
	}
	public ClNode insert(ClNode head,ClNode nodeToBeInserted){
		ClNode curr = head;
		while(curr.next!=head){
			curr=curr.next;
		}
		curr.next=nodeToBeInserted;
		nodeToBeInserted.next=head;
		return head;
	}
	public void display(ClNode head){
		ClNode curr=head;
		while(curr.next!=head){
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println(curr.data+"-->");
	}
	public ClNode getMidNode(ClNode head){
		ClNode curr =head.next.next;
		ClNode slow =head;
		while(curr.next!=head){
			curr=curr.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public void splitCirculrList(ClNode head){
		ClNode mid = head.getMidNode(head);
		ClNode curr =head;
		while(curr.next!=mid){
			curr=curr.next;		
		}
		ClNode list2 = curr.next;
		curr.next=head;
		curr = head;
		System.out.println("List 1");
		curr.display(curr);
		System.out.println();
		curr = list2;
		while(curr.next!=head){
			curr=curr.next;
		}
		curr.next=list2;
		curr=list2;
		System.out.println("List 2");
		curr.display(curr);
	}

}