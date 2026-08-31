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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> l=new ArrayList<>();
        int count=1;
        ListNode previous=head;
        ListNode current=head.next;
        while(current.next!=null){
            if(current.val>previous.val && current.val>current.next.val){
                l.add(count);
            }
            if(current.val<previous.val && current.val<current.next.val){
                l.add(count);
            }
            count+=1;
            previous=current;
            current=current.next;
        }
        int[] result=new int[2];
        if(count==2 || l.size()==0 || l.size()==1){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        int a=l.get(l.size()-1)-l.get(0);
        int b=99999;
        for(int i=1;i<l.size();i++){
            int d=l.get(i)-l.get(i-1);
            if(d<=b){
                b=d;
            }
        }
        if(a<b){
            result[0]=a;
            result[1]=b;
        }
        else{
            result[0]=b;
            result[1]=a;
        }
        return result;

    }
}