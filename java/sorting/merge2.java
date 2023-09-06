package sorting;

import java.util.Arrays;

//uses less space as compared to the previous one

//merge sort using recursion

public class merge2 {
    public static void mergesort(int[] a,int s,int e)
    {
        if(e-s==1)
        {
            return;
        }
        int mid=(s+e)/2;
        mergesort(a,s,mid);
        mergesort(a,mid,a.length);
         merges(a,s,mid,e);
    }
    public static void merges(int[] arr,int s,int mid,int e)
    {
        int[] c=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e)
        {
            if(arr[i]<arr[j])
            {
                c[k]=arr[i];
                i++;
            }
            else{
                c[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid )
        {
            c[k]=arr[i];
            i++;
            k++;
        }
           while(j<e )
        {
            c[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<c.length;l++)
        {
            arr[s+l]=c[l];
        }
    }
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        mergesort(a,0,a.length);
        System.out.println(Arrays.toString(a));
        
    }
}
