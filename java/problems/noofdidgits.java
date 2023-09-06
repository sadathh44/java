package problems;

public class noofdidgits {
    public static void main(String[] args) {
        int a=3;
        int count=0;
        while(a>0)
        {
            a=a>>1;
            count++;
        }
        System.out.println(count);
    }
}
