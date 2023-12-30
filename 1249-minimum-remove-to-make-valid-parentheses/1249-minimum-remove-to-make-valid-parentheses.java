class Solution {
    public String minRemoveToMakeValid(String s) {
        // set to keep track of index to remove
        Set<Integer> indexToRemove = new HashSet<>();
        // stack to keep track of the valid parathesis
        Deque<Integer> stack = new ArrayDeque<>();
        
        // loop through the string to scan the paratheses
        // this loop is the core idea of paratheses problem
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar == '(') {
                stack.push(i);
            } if (curChar == ')') {
                if (stack.isEmpty()) {
                    indexToRemove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        
        // stack is not empty, means that there're opened paratheses that didn't close. add its indeces
        while (!stack.isEmpty()) {
            indexToRemove.add(stack.pop());
        }
        
        // create the new string to remove the extra paratheses
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!indexToRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}