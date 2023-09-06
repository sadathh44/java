package problems;
//they gice you an array, sum of bits and then that number %3
public class magic_number {
    public static void main(String[] args) {
        int n=6;
        int base=5;
        int answer=0;
        while(n>0)
        {
           int last=n&1;
           n=n>>1; 
           answer+=last*base;
          base*=5;
        }
        System.out.println(answer);
       
    }
}
