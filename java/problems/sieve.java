package problems;

public class sieve {
    //time complexity : O(n*log(logn))
     public static void sample(int n,boolean[] prime)
     {  
        for(int i=2;i*i<=n;i++)
        {
            if(!prime[i])
            {
                for(int j=2;j<=n;j=j+i)
                {
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(!prime[i])
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
     }
     public static void main(String[] args) {
        int n=45;
        boolean[] arr=new boolean[n+1];
        sample(n,arr);
     }
}
