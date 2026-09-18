class Solution {
    public int compress(char[] arr) {
        int n = arr.length;

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();
        String s = new String(arr);

        while (i < n && j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                sb.append(s.charAt(i));
                int length = j - i;
                if (length > 1) {
                    sb.append(length);
                }
                i = j;
                j++;
            }
        }
        sb.append(s.charAt(i));
        int length = j - i;
        if (length > 1) {
            sb.append(length);
        }
        char[] brr = sb.toString().toCharArray();

        for (int k = 0; k < brr.length; k++) {
            arr[k] = brr[k];
        }

        return brr.length;

    }
}