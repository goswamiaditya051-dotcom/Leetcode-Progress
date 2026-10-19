class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        merge(arr);

        List<Integer> list  = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i<n; i++)
        {
            if(arr[i]==target)
            {
                list.add(i);
            }
        }
        return list;

    }
    public static int[] merge(int[]arr){
        if(arr.length==1) return arr; 
        int n = arr.length;
        int[]a = new int[n/2];
        int[]b = new int[n-n/2];
        int idx = 0;

        for(int i = 0; i<a.length; i++)
        {
            a[i] = arr[idx];
            idx++;
        }

        for(int j = 0; j<b.length; j++)
        {
            b[j] = arr[idx];
            idx++;
        }
        merge(a);
        merge(b);
        mergeSort(a,b,arr);
        return arr;
    }
    public static int[]mergeSort(int[]left,int[]right,int[]arr)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length)
        {
            if(left[i] < right[j])
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
        while(j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
}