package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

//comparaable between two objects
public class pro3 implements Comparable<pro3>{
    int rollno;
    int marks;
    pro3(int rollno,int marks)
    {
        this.rollno=rollno;
        this.marks=marks;
    }

    public String toString()
    {
        return rollno+" and "+marks;
    }
   
    @Override
    public int compareTo(pro3 other)
    {
        int dif=(int)(this.marks-other.marks);
        return dif;
    }

    static void muiltiple(int i)
    {
        System.out.println(i*2);
    }
    public static void main(String[] args) {
        pro3 sadath=new pro3(90,124);
        pro3 hussain=new pro3(80,154);
        pro3[] list={sadath,hussain};
        int a[]=new int[]{12,4,21};
        int b[]=new int[]{12,4,21};
 ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<5;i++)
    {
        arr.add(i+1);
    }
    Consumer<Integer> multiple=(item)->System.out.println(item*2);
    arr.forEach(multiple);


    

      System.out.println(Arrays.toString(list));
         if(sadath.compareTo(hussain)<0)
        {
            System.out.println("hussain is more");
        }
        else{
            System.out.println("sadtah has more marks");
        }

      

    }
    static int sum(int a,int b)
    {
        return a+b;
    }
   
}


interface sadath
{
    int sums(int a,int b);
}
