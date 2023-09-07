package stack.problems;
import java.util.Stack;
//queue using stack inseert efficient
public class queueusingstack {
    Stack<Integer> left=new Stack<>();
        Stack<Integer> right=new Stack<>();

    public void add(int item)
    {
        left.push(item);
    }
    public int remove()
    {
            while(!left.isEmpty())
            {
                int element=left.pop();
                right.push(element);
            }
            int element=right.pop();
            while(!right.isEmpty())
            {
                left.push(right.pop());
            }
            return element;
    }
    public int peek()
    {

            while(!left.isEmpty())
            {
                int element=left.pop();
                right.push(element);
            }
            int peeked=right.peek();
            while(!right.isEmpty())
            {
                left.push(right.pop());
            }
            return peeked;
    }
    public static void main(String[] args) {
        queueusingstack obj=new queueusingstack();
        for(int i=1;i<8;i++)
        {
            obj.add(i);
        }
       System.out.println( obj.remove());;
    }

}


