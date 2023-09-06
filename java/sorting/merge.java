package sorting;

import java.util.Arrays;

//merge sort using recursion

//not in place : takes more space
public class merge {
    public static int[] mergesort(int[] a)
    {
        if(a.length==1)
        {
            return a;
        }
        int mid=a.length/2;
        int[] left=mergesort(Arrays.copyOfRange(a, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(a, mid, a.length));
        return merges(left,right);
    }
    public static int[] merges(int[] left,int[] right)
    {
        int[] c=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                c[k]=left[i];
                i++;
            }
            else{
                c[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length )
        {
            c[k]=left[i];
            i++;
            k++;
        }
           while(j<right.length )
        {
            c[k]=right[j];
            j++;
            k++;
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        a=mergesort(a);
        System.out.println(Arrays.toString(a));
        
    }
}
