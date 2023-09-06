package problems;
class happy_number {
    public boolean isHappy(int n) {
       
       int slow=n;
       int fast=n;
       do
       {
           slow=sum(slow);
           fast=sum(sum(fast));
       }while(slow!=fast);

       if(slow==1)
       {
           return true;
       }
       return false;
      
    }
    public int sum(int num)
    {
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum+=rem*rem;
            temp/=10;
         
        }
        return sum;
    }

}