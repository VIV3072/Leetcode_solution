class Solution {
    public boolean isValid(String k) {
        Stack<Character> s=new Stack<>();
        for(char c:k.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                s.push(c);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(c==')'&&s.peek()!='('){
                    return false;
                }
                 if(c=='}'&&s.peek()!='{'){
                    return false;
                }
                 if(c==']'&&s.peek()!='['){
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
        
    }
}