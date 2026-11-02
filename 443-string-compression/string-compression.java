class Solution {
    public int compress(char[] arr) {

        int n = arr.length;
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                int length = j - i;
                sb.append(arr[i]);
                if (length > 1) {
                    sb.append(length);
                }
                i = j;
                j++;
            }
        }
        int length = j - i;
        sb.append(arr[i]);
        if (length > 1) {
            sb.append(length);
        }
        i = j;
        j++;

        char result[] = sb.toString().toCharArray();
        for(int k = 0; k<result.length; k++)
        {
            arr[k] = result[k];
        }
        return result.length;
    }
}