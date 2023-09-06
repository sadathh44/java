package sorting;

import java.util.Arrays;
//it should be within range of 1 to n
public class cyclesort {
  
    static void sorting(int[] a)
    {
        int i=0;
        while(i<a.length)
        {
            int correct=a[i]-1;
            if(a[i]!=a[correct])
            {
                swap(a, i, correct);
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int[] a,int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }

      public static void main(String[] args) {
            int[] a={5,3,2,2,1,4};
            sorting(a);
            System.out.println(Arrays.toString(a)); 
    }
}
 