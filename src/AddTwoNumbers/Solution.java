package AddTwoNumbers;


public class Solution {

	private static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }

		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = null;
		ListNode l2 = null;
		
		int[] data = new int[] {2,4,3};
		for (int i : data) {
			if(l1==null) {
				l1 = new ListNode(i,null);
			}else {
				ListNode listNode = new ListNode(i,null);
				listNode.next = l1;
				l1 = listNode;
			}
		}
		data = new int[] {5,6,4};

		for (int i : data) {
			if(l2==null) {
				l2 = new ListNode(i,null);
			}else {
				ListNode listNode = new ListNode(i,null);
				listNode.next = l2;
				l2 = listNode;
			}
		}
		
//		display(l1);
		display(addTwoNumbers(l1,l2));
	}
	public static void display(ListNode l) {
		while (l!= null) {
			System.out.print(l.val+",");
			l = l.next;
			
		}
	}
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode l4 = null;
		 ListNode nextListNode = null;
		 int car = 0;
		 while (l1!= null || l2 != null || car!=0 ) {
			int l1val = 0;
			int l2val = 0;
			
			if(l1!=null)l1val=l1.val;
			if(l2!=null)l2val=l2.val;
			int sum = l1val + l2val + car;
			car = sum/10;
			sum = sum%10;
			System.out.println(l1val+"\t"+l2val+"\t"+sum+"\t"+car);

			if(l4 == null) {
				l4 = new ListNode(sum);
				nextListNode = l4;
			}else {
				ListNode listNode = new ListNode(sum,null);

				nextListNode.next = listNode;
				nextListNode = listNode;
				
			}
			
			if(l1!=null)l1 = l1.next;
			if(l2!=null)l2 = l2.next;
			
			
		}
		 
		return l4;
	    }

}
