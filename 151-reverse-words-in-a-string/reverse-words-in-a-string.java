class Solution {
    public String reverseWords(String s) {
        // Code to Remove the spaces from the String 

        StringBuilder clean = new StringBuilder();
        int c = 0;

        while (c < s.length()) {
            // Skip spaces
            while (c < s.length() && s.charAt(c) == ' ') {
                c++;
            }

            // If we reached the end, stop
            if (c == s.length())
                break;

            // Add a space BEFORE a new word,
            // but only if this isn't the first word
            if (clean.length() > 0) {
                clean.append(' ');
            }

            // Copy the word
            while (c < s.length() && s.charAt(c) != ' ') {
                clean.append(s.charAt(c));
                c++;
            }
        }

        // Code to reverse the String 
        StringBuilder sb = clean;
        sb.reverse();

        int i = 0;
        int j = 0;
        int n = sb.length();
        while (i < n && j < n) {
            if (sb.charAt(j) != ' ') {
                j++;
            } else {
                reverse(i, j - 1, sb);
                i = j + 1;
                j++;
            }
        }
        reverse(i, j - 1, sb);

        s = sb.toString();
        return s;

    }

    private static void reverse(int i, int j, StringBuilder sb) {
        while (i < j) {
            char tempi = sb.charAt(i);
            char tempj = sb.charAt(j);

            sb.setCharAt(i, tempj);
            sb.setCharAt(j, tempi);
            i++;
            j--;
        }
    }
}