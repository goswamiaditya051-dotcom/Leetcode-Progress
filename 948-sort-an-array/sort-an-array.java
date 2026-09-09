class Solution {
    public int[] sortArray(int[] arr) {
        int length = arr.length;
        if(length==1) return arr;
        int[]brr = new int[length/2];
        int[]crr = new int[length-length/2];
        int idx = 0;
        for(int i = 0; i<brr.length; i++)
        {
            brr[i] = arr[idx++];
        }
        for(int j = 0; j<crr.length; j++)
        {
            crr[j] = arr[idx++];
        }
        sortArray(brr);
        sortArray(crr);
        merge(brr,crr,arr);

        return arr;
    
    }
    public int[] merge(int[]arr,int[]brr,int[]crr)
    {
        int m = arr.length;
        int n = brr.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n)
        {
            if(arr[i]<brr[j])
            {
                crr[k] = arr[i];
                i++;
            }
            else
            {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            crr[k] = arr[i];
            i++;
            k++;
        }
        while(j<n)
        {
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;
    }
}