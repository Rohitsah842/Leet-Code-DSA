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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode result=new ListNode(0);
        ListNode temp=result;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;

        }
        if(l1!=null){
            while(l1!=null){
                 int sum=l1.val+carry;
           temp.next=new ListNode(sum%10);
            temp=temp.next;
            carry=sum/10;
            l1=l1.next;
            }
        }
        else{
            while(l2!=null){
                 int sum=l2.val+carry;
             temp.next=new ListNode(sum%10);
            temp=temp.next;
            carry=sum/10;
            l2=l2.next;
            }
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
            temp=temp.next;
        }
        

        return result.next;
    }
}