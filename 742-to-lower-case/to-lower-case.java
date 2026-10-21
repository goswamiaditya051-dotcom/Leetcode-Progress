class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i<s.length(); i++)
        {
            char ch = sb.charAt(i);
            if( ch >=65 && ch <=90 )
            {
                char dh = (char)(ch+32);
                sb.setCharAt(i,dh);
            }
        }

        return sb.toString();

    }
}