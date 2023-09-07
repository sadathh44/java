package practice;
import java.util.ArrayList;
public class pro1<S> {
    S a;
    pro1(S obj)
    {
        this.a=obj;
    }
    static void display(int a,int b)
    {
        System.out.println(a+b);
    }
 
    public S getValue()
    {
        return a;
    }
    public static <t> void generic(t element)
    {
        System.out.println(element);
    }
   public static void main(String[] args) {
    pro1<String> obj=new pro1<>("Sadath");
    ArrayList list=new ArrayList<>();
    list.add(12);
    list.add("ASda"); 
       System.out.println(list.get(1));
    
    System.out.println(obj.getValue());
    generic("Sadathhusasin");
    generic(10);
    Object[] data;
   }

}
