package problems;

public class gcd {
    public static int gcd_lcm(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd_lcm(b%a, a);
    }
   public static void main(String[] args) {
    int a=20,b=30;
    int result=gcd_lcm(a, b);
    System.out.println(a*b/result);
   } 
}
