class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(st.size()!=0 && st.peek()==ch)
            {
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

    
        while(st.size()!=0)
        {
            sb.append(st.pop());
        }
        sb.reverse();
        s = sb.toString();
        return s;
    }
}