class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++)
        {
            
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
            st.push(ch);
            }
            else{
                // ch is a closing bracket 
                if(st.size()==0) return false;
                char open = st.peek();
                if(isvalidpair(open,ch)) st.pop();
                else return false;
            }
            
        }
        if(st.size()>0) return false;
        else return true;
        
    }
    public static boolean isvalidpair(char open,char closing){
        if(open=='(' && closing==')') return true;
        if(open=='[' && closing==']') return true;
        if(open=='{' && closing=='}') return true;
        return false;
    }
}