package mergeTwoSortedLists;


//import removeNthNodeFromEndOfList.RemoveNthNodeFromEndOfList.ListNode;

public class MergeTwoSortedLists {

	private static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    	ListNode head = new ListNode();
    	ListNode tail = new ListNode();

    	head.next = tail;
    	
    	while(list1 != null && list2 !=null) {
    		
    		if(list1.val > list2.val) {
    			tail.next = list2;
                list2 = list2.next;
                tail = tail.next;

                
    		}else {
    			tail.next = list1;
                list1 = tail.next;
                tail = tail.next;


    		}
    		
    	}
        
    	if(list1 == null) {
			tail.next = list2;
            tail = tail.next;

			
		}
		if(list2 == null) {
			tail.next = list1;	
            tail = tail.next;

		}
    		
    		
    	return head.next;
    }
}
