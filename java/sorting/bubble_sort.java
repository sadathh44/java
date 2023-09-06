package sorting;
import java.util.*;
//worst=n2 best n
public class bubble_sort {
public static void sorting(int[] a)
{
    int count=0;
    boolean swap;
    for(int i=0;i<a.length;i++)
    {
        swap =false;
        for(int j=1;j<a.length-i;j++)
        {
            if(a[j]<a[j-1])
            {
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                swap=true;
                count++;  
            }
        }
        if(!swap)
        { 
            break;
        }
        
    }
    System.out.println(count);
} 

public static void main(String[] args) {
    int[] a={1,2,3,4,5};
    sorting(a);
    System.out.println(Arrays.toString(a));
    
}
}
