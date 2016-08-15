package com.avinash.datastructure.list;

class JosephusCircle {
	
	public static void main(String avi[]){
	
		ClNode head = new ClNode(1);
		head.insert(head,new ClNode(2));
		head.insert(head,new ClNode(3));
		head.insert(head,new ClNode(4));
		head.insert(head,new ClNode(5));
		head.insert(head,new ClNode(6));
		head.insert(head,new ClNode(7));
		head.insert(head,new ClNode(8));
		head.insert(head,new ClNode(9));
		head.insert(head,new ClNode(10));
		head.insert(head,new ClNode(2));
		
	}
	
	
	
}