class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] t1 =s.toCharArray();
        char[] t2 =t.toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);

        for(int i = 0; i<s.length(); i++)
        {
            if(t1[i]!=t2[i])
            {
                return false;
            }
        } 
        return true;
    }
}