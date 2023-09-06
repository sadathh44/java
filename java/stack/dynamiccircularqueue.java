package stack;
public class dynamiccircularqueue extends circularqueue{
    public dynamiccircularqueue()
    {
        super();
    }
    public dynamiccircularqueue(int size)
    {
        super(size);
    }
    public boolean push(int item)
    {
        if(this.isFull())
        {
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[(start+i)%data.length];
            }
            start=0;
            end=data.length;
            data=temp;

        }
        return super.insert(item);
    }

    
}
