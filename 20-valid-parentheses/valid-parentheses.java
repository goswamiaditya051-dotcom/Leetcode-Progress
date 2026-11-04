class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        // push openeing brackets onto the stack

        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                st.push(ch);
                
            }
            
            else{
                if(st.size()==0) return false;
                char dh = st.peek();
                if(isValidPair(dh,ch))
                {
                    st.pop();
                }
                else return false;
            }
        }
        if(st.size()==0) return true;
            return false;
    }
    public static boolean isValidPair(char a,char b){
        if(a=='(' && b== ')') return true;
        if(a=='[' && b== ']') return true;
        if(a=='{' && b== '}') return true;
        return false;
    }
}