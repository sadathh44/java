package problems;

public class ithbit {
    public static void main(String[] args) {
        int n=3;
        int num=24;
        int mul=1<<(n-1);

        
        System.out.println(num|mul);
        System.out.println(num&~mul);
        

        //& to check the bit or return the bit
        // | to set the bit
        //&~ used to unset the bit
    }
}
