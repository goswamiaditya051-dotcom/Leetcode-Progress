class Solution {
    public int[] sortArray(int[] arr) {
        
        if(arr.length==1) return arr;

        int n = arr.length;

        int[]a = new int[n/2];
        int[]b = new int[n-n/2];

        int idx = 0;

        for(int i = 0; i<a.length; i++)
        {
            a[i] = arr[idx++];
        }

        for(int i = 0; i<b.length; i++)
        {
            b[i] = arr[idx++];
        }

        sortArray(a);
        sortArray(b);
        merge(a,b,arr);
        return arr;
    }
    public static int[] merge(int[]left,int[]right,int[]arr)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length )
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            arr[k] = right[j];
            j++;
            k++;
        }

        return arr;
    }
}