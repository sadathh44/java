package problems;

public class fibo_goldenroot {
    static int generate(int n)
    {
        int result=(int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        return result;
    }
    public static void main(String[] args) {
      int n=3;
      System.out.println(generate(n));  
    }
}
