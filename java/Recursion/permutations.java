package Recursion;
class permutations
{
   public static void main(String[] args) {
    int result=per("", "abc");
    System.out.println(result);
   }
   static int per(String p,String up)
   {
       
       if(up.isEmpty())
       {
        //    System.out.println(p);
           return 1;
        }
        int count=0;
    char ch=up.charAt(0);
    for(int i=0;i<=p.length();i++)
    {
        String f=p.substring(0, i);
        String s=p.substring(i, p.length());

       count=count+ per(f+ch+s, up.substring(1));
    }
    // System.out.println(count);
    return count;
   }
}