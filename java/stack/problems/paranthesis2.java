package stack.problems;

import sorting.insertionsort;
import java.util.Stack;
//min adds to make parathesis valid
public class paranthesis2 {
    public static void isValid(String s) {
        Stack<Character> a=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray())
        {
                if(ch=='{'|| ch=='(' || ch=='[')
                {
                    a.push(ch);
                }
                else{
                    if(ch=='}')
                    {
                        if(a.isEmpty() || a.pop()!='{')
                        count++ ;
                    }
                       if(ch==')')
                    {
                        if(a.isEmpty() || a.pop()!='(' )
                        count++ ;
                    }
                       if(ch==']')
                    {
                        if(a.isEmpty() ||  a.pop()!='[')
                        count++ ;
                    }
                }
        }
         while(!a.isEmpty())
        {
            count++;
            a.pop();
        }
       
       
        System.out.println(count);
    }
    public static void main(String[] args) {
      isValid(")))");
        
    }
}
