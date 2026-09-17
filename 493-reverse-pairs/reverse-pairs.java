class Solution {
    static int pairs;
    public int reversePairs(int[] arr) {
        pairs = 0;
        mergeSort(arr);
        return pairs;
    }
    public long countPairs(int[]arr,int[]brr){
        
        long count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int j = 0;
            while(j<brr.length && arr[i]>2L*brr[j])
            {
                j++;
            }
            count+=j;
        }
        return count;
    }
    public int []mergeSort(int[]arr){
        int n = arr.length;
        if(n==1) return arr;

        int[]a = new int[n/2];
        int[]b = new int[n-n/2];
        int idx = 0;
        for(int i = 0; i<a.length; i++){
            a[i] = arr[idx++];
        }
        for(int j = 0; j<b.length; j++)
        {
            b[j] = arr[idx++];
        }

        mergeSort(a);
        mergeSort(b);

        pairs += countPairs(a,b);
        merge(a,b,arr);


        return arr;
    }
    public int[] merge(int[]a,int[]b,int[]c){
        
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<a.length && j<b.length){
            if(a[i]>b[j])
            {
                
                c[k] = b[j];
                j++;
                k++; 
                
            }
            else{
                c[k] = a[i];
                i++;
                k++;
            }
        }

        while(i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        

        return c;

    }
}