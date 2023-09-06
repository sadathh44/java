package stack;

public class stackpro {
    public int[] data;
    private static final int default_size=10;
    int ptr=-1;
    public stackpro()
    {
        this(default_size);
    }

    public stackpro(int size)
    {
        this.data=new int[size];
    }

    public boolean push( int val)
    {
        if(isFull())
        {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }
   
    public int pop() throws stackexception
    {
        if(isEmpty())
        {
            throw new stackexception("Cannot pop from empty stack");
        }
        return data[ptr--];
    }
    public int peek() throws stackexception
    {
        if(isEmpty())
        {
            throw new stackexception("Cannot peek from empty stack");

        }
        return data[ptr];
    }
    public boolean isFull()
    {
        return ptr==data.length-1;
    }
    public boolean isEmpty()
    {
        return ptr==-1;
    }

}
