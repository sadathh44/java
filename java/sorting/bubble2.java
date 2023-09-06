package sorting;

import java.util.Arrays;

public class bubble2 {
    static void sort(int[] a)
    {
        int count1=0,count2=1;
        while(count1<a.length)
        {
            while(count2<a.length-count1)
            {
                if(a[count2]<a[count2-1])
                {   
                    int temp=a[count2];
                    a[count2]=a[count2-1];
                    a[count2-1]=temp;
                }
                count2++;
            }
            count2=1;
            count1++;
        }
    }
    public static void main(String[] args) {
        int[] a={12,45,2,3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
