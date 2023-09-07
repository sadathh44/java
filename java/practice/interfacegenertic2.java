package practice;

public class interfacegenertic2 implements interfacegeneric<Integer>{
    @Override
    public void display(Integer value)
    {
        System.out.println(value);
    }
    public static void main(String[] args) {
        interfacegenertic2 a=new interfacegenertic2();
        a.display(12);
    }
}
