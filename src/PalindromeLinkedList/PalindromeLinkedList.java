package PalindromeLinkedList;

public class PalindromeLinkedList {


      public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {

          boolean isPalindrome = false;


        ListNode tail = new ListNode();
        tail = head;
        ListNode orginal = new ListNode();
        orginal = head;
        ListNode tailHead = new ListNode();
        tailHead = tail;
        head = head.next;
          while (head.next!=null){
              if(head.val == tailHead.val){
// even no palindrome
                  while (head != null && tail != null){
                      if(head.val == tail.val){
                          head = head.next;
                          tail = tail.next;
                          isPalindrome = true;
                          continue;
                      }else {
                          isPalindrome = false;
                          break;
                      }


                  }

              }else if(head.val == tail.next.val){
//                  odd no palindrome
                  tail = tail.next;
                  while (head != null && tail != null){
                      if(head.val == tail.val){
                          head = head.next;
                          tail = tail.next;
                          isPalindrome = false;
                          continue;
                      }else {
                          isPalindrome = false;
                          break;
                      }
                  }


              }else{

                  isPalindrome = false;
                  tailHead = head;
                  tailHead.next = tail;
                  tail = tailHead;
                  head = head.next;

              }

              if(head == null && tail == null && isPalindrome){
                  return true;
              }else{
                  head = tailHead;
                  tail = tailHead;
              }

          }



          return false;
    }

}
