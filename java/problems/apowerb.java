package problems;

public class apowerb {

    //efficient in log(b) form
    public static void main(String[] args) {
       int base=3;
       int power=2;
       int result=1;
       while(power>0)
       {
        if((power&1)==1)
        {
            result*=base;
        }
        base*=base;
        power=power>>1;
       }
       System.out.println(result);
    }

}
