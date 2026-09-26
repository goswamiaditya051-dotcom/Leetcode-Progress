class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int n = s.length();
        int i = 0;
        int j = n-1;

        // s = s
       
        while(i<j)
        {
            
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}