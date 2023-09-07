package practice;
import java.util.Arrays;
import java.util.List;
 //generics
class pro2<t> {
    public static void main(String[] args)
    {
        pro2<String> a=new pro2<>();
 
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
 
        // printing the sum of elements in list
       // System.out.println("Total sum is:" + sum("india"));
 
        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
 
        // printing the sum of elements in list
      // sum(list1);
      //  display("sadath");
        display(11);
        a.sum("SAdatg");
    }
    
    public   void sum(t a)
    {
        
        

       System.out.println(a);
    }
    public static<t extends Integer> void display(t objs)
    {
        System.out.println(objs);
    }
}