package stack;

public class queuepro {

    protected int[] data;
    private static final int default_size=10;
    protected int end=-1;
    public queuepro()
    {
        this(default_size);
    }

    public queuepro(int size)
    {
        this.data=new int[size];
    }

    public boolean insert( int val)
    {
        if(isFull())
        {
            System.out.println("queue is full");
            return false;
        }
        end++;
        data[end]=val;
        return true;
    }
    public int remove() throws queueexception
    {
        if(isEmpty())
        {
            throw new queueexception("Cannot pop further");
        }
        int removed=data[0];
        for(int i=1;i<data.length;i++)
        {
            data[i-1]=data[i];
        }
        return removed;
    }
    public int front() throws queueexception
    {
        if(isEmpty())
        {
            throw new queueexception("Queue is empty");
        }
        return data[0];
    }

      public int last()
    {
       
        return data[end];
    }
    public void display()
    {
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }
    public boolean isFull()
    {
        return end==data.length-1;
    }
    public boolean isEmpty()
    {
        return end==-1;
    }
}
