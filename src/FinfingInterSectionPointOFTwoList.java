package com.avinash.datastructure.list;

public class FinfingInterSectionPointOFTwoList {

	public static void main(String[] args) {
		FinfingInterSectionPointOFTwoList obj = new FinfingInterSectionPointOFTwoList();
		ListNode head = new ListNode(0);
		head = head.insertNode(head, new ListNode(1), head.size()+1);
		head = head.insertNode(head, new ListNode(2), 3);
		head = head.insertNode(head, new ListNode(3), 4);
		head = head.insertNode(head, new ListNode(4), head.size());
		head = head.insertNode(head, new ListNode(5), head.size());
		head = head.insertNode(head, new ListNode(6), head.size());
		head = head.insertNode(head, new ListNode(7), head.size());
		System.out.println("Displaying list one");
		head.displayList(head);
		
		ListNode head1 = new ListNode(20);
		head1 = head1.insertNode(head1, new ListNode(21), head1.size());
		head1 = head1.insertNode(head1, new ListNode(22), head1.size()+1);
		head1 = head1.insertNode(head1, new ListNode(23), head1.size());
		head1 = head1.insertNode(head1, new ListNode(24), head1.size());
		head1 = head1.insertNode(head1, new ListNode(4),  head1.size());
		head1 = head1.insertNode(head1, new ListNode(25), head1.size());
		head1 = head1.insertNode(head1, new ListNode(26), head1.size());
		head1 = head1.insertNode(head1, new ListNode(27), head1.size());
		System.out.println("Dislaying List two"); 
		head1.displayList(head1);
		System.out.println("Size of head "+head.size());
		System.out.println("Size of head1 "+head1.size());
		if(obj.findIntersection(head, head1)!=null)
		System.out.println("Intersection Point of the two list is "+obj.findIntersection(head, head1).getData());
		//Get the size of both the list 
		System.out.println("List are not intersecting");
		
		
	}
	public ListNode findIntersection(ListNode head1,ListNode head2){
	ListNode intersectionNode = null;
	int count =0;
	int size1 = head1.size();
	int size2 = head2.size();
	if(size1>size2){
		int diff =size1-size2;
		while(head1.getNext()!=null&&head2.getNext()!=null){
			head1=head1.getNext();
			count++;
			if(count>=diff){
				head2=head2.getNext();
			}
			if(head1.getData()==head2.getData())
				intersectionNode =head1;
				break;
		}
	}
	else if(size1<size2){
		int diff =size2-size1;
		while(head1.getNext()!=null&&head2.getNext()!=null){
			head2=head2.getNext();
			count++;
			if(count>=diff){
				head1=head1.getNext();
			}
			if(head1.getData()==head2.getData())
				intersectionNode =head1;
				break;
		}
		}
	else{
		int diff =size2-size1;
		while(head1.getNext()!=null&&head2.getNext()!=null){
			head2=head2.getNext();
			count++;
			if(count>=diff){
				head1=head1.getNext();
			}
			if(head1.getData()==head2.getData())
				intersectionNode =head1;
				//break;
		}
		}
	
	
	
	return intersectionNode;
	}
}
