class Solution {
    public int compress(char[] arr) {
        
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        String s = new String(arr);
        
        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } 
            else 
            {
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
        if (length > 1)
        {
            sb.append(length);
        }

        String g = sb.toString();
        char brr[] = g.toCharArray();
        
        for(int k = 0; k<brr.length; k++)
        {
            arr[k] = brr[k];
        }
        return brr.length;
    }
}