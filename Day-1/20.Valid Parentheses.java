class Solution {
    public boolean isValid(String s) {

        char arr[]=s.toCharArray();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
            st.push(arr[i]);

            else
            {
            if(st.empty()) // if we encounter a closing bracket when stack is empty
            return false;

            char c=st.pop();
            if( (arr[i]==')' && c=='(') || (arr[i]==']' && c=='[') || (arr[i]=='}' && c=='{'))
            continue;

            else
            return false;
            }
        }
        
        if(st.empty())
            return true;
            else
            return false;
    }
}
