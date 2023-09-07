package stack.problems;

import sorting.insertionsort;
import java.util.Stack;

public class paranthesis {
    public static boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
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
                        return false;
                    }
                       if(ch==')')
                    {
                        if(a.isEmpty() || a.pop()!='(' )
                        return false;
                    }
                       if(ch==']')
                    {
                        if(a.isEmpty() ||  a.pop()!='[')
                        return false;
                    }
                }
        }
        return a.isEmpty();
    }
    public static void main(String[] args) {
        boolean result=isValid("{[()]}");
        System.out.println(result);
    }
}
