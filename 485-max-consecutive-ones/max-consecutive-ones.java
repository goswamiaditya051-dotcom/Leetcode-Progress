class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count = 0;

        int max = 0;

        for(int i = 0; i<n; i++)
        {
            if(arr[i]==1)
            {
                count++;
                if(count>max)
                {
                    max = count;
                } 
            }
            else
            {
                count  = 0;
            }
        }
        return max;

    }
}