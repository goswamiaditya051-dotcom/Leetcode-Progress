class Solution {
    public String capitalizeTitle(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int k = 0; k < s.length(); k++) {
            char ch = sb.charAt(k);
            if (ch >= 65 && ch <= 90) {
                char dh = (char) (ch + 32);
                sb.setCharAt(k, dh);
            }
        }

        int i = 0;
        int j = 0;

        while (i < sb.length() && j < sb.length()) {
            if (sb.charAt(j) != ' ') {
                j++;
            } else {
                int length = j - i;
                if (length == 1 || length == 2) {
                    char ch = sb.charAt(i);
                    if (ch >= 65 && ch <= 90) {
                        char dh = (char) (ch + 32);
                        sb.setCharAt(i, dh);
                    }
                    i = j + 1;
                    j++;

                }

                else {
                    char ch = sb.charAt(i);
                    char dh = (char) (ch - 32);
                    sb.setCharAt(i, dh);
                    i = j + 1;
                    j++;
                }
            }
        }

        int length = j - i;
        if (length == 1 || length == 2) 
        {
            char ch = sb.charAt(i);
            if (ch >= 65 && ch <= 90) {
                char dh = (char) (ch + 32);
                sb.setCharAt(i, dh);
            }
            i = j + 1;
            j++;
        }
        else{
        char ch = sb.charAt(i);
        char dh = (char) (ch - 32);
        sb.setCharAt(i, dh);
        i = j + 1;
        j++;
        }

        return sb.toString();
    }
}