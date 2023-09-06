package problems;

public class powerof2_2 {
    //checks if the number is a power of 2 
    public static void main(String[] args) {
        int a=4;
        if(a>0)
        {
  boolean result=(a&(a-1))==0;
        System.out.println(result);
        }
        else{
            System.out.println(false);
        }
      

    }
}
