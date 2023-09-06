package problems;

public class unique {
    public static void main(String[] args) {
        int[] arr={12,42,53,12,44,42,53};
        unique(arr);
    }
    private static void unique(int[] arr)
    {
        int unique=0;
        for(int a:arr)
        {
            unique^=a;
            
        }
        System.out.println(unique);
    }
}
