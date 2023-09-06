package problems;

import java.util.ArrayList;

//time: (sqrt(n))
public class factors1 {
    public static void main(String[] args) {
        int a=20;
        ArrayList<Integer> list=new ArrayList<>();
      
         for(int i=1;i*i<=a;i++)
        {
            if(a%i==0)
            {
                if(a/i==i)
                {
                    System.out.print(i+" ");
                }
                else{

                    System.out.print(i+" ");
                    list.add(a/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
            
        }
    }
    
}
