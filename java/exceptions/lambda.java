package exceptions;

public class lambda implements printable{
    public void display()
    {
    }
    
    static void print(printable a)
    {
        a.display();
    }
    public static void main(String[] args) {
        lambda a=new lambda();
      //  a.display();
        print(a);
        print(()->{
            System.out.println("helo");
        });
        
    }

    
}
