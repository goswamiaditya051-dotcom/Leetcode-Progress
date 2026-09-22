class Solution {
    public int reverse(int x) {
        
        long reverse = 0;
        long lastDigit = 0;

        while(x!=0)
        {
            lastDigit = x%10;
            x = x/10;
            reverse = reverse*10+lastDigit;
        }
        if(reverse > Integer.MAX_VALUE) return 0;
        if(reverse < Integer.MIN_VALUE) return 0;
        return (int)reverse;

    }
}