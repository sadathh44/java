class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
          if(nums[i]!=i+1)
          {
              int correct=nums[i]-1;
              if(nums[i]!=nums[correct])
                {
                      int temp=nums[i];
                      nums[i]=nums[correct];
                      nums[correct]=temp;
                }  
          else
          {

              return nums[i];
          }
        }
        else
        {i++;
        }
  
      }
      return -1;
    }
}

//all duplicates

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> d=new ArrayList<>();
      int i=0;
      while(i<nums.length)
      {
        int correct=nums[i]-1;
        if( nums[i]!=nums[correct])
        {
          int temp=nums[i];
          nums[i]=nums[correct];
          nums[correct]=temp;
        }
        else{
          i++;
        }
      }
    for(int j=0;j<nums.length;j++)
    {
      if(nums[j]!=j+1)
      {
        d.add(nums[j]);
      }
    }
      return d; 
    }
}
   