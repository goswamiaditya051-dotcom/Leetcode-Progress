class Solution {
    public int smallestIndex(int[] arr) {
        
        
        for(int i = 0; i<arr.length; i++)
        {   int sum = 0;
            int nums = arr[i];
            while(nums>0)
            {
                int lastDigit = nums%10;
                nums = nums/10;
                sum = sum+lastDigit;
            }
            if(sum==i)
            {
                return i;
            }
        }
        return -1;

    }
}