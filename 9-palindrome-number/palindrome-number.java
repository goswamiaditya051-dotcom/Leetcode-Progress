class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int a = x;
        
        int reverse = 0;
        int lastDigit = 0;

        while(x!=0)
        {   
            lastDigit = x%10;
            x = x/10;
            reverse = reverse*10+lastDigit;   
        }
        
        if(a==reverse) return true;
        
        return false;
    }
}