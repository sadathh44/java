package stack;

public class queuemain {
    public static void main(String[] args) throws queueexception{
        circularqueue obj=new circularqueue(5);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.display();
        obj.remove();
        obj.insert(22);
        obj.display();
        obj.insert(122);
      
    }
}
