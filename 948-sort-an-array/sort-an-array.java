class Solution {
    public int[] sortArray(int[] arr) {
        int n = arr.length;
        if(n==1) return arr;
        int[]brr = new int[n/2];
        int[]crr = new int[n-n/2];
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
    public static int []merge(int[]left,int[]right,int[]crr){
        int i = 0; int j = 0; int k = 0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                crr[k] = left[i];
                i++;
            }
            else{
                crr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            crr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            crr[k] = right[j];
            j++;
            k++;
        }
        return crr;
    }
}