class Solution {
    public String removeStars(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        // s.toLowerCase();
        
        for(int i = 0; i<s.length(); i++)
        {
            
            char ch = s.charAt(i);
            if(st.size()>0 && ch=='*')
            {
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        Stack<Character> helper = new Stack<>();
        while(st.size()>0)
        {
            helper.push(st.pop());
        } 
        while(helper.size()>0)
        {
            sb.append(helper.pop());
        }
        s = sb.toString();
        return s;
        
    }
}