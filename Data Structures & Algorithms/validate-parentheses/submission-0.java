class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();        
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put(')', '(');
        parenthesesMap.put('}', '{');
        parenthesesMap.put(']', '[');
        for(char c: s.toCharArray()) {
            if(parenthesesMap.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() == parenthesesMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }    
        return stack.isEmpty();
    }
}
