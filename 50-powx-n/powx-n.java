class Solution {
    public double myPow(double a, long b) {
        if(b==0) return 1;
        // boolean flag = true;
        if(b<0)
        {
            double call  = myPow(a,Math.abs(b)/2);

            if(b%2==0)
            {
                double ans = 1/(call * call);
                return ans;
            }
            else{
                double ans = 1/(call * call * a);
                return ans;
            }
        }
        else{
            double call = myPow(a,(long)b/2);
            if(b%2==0) {
                
                return call * call;
            }
            else {
                return call * call *a;
            }
        }
    }
}