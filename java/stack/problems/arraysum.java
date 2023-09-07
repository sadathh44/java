package stack.problems;
import java.util.Arrays;
//maximum count of nnumbers in sum
public class arraysum {

    public static int count(int[] s1,int[] s2,int maxsum)
    {
        //-1 because if we look at recursion tree then well get to know
        return display(s1,s2, maxsum,0,0)-1;
    }
    public static int display(int[] s1,int[] s2,int maxsum,int current,int count)
    {
        if(current>maxsum)
        {
            return count;
        }
        if( s1.length==0|| s2.length==0)
        {
            return count;
        }
        int ans1=display(Arrays.copyOfRange(s1, 1, s1.length),s2,maxsum,current+s1[0], count++);
        int ans2=display(s1,Arrays.copyOfRange(s2,1,s2.length),maxsum, current+s1[0], count++);
        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
    int arr[] = { 8,2,3,4,5 };
    int brr[] = {6,7,8,9};

    int maxsum=10;
    int result=count(arr,brr,maxsum);
    System.out.println(result);
    }
   

    
}
