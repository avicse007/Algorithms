package com.avinash.datastructure.list;

public class Finding_RemovingLoopInAList {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
        linkedList.appendIntoTail(new Node("101"));
        Node cycle =(new Node("201"));
        linkedList.appendIntoTail(cycle);
        linkedList.appendIntoTail(new Node("301"));
        linkedList.appendIntoTail(new Node("401"));
        linkedList.appendIntoTail(new Node("501"));
        linkedList.appendIntoTail(new Node("601"));
        linkedList.appendIntoTail(new Node("701"));
        linkedList.appendIntoTail(new Node("801"));
        linkedList.appendIntoTail(cycle);
        if(linkedList.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        } 
        System.out.println("Linked List : " + linkedList);
        if(linkedList.isCyclic()){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }
	}

}

 class Node {
    Node next;
    private String data;

    public Node(String data) {
        this.data = data;
    }

    public String data() { return data; }
    public void setData(String data) { this.data = data;}

    public Node next() { return next; }
    public void setNext(Node next) { this.next = next; }

    @Override
    public String toString() {
        return this.data;
    }
}
 
class LinkedList {
	    private Node head;
	    public LinkedList() { this.head = new Node("head"); }   
	    public Node head() { return head;}
	   
	    public void appendIntoTail(Node node) {
	        Node current = head;
	       
	        //find last element of LinkedList i.e. tail
	        while(current.next() != null){
	            current = current.next();
	        }
	        //appending new node to tail in LinkedList
	        current.setNext(node);
	    }
	    
	    public String toString(){
	        StringBuilder sb = new StringBuilder();
	        Node current = head.next();
	        while(current != null){
	           sb.append(current).append("-->");
	           current = current.next();
	        }
	        sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
	       return sb.toString();
	    }
	    
	    public boolean isCyclic(){
	        Node fast = head;
	        Node slow = head;
	       
	        while(fast!= null && fast.next != null){
	            fast = fast.next.next;
	            slow = slow.next;
	           
	            //if fast and slow pointers are meeting then LinkedList is cyclic
	            if(fast == slow ){
	            	System.out.println("Loop found");
	                fast = head;
	                //Finding start of the loop
	                while(fast!=slow){
	                	fast=fast.next;
	                	slow = slow.next;
	                }
	            	System.out.println("Loops start at "+fast.next.data());
	            	//eleminating the loop
	            	
	            	Node start = fast.next;
	            	fast=start;
	            	while(fast.next!=start)
	            		fast=fast.next;
	            	fast.next=null;
	            	return true;
	            }
	        }
	        return false;
	    }
}