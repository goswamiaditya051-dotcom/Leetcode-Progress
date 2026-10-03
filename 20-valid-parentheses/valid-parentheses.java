class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                char open = st.peek();
                if(isvalidpair(open,ch))
                {
                    st.pop();
                }
                else return false;
            }
        }
        if(st.size()==0) return true;
        return false;
    }
    public static boolean isvalidpair(char open,char close){
        if(open=='(' && close ==')') return true;
        if(open=='{' && close =='}') return true;
        if(open=='[' && close ==']') return true;
        return false;
    }
}