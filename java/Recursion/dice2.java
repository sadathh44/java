package Recursion;

import java.util.ArrayList;

public class dice2 {
    static ArrayList<String> dice(String p,int target)
    {
        if(target==0)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
                    ArrayList<String> b=new ArrayList<>();

        for(int i=1;i<=6 && i<=target;i++)
        {
        b.addAll(dice(p+i,target-i)) ;
        }
        return b;
    }
    public static void main(String[] args) {
       System.out.println( dice("",5));;
    }
}
