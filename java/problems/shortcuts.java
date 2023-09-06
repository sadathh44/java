package problems;

public class shortcuts {
   public static void main(String[] args) {
    int length=String.valueOf(124).length();
    int length2=(int)(Math.log10(124)+1);
    int n=1245;
    int b=10;
    int answer=(int)(Math.log(n)/Math.log(b))+1;
    System.out.println(answer);
    System.out.println(length);
    System.out.println(length2);

    int n1=8;
    int b1=2;
        int answer1=(int)(Math.log(n1)/Math.log(b1))+1;
        System.out.println(answer1);

   } 
}
