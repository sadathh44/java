package stack.problems;
import java.util.Stack;
//maximum count of nnumbers in sum
public class stacksum {

    public static int count(Stack<Integer> s1,Stack<Integer> s2,int maxsum)
    {
        //-1 because if we look at recursion tree then well get to know
        return display(s1,s2, maxsum,0,0)-1;
    }
    public static int display(Stack<Integer> s1,Stack<Integer> s2,int maxsum,int current,int count)
    {
        if(current>=maxsum)
        {
            return count;
        }
        if( s1.empty() || s2.empty())
        {
            return count;
        }
        int ans1=display(s1,s2,maxsum,current+s1.pop(),count++);
        int ans2=display(s1,s2,maxsum,current+s2.pop(),count++);
        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
          int arr[] = { 5,8,1,2 };
    int brr[] = { 1,6,4,3,1};
 Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
  
    for(int i=0;i<arr.length;i++)
    {
        s1.add(arr[i]);
        s2.add(brr[i]);
    }
    int maxsum=10;
    int result=count(s1,s2,maxsum);
    System.out.println(result);
    }
   

    
}
