package sorting;
import java.util.*;
//worst=n2 best n
public class selection_sort2{
public static void sorting(int[] a)
{
    for(int i=0;i<a.length-1;i++)
    {
        int min=i;
        for(int j=i+1;j<a.length;j++)
        {
            if(a[j]<a[min])
            {
                min=j;
            }
        }
        int temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    
        
    }
} 

public static void main(String[] args) {
    int[] a={12,4,5,1};
    sorting(a);
    System.out.println(Arrays.toString(a));
    
}
}
