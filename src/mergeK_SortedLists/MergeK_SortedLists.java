package mergeK_SortedLists;


public class MergeK_SortedLists {
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
	
	 public static ListNode mergeKLists(ListNode[] lists) {
		return mergeKSortedLists(lists,0,lists.length);
	        
	    }

	
public static ListNode mergeKSortedLists(ListNode[] lists, int start, int end) {
        if(start == end) {
        	return lists[0];
        }
        int mid = start + (end-start)/2;
       ListNode leftNode = mergeKSortedLists(lists, start, mid);
       ListNode rightNode = mergeKSortedLists(lists, mid+1, end);
        
        return merge(leftNode, rightNode);
    }




private static ListNode merge(ListNode leftNode, ListNode rightNode) {
    ListNode head = new ListNode();
    ListNode current = new ListNode();
    head = current;

	while(leftNode!=null || rightNode!=null) {
		if(leftNode==null) {
			current.next = rightNode;
		}else if(rightNode == null) {
			current.next = leftNode;
		}else if(leftNode.val < rightNode.val) {
			current.next = leftNode;
			leftNode = leftNode.next;
			current = current.next;
		}else {
			current.next = rightNode.next;
			rightNode = rightNode.next;
			current = current.next;
		}
	}
	
	return head.next;
}
}
