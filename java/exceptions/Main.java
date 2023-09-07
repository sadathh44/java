package exceptions;

public class Main {
    public static void main(String[] args) {
       ;
        int a=5;
        int b=0;
        try {
            //int result=divide(a,b);
            //System.out.println(result);
            throw new exceptions("sample excep");
        } 
        catch(exceptions e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException qw)
        {
            System.out.println(qw.getMessage());
        }
        
        catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
    static int divide(int a,int b) 
    {
        if(b==0)
        {
            throw new ArithmeticException("please dont divide by zero");
        }
        return a/b;
    }
}

// public class queueexception extends Exception{
//     public queueexception(String message)
//     {
//         super(message);
//     }
// }

