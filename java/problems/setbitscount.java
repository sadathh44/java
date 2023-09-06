package problems;

public class setbitscount {
    public static void main(String[] args) {
        int a=5;
        int count=0;
        //right most set bit a&(-n)
        while(a>0)
        {
            if((a&1)==1)
            {
                count++;
            }
            a=a>>1;
        }
        System.out.println(count);
    }
}
