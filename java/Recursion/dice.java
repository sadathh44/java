// package Recursion;
// //mobile number combinations
// public class dice {
//     static void pad(String p,String up)
//     {
//         if(up.isEmpty())
//         {
//             System.out.println(p);
//             return;
//         }
//          int number=up.charAt(0)-'0'; //this will convert numbers ascii to actual number
//          for(int i=(number-1)*3;i<number*3;i++)
//     {
//         char ch=(char)('a'+i);
//         pad(p+ch,up.substring(1));
//     }
//     }
//  public static void main(String[] args) {
//     //ascii value of zero is 48
//         pad("","12");
//  }   
// }

package Recursion;
//mobile number combinations
import java.util.*;
public class dice {
    static ArrayList<String> pad(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> base=new ArrayList<>();
            base.add(p);
            return base;
        }
         int number=up.charAt(0)-'0'; //this will convert numbers ascii to actual number
        ArrayList<String> base=new ArrayList<>();

         for(int i=(number-1)*3;i<number*3;i++)
        {
            char ch=(char)('a'+i);
            base.addAll(pad(p+ch,up.substring(1)));
        }
        return base;
    }
 public static void main(String[] args) {
    //ascii value of zero is 48
        System.out.println(pad("","12"));
 }   
}
