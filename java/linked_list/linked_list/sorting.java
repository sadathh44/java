package linked_list;

public class sorting {
    

    //merging code
    public ListNode merge(ListNode list1, ListNode list2) {

        ListNode ans=new ListNode();
       ListNode tail=ans;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                 tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        while(list1!=null)
        {
          tail.next=list1;
                list1=list1.next;
                tail=tail.next;
        }
        while(list2!=null)
        {
           tail.next=list2;
                list2=list2.next;
                tail=tail.next;
        }
        return ans.next;
        
    }
    
}
