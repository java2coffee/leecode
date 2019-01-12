public class ListNode  {
    int val;
    ListNode next;
    ListNode(int x ) {
        val = x;
    }

    public void print(){
        System.out.print(val);
        if(next != null) {
            System.out.print("->");
            next.print();
        }else{
            System.out.println("");
        }
    }
}