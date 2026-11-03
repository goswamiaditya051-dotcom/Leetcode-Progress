class Solution {
      public int[] sortArray(int[] arr) {
        int n = arr.length;
        // Fix 1: Handle both empty arrays and single-element arrays
        if (n <= 1) return arr; 
        
        int idx = 0;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = arr[idx++];
        }
        
        sortArray(a);
        sortArray(b);
        merge(a, b, arr);

        return arr;
    }

    public static int[] merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        // Fix 2: Changed from 'if' to 'while' to safely copy all remaining elements
        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
        
        return arr;
    }
}