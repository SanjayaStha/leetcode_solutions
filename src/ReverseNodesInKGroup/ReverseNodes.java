package ReverseNodesInKGroup;

public class ReverseNodes {

    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = k-1;
        ListNode headNode = new ListNode();
        ListNode nextNode = new ListNode();
        ListNode prevNode = new ListNode();
        ListNode lastNode = new ListNode();
        ListNode transNode = new ListNode();
        nextNode.next = head;
        headNode.next = head;
        prevNode.next = head;
        lastNode.next = head;
        transNode.next = head;

        int i = 0;
        while(head == null){

            if(i+1 % k == 0){
                prevNode = head;
            }
            if(i-1 % k == 0){
                nextNode = head;
            }
            if(i%k == 0){
                transNode = prevNode.next;
                prevNode.next =head;
                prevNode.next.next = transNode;
                lastNode = head;
            }

            head = head.next;
            i++;
        }

        return headNode.next;
    }
}
