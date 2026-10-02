class Solution 
{
  public int findNumbers(int[] nums) 
  {
    int cnt1=0;
    for(int i=0;i<nums.length;i++)
    {
        int num=nums[i];
        int cnt=0;

        while(num!=0)
        {
             int digit=num%10;
            cnt++;
            num=num/10;
        }

        if (cnt%2==0)
        cnt1++;
    } 
    return cnt1;     
  }
}