package com.avinash.datastructure.list;

import java.util.HashMap;
import java.util.Map;

public class ListNode {
	private int data;
	private ListNode next;
	private int size;
	public ListNode(int data){
		this.data = data;
		this.next = null;
		this.size++;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	public int size(){
		return this.size;
	}
	
	public ListNode insertNode(ListNode head,ListNode node,int position){
		if(head==null){
			return node;
			}
		else{
			if(position==1){
				node.setNext(head);
				node.size = head.size++;
				return head=node;
			}
			else if(position== head.size()+1){
				ListNode temp = head;
				while(temp.next!=null){
					temp = temp.next;
				}
				temp.setNext(node);
				head.size++;
				return head;
			}
			else if(position>1 && position<head.size()+1){
				ListNode previous =head;
				int count =0;
				while(previous.next!=null){
					if(count==position-1){
						break;
						}
					previous = previous.next;
					count++;
				}
				ListNode temp = previous.next;
				previous.setNext(node);
				node.setNext(temp);
				head.size++;
				return head;
			}
			return null;
		}
		
	}
/*	public int size(ListNode head){
		int count =0;
		if(head==null)
			return 0;
		else{
			while(head.next!=null){
				head = head.next;
				count++;
			}
			return count;
			
		}
	}*/
	public void displayList(ListNode head){
		if(head==null)
			System.out.println("Empty list");
		else{
			while(head!=null){
				System.out.print(head.data+" ,");
				head = head.next;
			}
			System.out.println();
		}
	}
	public ListNode remove(ListNode head,int position){
		if(position<1 && position > head.size+1){
			System.out.println("Wrong position");
			return head;
		}
		else if(position == 1){
			head = head.next;
			head.size--;
			return head;
		}
		else if(position == head.size+1){
			int count =0;
			ListNode previous = head;
			while(previous.next!=null){
				if(count == position-1){
					break;
				}
				previous = previous.next;
				count++;
			}
			previous.next = null;
			return head;
		}
		else if(position>1 && position<head.size+1){
			int count = 0;
			ListNode temp = null ;
			ListNode previous = head;
			while(previous.next!=null){
					if(count==position-1){
						break;
					}
					previous = previous.next;
					count++;
			}
			temp = previous.next;
			previous.setNext(temp.next);
			return head;
		}
		else
			return null;
		
	}
	
	
	
	
	public static void main(String avi[]){
		ListNode head = new ListNode(0);
		head = head.insertNode(head, new ListNode(1), head.size+1);
		head = head.insertNode(head, new ListNode(2), 3);
		head = head.insertNode(head, new ListNode(3), 4);
		head = head.insertNode(head, new ListNode(4), head.size);
		head = head.insertNode(head, new ListNode(5), head.size);
		head = head.insertNode(head, new ListNode(6), head.size);
		head = head.insertNode(head, new ListNode(7), head.size);
		head = head.insertNode(head, new ListNode(9), 4);
		head = head.insertNode(head, new ListNode(19), 1);
		head = head.insertNode(head, new ListNode(19), head.size+1);
		head.displayList(head);
		head = head.remove(head, 1);
		head.displayList(head);
		head = head.remove(head, head.size);
		head.displayList(head);
		head = head.remove(head, 4);
		head.displayList(head);
	}
	
	public void displayListWithLoops(ListNode head){
		Map<ListNode,Integer> map =new HashMap<>();
		ListNode curr= head;
		while(map.keySet()==null || !(map.containsKey(curr)) ){
			map.put(curr, curr.getData());
			System.out.print(curr.getData()+",");
		}
		System.out.println();
	}

}
