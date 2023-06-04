package removeNthNodeFromEndOfList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class RemoveNthNodeFromEndOfList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
		 ListNode d = new ListNode();
		 d.next = head;
		 ListNode last = d;
		 ListNode first = d;
		 
		 for(int i=0;i<n+1;i++) {
			 last = last.next;
		 }
		 
		 while(last != null) {
			 last = last.next;
			 first = first.next;
		 }
		 
		 first.next = first.next.next;
		 
		 return d.next;
	    }
	
}
