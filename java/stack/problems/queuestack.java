package stack.problems;

import java.util.Stack;
//dumb question
public class queuestack {
    Stack<Integer> left=new Stack<>();
        Stack<Integer> right=new Stack<>();
  
    public void add(int item)
    {
        while(!left.isEmpty())
        {
            right.push(left.pop());
        }
        left.push(5);
        while(!right.isEmpty())
        {
            left.push(right.pop());
        }

    }
    public int remove()
    {
           return left.pop();
    }
    public int peeked()
    {

        return left.peek();
    }
    public static void main(String[] args) {
        queuestack obj=new queuestack();
        for(int i=1;i<8;i++)
        {
            obj.add(i);
        }
       System.out.println( obj.remove());;
    }
}
