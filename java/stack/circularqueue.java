package stack;

public class circularqueue {
    protected int[] data;
    private static final int default_size=10;
    protected int end=0;
    protected int start=0;
    protected int size=0;

    public circularqueue()
    {
        this(default_size);
    }

    public circularqueue(int size)
    {
        this.data=new int[size];
    }

    public boolean insert( int val)
    {
        if(isFull())
        {
            System.out.println("circular queue is full");
            return false;
        }
    
        data[end++]=val;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws queueexception
    {
        if(isEmpty())
        {
            throw new queueexception("Cannot pop further");
        }
        int removed=data[start++];
        start=start%data.length;
        size--;


        return removed;
    }
    public boolean isFull()
    {
        return size==data.length;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int front() throws queueexception
    {
        if(isEmpty())
        {
            throw new queueexception("Quee is empty");
        }
        return data[start];
    }

      public int last()
    {
       
        return data[end];
    }
    public void display()
    {
        if(isEmpty())
        {
           System.out.println("Empty");
           return; 
        }
        int i=start;
        do{
            System.out.print(data[i]+"->");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("End");
    }
}
