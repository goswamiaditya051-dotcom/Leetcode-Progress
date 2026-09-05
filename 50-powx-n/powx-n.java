class Solution {
    public double myPow(double a, long b) {
        if(b==0) return 1;
        if(b<0)
        {
            b = Math.abs(b);
            double call1 = myPow( a, b/2);
            if(b%2==0)
            {
                return 1/(call1 * call1);
            }
            else
            {
                return 1/(call1 * call1*a);
            }
        }
        else{
            double call = myPow(a,b/2);
            if(b%2==0)
            {
                return call * call;
            }
            else{
                return call * call * a;
            }
        }
    }
}