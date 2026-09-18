class Solution {
    public int maximumCount(int[] arr) {
        
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        int neg = 0;
        int pos = 0;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] <= 0) {
                i = mid + 1;
            } else if (arr[mid] > 0) {
                j = mid - 1;
                pos = n - mid;
            }
        }

        i = 0;
        j = n - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (arr[mid] < 0) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        neg = i;

        return Math.max(pos, neg);

    }
}