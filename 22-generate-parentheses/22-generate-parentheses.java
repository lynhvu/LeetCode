class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    private static void backtrack(List<String> res, StringBuilder sb, int open, int close, int max) {
        if (open == max && close == max) {
            res.add(sb.toString());
            return;
        }
        if (open < max) {
            sb.append("(");
            backtrack(res, sb, open + 1, close, max);
            sb.setLength(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            backtrack(res, sb, open, close + 1, max);
            sb.setLength(sb.length() - 1);
        }
        
    }
}