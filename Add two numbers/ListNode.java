import java.util.ArrayList;
import java.util.Stack;

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {

        ListNode current = new ListNode();
        current = l1;
        ListNode nextnode = new ListNode();

        ArrayList<Integer> arrresult = new ArrayList<Integer>();

        int i = 0, j = 0,  sum1 = 0 , sum2 = 0, sumresult = 0;

        while (current != null) 
        {
            nextnode = current.next;
            arrresult.add(i, current.val);
            current = nextnode;
        }

        for (int num : arrresult) 
        {
            sum1 = sum1 * 10 + num;
        }

        arrresult.clear();

        current = l2;

        while (current != null) 
        {
            nextnode = current.next;
            arrresult.add(i, current.val);
            current = nextnode;
        }

        for (int num : arrresult) 
        {
            sum2 = sum2 * 10 + num;
        }
        
        sumresult = sum1 + sum2;

        ListNode result = new ListNode();

        arrresult.clear();

        ListNode dummyHead = null;
        ListNode currn = null;

        if (sumresult == 0) {
            dummyHead = new ListNode(0);
        } else {
            while (sumresult > 0) {
                int digit = sumresult % 10;
                sumresult /= 10;


                ListNode newNode = new ListNode(digit);
                if (dummyHead == null) {
                    dummyHead = newNode; 
                    currn = newNode;
                } else {
                    currn.next = newNode; 
                    currn = newNode;
                }
            }
        }

        return dummyHead;
    }

    public static void main(String args[])
    {
        Solution mySolution = new Solution();

        ListNode l1_2 = new ListNode(3);
        ListNode l1_1 = new ListNode(4, l1_2);
        ListNode list1 = new ListNode(2, l1_1);

        ListNode l2_2 = new ListNode(4);
        ListNode l2_1 = new ListNode(6, l2_2);
        ListNode list2 = new ListNode(5, l2_1);

        ListNode result = mySolution.addTwoNumbers(list1, list2);
    }
}