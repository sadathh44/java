package sorting;

import java.util.Arrays;
//n2 complexity worst , best n complexity || no of comparisions is less than bubble sort
public class insertionsort {
    static void sorting(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    swap(a,j,j-1);
                }
                else
                {
                    break;
                }
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
       int[] a={12,4,5,1};
    sorting(a);
    System.out.println(Arrays.toString(a)); 
    }
}
