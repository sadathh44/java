package problems;

public class sum {
    public static void main(String[] args) {
        int[] arr={12,42};
        int a=13;
        int b=5;
        System.out.println(a|b);
        
    }
    private static void unique(int[] arr)
    {
        int unique=0;
        for(int a:arr)
        {
            unique=unique|a;
            
        }
        System.out.println(unique);
    }
}
