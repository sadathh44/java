package sorting;
import java.util.*;
//worst=n2 best n
public class seleection_sort3 {
public static void sorting(int[] a)
{
    int max=0;
    for(int i=0;i<a.length-1;i++)
    {
        for(int j=0;j<a.length-i;j++)
        {
            if(a[max]<a[j])
            {
               max=j;
              
            }
        }
         int temp=a[a.length-i-1];
                a[a.length-i-1]=a[max];
                a[max]=temp;
        max=0;
      
    }
} 

public static void main(String[] args) {
    int[] a={1,2,3,4,5};
    sorting(a);
    System.out.println(Arrays.toString(a));
    
}
}
