package sorting;

import java.util.Arrays;

public class quicksort {
    //recurrence relation: t(n)=t(k)+t(n-k-1)+O(n) | o(n) to for putting pivot element in right position  
//worst case: t(0) +t(n-1)+O(n) -> O(n^2)
//best case: t(n/2)+t(n/2)+O(n) -> O(nlogn)

//not stable
//in place cuz no extra space i.e apart from recursion no extra memory space is being taken
//merge sort is prefereed in linked list  becase ll is not continous memory allocation
    public static void main(String[] args) {
        int[] a={12,54,13,45};
        sorting(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }

    static void sorting(int[] a,int low,int high)
    {
            if(low>=high)
            {
                return;
            } 
            int s=low;
            int e=high;
            int m=s+(e-s)/2;
            int pivot=a[m];
            while(s<=e)
            {
                while(a[s]<pivot)
                {
                    s++;
                }
                while(a[e]>pivot)
                {
                    e--;
                }
                if(s<=e)
                {
                    int temp=a[s];
                    a[s]=a[e];
                    a[e]=temp;
                    s++;
                    e--;
                }
            }
            sorting(a, low, e);
            sorting(a, s, high);
    }
}
