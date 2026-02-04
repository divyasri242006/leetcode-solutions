// Last updated: 2/4/2026, 1:21:43 PM
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder curr,
                           int open, int close, int n) {

        // base case
        if (curr.length() == 2 * n) {
            result.add(curr.toString());
            return;
        }

        // add '(' if possible
        if (open < n) {
            curr.append('(');
            backtrack(result, curr, open + 1, close, n);
            curr.deleteCharAt(curr.length() - 1);
        }

        // add ')' if valid
        if (close < open) {
            curr.append(')');
            backtrack(result, curr, open, close + 1, n);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
