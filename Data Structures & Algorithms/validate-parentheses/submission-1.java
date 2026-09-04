class Solution {
   public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();        
        for(char c: s.toCharArray()) {
            char match = matchFor(c);
            if(match != 0) {
                if(!stack.isEmpty() && stack.peek() == match) {
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

    private char matchFor(char c) {
        return switch (c) {
            case ')' -> '(';
            case '}' -> '{';
            case ']' -> '[';
            default  -> 0;
        };
    }
}
