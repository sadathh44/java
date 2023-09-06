package problems;

import java.util.Arrays;

public class array {
 public static void main(String[] args) {
    int [] a={12,34,54,11};
       
            for(int i=0;i<(a.length+1)/2;i++)
            {
                int temp=a[i];
                a[i]=a[a.length-i-1];
                a[a.length-i-1]=temp;
            }
        
    System.out.println(Arrays.toString(a));   
    }
 }   

