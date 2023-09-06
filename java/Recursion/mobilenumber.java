class Solution {
    public List<String> letterCombinations(String digits) 
    {
       if(digits.isEmpty())
       {
           return new ArrayList<>();
       }
    return pad("",digits);
    }
     public ArrayList<String> pad(String p,String up)
      {
        if(up.isEmpty())
        {
            ArrayList<String> base=new ArrayList<>();
            base.add(p);
            return base;
        }
         int number=up.charAt(0)-'0'; //this will convert numbers ascii to actual number
        ArrayList<String> base=new ArrayList<>();
        if(number<=1 || number>9)return base;
        if(number<=6)
        {
         for(int i=(number-2)*3;i<(number-1)*3;i++)
        {
            char ch=(char)('a'+i);
            base.addAll(pad(p+ch,up.substring(1)));
        }
        }else{
            if(number==7)
            {
                for(int i=(number-2)*3;i<=(number-1)*3;i++)
                {
                    char ch=(char)('a'+i);
                    base.addAll(pad(p+ch,up.substring(1)));
                }
            }
            else if(number==8)
            {
                for(int i=(number-2)*3+1;i<=(number-1)*3;i++)
                    {
                    char ch=(char)('a'+i);
                    base.addAll(pad(p+ch,up.substring(1)));
                    }
            }
            else
            {
                for(int i=(number-2)*3+1;i<=(number-1)*3+1;i++)
                    {
                    char ch=(char)('a'+i);
                    base.addAll(pad(p+ch,up.substring(1)));
                    } 
            }
            
        }
        return base;
    }
}