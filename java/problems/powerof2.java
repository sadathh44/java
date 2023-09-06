package problems;

public class powerof2 {
    public static void main(String[] args) {
        int a=4;
        int count=0;
        while(a>0)
        {
            if((a&1)==1)
            {
                count++;
            }
            a=a>>1;
        }
        if(count==1)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
