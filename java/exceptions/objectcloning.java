package exceptions;

import java.util.Arrays;

public class objectcloning implements Cloneable {
    int a,b;
    int arr[];
    String name;
    public  objectcloning(int a,int b,String sam)
    {
        this.a=a;
        this.b=b;
        this.arr=new int[]{12,4233,13};
        this.name=sam;
    }
    public objectcloning(objectcloning obj)
    {
        //creates only shallow copy
        this.a=obj.a;
        this.b=obj.b;
      //  this.arr=obj.arr; //shallow copy
      //thie below is deep copy
        this.arr=new int[obj.arr.length];
         for(int i=0;i<obj.arr.length;i++)
        {
            this.arr[i]=obj.arr[i];
        }
    }
  
    public Object clone() throws CloneNotSupportedException
    {
        //shallow copy
       // return super.clone();

        //deep copy
        objectcloning obj4=(objectcloning)super.clone(); //this is shallow copy
        obj4.arr=new int[obj4.arr.length];
        for(int i=0;i<obj4.arr.length;i++)
        {
            obj4.arr[i]=this.arr[i];
        }
        return obj4;
    }
    
   


    public static void main(String[] args) throws CloneNotSupportedException{
        objectcloning obj1=new objectcloning(15,16,"sadath");
        objectcloning obj2=new objectcloning(obj1);//one of the methods to clone
        objectcloning obj3=(objectcloning)obj1.clone(); //second method to clone
        System.out.println(obj3.a);
        obj1.arr[1]=1123;
        System.out.println(Arrays.toString(obj3.arr));
        System.out.println(obj3.name);
        System.out.println(Arrays.toString(obj2.arr));
        
       
    }
}
