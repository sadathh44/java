package problems;

public class prime_numbers {
    public static void main(String[] args) {
       int n=45;
       for(int i=2;i<=n;i++)
       {
        if(isprime(i))
        System.out.println(i);
       }
        
    }
    public static boolean isprime(int n)
    {
         if(n<=1)
        {
           return false;
        }
        int c=2;
        while(c*c<=n)
        {
                if(n%c==0)
                {
                        return false;
                }
                c++;
        }
        return true;
    }
}
