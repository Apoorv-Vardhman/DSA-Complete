package org.dsa.leetcode.medium;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Program3 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        while (l1.next!=null){
            ListNode listNode1 = new ListNode();
            listNode1.val = l1.val + l2.val;
            if(listNode==null){
                listNode = listNode1;
            }else{
                listNode.next = listNode1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return listNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,null);
        l1.next = new ListNode(4,null);
        l1.next = new ListNode(3,null);

       /* ListNode l2 = new ListNode();
        l2.val = 5;
        ListNode l22 = new ListNode();
        l22.val = 6;
        l2.next = l22;
        ListNode l23 = new ListNode();
        l23.val = 4;
        l2.next = l23;

        ListNode l3 = addTwoNumbers(l1,l2);*/

        while (l1.next!=null){
            System.out.println(l1.val);
        }
    }

}
