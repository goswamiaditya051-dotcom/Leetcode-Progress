class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n-1;

        reverse(i,j,s);
    }

    private static void reverse(int i,int j,char[] s){
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    
    }
}