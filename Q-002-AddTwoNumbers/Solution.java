/**
 * Definition for singly-lined list.
 * public class ListNode  {
 *     int val;
 *     ListNode next;
 *     ListNode(int x ) {var = x;}
 * }
 */
class Solution{

    public ListNode resList = new ListNode(0);
    public ListNode head = resList;
    public int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int sum = l1.val + l2.val + carry;
        carry = sum / 10;
        resList.next = new ListNode(sum % 10);
        resList = resList.next;

        if(l1.next != null && l2.next != null){
            addTwoNumbers(l1.next, l2.next);
        } else if (l1.next !=null){
            addTwoNumbers(l1.next, new ListNode(0));
        } else if (l2.next !=null){
            addTwoNumbers(new ListNode(0), l2.next);
        } else if (carry > 0 ){
            resList.next = new ListNode(1);
            resList = resList.next;
        }
        return head.next;
    }

    public ListNode arrayToNodeList(int[] dataList){

        ListNode resultList = new ListNode(0);
        ListNode headNode = resultList;
        if (dataList == null){
            return headNode.next;
        }

        for (int i=0; i<dataList.length; i++){
            resultList.next = new ListNode(dataList[i]);
            resultList = resultList.next;
        }

        return headNode.next;
    
    }

    public static void main(String[] args){
        Solution solution = new Solution();

        // Data Initiation
       int[] dataList = new int[]{6, 7, 8, 9}; 
       ListNode l1 = solution.arrayToNodeList(dataList);
       l1.print();
        
        dataList = new int[]{5, 6, 7}; 
        ListNode l2 = solution.arrayToNodeList(dataList);
        l2.print();

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println("Result:");
        result.print();

    }
}